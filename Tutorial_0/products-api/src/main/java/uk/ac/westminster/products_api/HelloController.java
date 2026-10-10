package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boot!";
    }

    @GetMapping("/status")
    public String status(){
        return "API running -"+LocalDate.now().toString();
    }
}
