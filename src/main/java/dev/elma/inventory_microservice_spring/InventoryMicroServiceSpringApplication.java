package dev.elma.inventory_microservice_spring;

import dev.elma.inventory_microservice_spring.entities.Product;
import dev.elma.inventory_microservice_spring.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
@AllArgsConstructor
public class InventoryMicroServiceSpringApplication implements CommandLineRunner {

    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(InventoryMicroServiceSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Oil","Boeuf","eggs").forEach(product->{
            Product product1 = Product.builder()
                    .name(product).price(Math.random()*10).quatity((int)(Math.random()*1000)).build();
            productRepository.save(product1);
        });
    }
}
