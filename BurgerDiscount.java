public class BurgerDiscount implements Discount{
    public void applyDiscount() {
        System.out.println("Meat Discount Applied");
    }

    public float calcDiscount(float price) {
        return ((Number)(0.9*price)).floatValue();
    }

}
