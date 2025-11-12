class VegMenuBurger implements VegMenu{
    private String[] vegBurgers = {"Veggie Burger", "Paneer Burger", "Veggie Masala Burger", "Falafel Burger"} ;

    public void display(){
        System.out.println("VegMenuBurger");
    };
    public void order(int num){
        System.out.println("VegMenuItalian:order");
    };
    public void notifyOrder(){
        System.out.println("VegMenuItalian:");
    };

}