package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class InfoController {
    @GetMapping("/info")
    public String info(){
        return "This is a full stack project, which provides RESTful endpoints and is created by Suprim Karki, a student of The Westminster College affilated to University of Westminster, for Object Oriented Programming Course.";
    }
}
