public class ItalianPizzaDiscount implements Discount{
    public void applyDiscount() {
        System.out.println("Pizza Discount Applied");
    }

    public float calcDiscount(float price) {
        return ((Number)(0.75*price)).floatValue();
    }

}
