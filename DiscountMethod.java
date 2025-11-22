class DiscountMethod{
    Discount dis;

    public DiscountMethod() {}
    
    DiscountMethod(Discount dis){
        this.dis=dis;
    }
    public float calcDiscount(float price){
        return dis.calcDiscount(price);
    }
}