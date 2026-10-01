package uk.ac.westminster.products_api;

public class Activity5 {

//    Here since Activity 5 is continuation of Activity 4, activity 4 is simply renamed and continued as Activity 5.

    // Finding most expensive product
    public static Product findMostExpensive(Product[] catalogue){
        Product dearest = catalogue[0];
        for(int i=1; i<catalogue.length; i++){
            if (catalogue[i].getPrice() > dearest.getPrice()){
                dearest= catalogue[i];
            }
        }
        return dearest;
    }

    public static void main(String[] args) {
        Product[] catalogue = {
                new Product(1L, "Wireless Mouse", 24.99),
                new Product(2L, "27-inch Monitor", 249.99),
                new Product(3L, "USB-C Cable", 8.50),
                new Product(4L, "Mechanical Keyboard", 119.00)
        };
        double catalogueTotal = 0;

        for(int i=0; i<catalogue.length; i++){
            catalogueTotal+=catalogue[i].getPrice();
            System.out.println(catalogue[i].describe());
        }
        System.out.println("\nCatalogue total: " + catalogueTotal);

        Product dearest = findMostExpensive(catalogue);

        System.out.println("Most expensive: " + dearest.getName());
    }
}