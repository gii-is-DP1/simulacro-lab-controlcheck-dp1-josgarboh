package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	//Guardamos como variable y luego @Autowired
	
	private ProductRepository pr;
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.pr = productRepository;
	}
	
    public List<Product> getAllProducts(){
        return pr.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) {
        return pr.findByPriceLessThan(price);
    }

    public ProductType getProductType(String typeName) {
        return pr.getProductType(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}
