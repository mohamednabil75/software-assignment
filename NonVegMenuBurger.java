class NonVegMenuBurger implements NonVegMenu{
    private Object[][] nonVegBurgers = {
    {"Chicken Burger", 80},
    {"Beef Burger", 90},
    {"Crispy Chicken Burger", 85},
    {"Spicy Chicken Burger", 88}
};

    public void display(){
      int count=0;  
        for(Object[] pizza : nonVegBurgers) {
           System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
           count++;
        }

    };
    public String orderdesc(int n){
        Object[] description=nonVegBurgers[n];
        return description[0].toString();
    };

    public float cost(int n){
        Object[] description=nonVegBurgers[n];
        return ( (Number) description[1]).floatValue();
    };
    
}