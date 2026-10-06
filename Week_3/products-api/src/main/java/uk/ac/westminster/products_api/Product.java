package uk.ac.westminster.products_api;

public class Product {
    
    private Long id;
    private String name;
    private double price;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { 
        return id; 
    }
    
    // After commenting getName, the name field disappeared in the response and no error was shown.
    // For a large project with several fields, it is difficult to notice it and I would use frontend to help me notice the missing fields.

    public String getName() { 
        return name; 
    }
    
    public double getPrice() { 
        return price; 
    }
}
