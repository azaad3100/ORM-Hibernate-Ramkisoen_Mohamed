import configuration.JPAConfiguration;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashMap;
import java.util.Map;

    @ApplicationPath("/sales")
    public class ApplicationConfig extends Application {

        @Override
        public Map<String, Object> getProperties() {
            Map<String, Object> properties = new HashMap<String, Object>();
            properties.put("jersey.config.server.provider.packages", "controller");
            JPAConfiguration.getEntityManager();
            return properties;
        }
    }

