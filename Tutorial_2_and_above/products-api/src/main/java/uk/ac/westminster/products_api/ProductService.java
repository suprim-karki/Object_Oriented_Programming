package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;

@Service 
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextID = 1L;

    public ProductService(){
        products.add(new DigitalProduct(nextID++, "Clean Code (E-book)", 29.99, "/downloads/clean-code.pdf",4.2));

        products.add(new PhysicalProduct(nextID++,"27-inch Monitor", 249.99, 5.4,"61cm x 41cm x 18cm"));
    }
    
    public List<Product> getAllProducts(){
        return products;
    }

    public Optional<Product> getProductById(Long id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public Product addProduct(Product product){
        product.setId(nextID++);
        products.add(product);
        return product;
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
        .filter(p -> p.getName().contains(name))
        .toList();
    }
}
