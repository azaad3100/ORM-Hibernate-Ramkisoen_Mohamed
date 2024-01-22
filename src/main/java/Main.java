import configuration.JPAConfiguration;
import entity.*;
import jakarta.persistence.EntityManager;
import service.*;




public class Main {


    private static EntityManager entityManager = JPAConfiguration.getEntityManager();
    public static void main(String[] args) {
        entityManager.getTransaction().begin();
        MainMenuService.login();
    }
}
