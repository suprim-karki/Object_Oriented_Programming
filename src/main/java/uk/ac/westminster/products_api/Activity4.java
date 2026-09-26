package uk.ac.westminster.products_api;

public class Activity4 {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1L, "Wireless Mouse", 24.99),
                new Product(2L, "27-inch Monitor", 249.99),
                new Product(3L, "USB-C Cable", 8.50),
                new Product(4L, "Mechanical Keyboard", 119.00)
        };
        double catalogueTotal = 0;

        for(int i=0; i<products.length; i++){
            catalogueTotal+=products[i].getPrice();

            if(products[i].getPrice()>100){
                System.out.println("Name: "+products[i].getName()+" ,Price: "+products[i].getPrice()+ ", -premium");
            }else{
                System.out.println("Name: "+products[i].getName()+" ,Price: "+products[i].getPrice()+ ", -standard");
            }
        }
    }
}