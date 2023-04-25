package dev.elma.inventory_microservice_spring.repositories;

import dev.elma.inventory_microservice_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
}
