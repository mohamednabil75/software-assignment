class KidsMenuItalian implements KidsMenu{ 
    Object[][] italianKidsPizzas = {
    {"Mini Margherita Pizza", 90},
    {"Mini Pepperoni Pizza", 95},
    {"Cheese Burst Mini Pizza", 100}
};
 
  public void display(){
        int count=0;
        for(Object[] pizza : italianKidsPizzas) {
             System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
             count++;
}

    };
    public String orderdesc(int n){
        Object[] description=italianKidsPizzas[n];
        return description[0].toString();
    };
    public void notifyOrder(){
        System.out.println("kidsMenuItalian:");
    };
    public float cost(int n){
        Object[] description=italianKidsPizzas[n];
        return ( (Number) description[1]).floatValue();
    };
}