package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/customers")
public class CustomerController {
    
    @GetMapping("/{id}")
    public Customer getByID(@PathVariable Long id){
        Address address = new Address("Kupandole Street","Lalitpur", "44700");
        return  new Customer(id, "Suprim Karki", "shupreem1911@gmail.com", address);
    }
}
