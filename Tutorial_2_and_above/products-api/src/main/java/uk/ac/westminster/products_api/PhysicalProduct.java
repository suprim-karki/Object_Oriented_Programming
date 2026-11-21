package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        // Capped at 20% because shipping is never discounted.
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
}

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg=weightKg;
        this.dimensions=dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }
    
    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName() + " | Weight: " + weightKg + " kg";
    }

}
