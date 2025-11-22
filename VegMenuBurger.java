class VegMenuBurger implements VegMenu{
    private Object[][] vegBurgers = {
    {"Veggie Burger", 50},
    {"Paneer Burger", 60},
    {"Veggie Masala Burger", 55},
    {"Falafel Burger", 70}
    };

    public void display(){      
        int count=0;  
        for(Object[] pizza : vegBurgers) {
            System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
            count++;
    }

    };
    public String orderdesc(int n){
        Object[] description=vegBurgers[n];
        return description[0].toString();
    };
    public float cost(int n){
        Object[] description=vegBurgers[n];
        return ( (Number) description[1]).floatValue();
    };

}