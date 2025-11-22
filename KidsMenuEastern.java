class KidsMenuEastern implements KidsMenu{
    Object[][] easternKidsPizzas = {
    {"Mini Chicken Pizza", 80},
    {"Mini Veggie Pizza", 75},
    {"Cheese Burst Mini Pizza", 85}
};

    public void display(){
      int count=0;  
      for(Object[] pizza : easternKidsPizzas) {
        System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
        count++;
        }

    };
    public String orderdesc(int n){
        Object[] description=easternKidsPizzas[n];
        return description[0].toString();
    };
    public void notifyOrder(){
        System.out.println("NonVegMenuItalian:");
    };
    public float cost(int n){
        Object[] description=easternKidsPizzas[n];
        return ( (Number) description[1]).floatValue();
    };
    
}