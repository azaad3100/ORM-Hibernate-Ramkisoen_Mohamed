package service;

import configuration.JPAConfiguration;
import entity.Product;
import entity.Role;
import repository.ProductRepository;
import repository.RoleRepository;

public class ProductService {

    private ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository(JPAConfiguration.getEntityManager());
    }

    public Product createProduct(Product product){
        return productRepository.createProduct(product);
    }
}
