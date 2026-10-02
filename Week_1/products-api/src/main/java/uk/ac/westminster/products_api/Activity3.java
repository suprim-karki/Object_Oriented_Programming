package uk.ac.westminster.products_api;

/*

Your goal: To loop over an array of products, total them up, and use a condition to treat some of them differently.
What to do:

Step 1. Declare two parallel arrays: product names, and their prices.
Step 2. Write a for loop that prints each name and price on its own line.
Step 3. Add a running total and print it after the loop.
Step 4. Add an if/else inside the loop that labels anything over 100.
Step 5. Break it on purpose: change < to <= in the loop condition.

 */
public class Activity3 {
    public static void main(String[] args) {
        String[] names  = { "Wireless Mouse", "27-inch Monitor", "USB-C Cable", "Mechanical Keyboard" };
        double[] prices = { 24.99, 249.99, 8.50, 119.00 };
        double catalogueTotal = 0;

        for(int i=0;i< names.length;i++){
            catalogueTotal+=prices[i];

            if(prices[i]>100){
                System.out.println("Name: "+names[i]+" , Price: "+prices[i]+" -premium");
            }else{
                System.out.println("Name: "+names[i]+" , Price: "+prices[i]+" -standard");
            }
        }
        System.out.println("\nCatalogue Total: "+catalogueTotal);
    }
}
