package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service 
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextID = 1L;
    
    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextID++);
        products.add(product);
        return product;
    }
}
