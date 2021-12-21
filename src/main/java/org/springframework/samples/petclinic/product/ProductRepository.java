package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface ProductRepository extends CrudRepository<Product, Integer>{
    List<Product> findAll();
    
    @Query("SELECT types FROM ProductType types")
    List<ProductType> findAllProductTypes();
    
    
    @Query("SELECT pt FROM ProductType pt WHERE pt.name =:name")
    ProductType getProductType(@Param("name") String name);
    
    @Query("SELECT prods FROM Product prods WHERE prods.price<:limite")
    List<Product> findByPriceLessThan(@Param("limite") Double limite);
    
    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);
}
