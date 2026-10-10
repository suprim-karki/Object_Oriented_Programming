package uk.ac.westminster.products_api;

/*

What to do:

Step 1. In your Recap class, declare four variables of four different types.
Step 2. Write a method that takes the quantity and the unit price and returns the total.
Step 3. Print one line combining the name and the total.
Step 4. Break it on purpose: change the return type to int, read the error, then undo.

 */

public class Activity2 {
        public static void main(String[] args) {
            int quantity = 3;
            double unitPrice = 24.99;
            String name = "Wireless Mouse";
            boolean inStock = true;

            double total = calculateTotal(quantity, unitPrice);

            System.out.println(name+ " x "+quantity+" = "+total);
            System.out.println("In stock: "+inStock);
        }

        public static double calculateTotal(int qty, double unitPrice){
            return qty * unitPrice;
        }
    }


