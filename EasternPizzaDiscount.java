public class EasternPizzaDiscount implements Discount {
    public void applyDiscount() {
        System.out.println("Chicken Discount Applied");
    }

    public float calcDiscount(float price) {
        // System.out.println("Chicken Discount Calculated");
        return ((Number)(0.8*price)).floatValue();
    }

}
