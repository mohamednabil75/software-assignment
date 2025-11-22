
class KidsMenuBurger implements KidsMenu{
    Object[][] kidsBurgers = {
    {"Kids Mini Chicken Burger", 40},
    {"Kids Mini Veggie Burger", 35},
    {"Kids Cheese Burger", 45}
};

    public void display(){
       int count=0; 
       for(Object[] pizza : kidsBurgers) {
         System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
         count++;
    }

    };
    public String orderdesc(int n){
        Object[] description=kidsBurgers[n];
        return description[0].toString();
    };
    public void notifyOrder(){
        System.out.println("NonVegMenuItalian:");
    };
    public float cost(int n){
        Object[] description=kidsBurgers[n];
        return ( (Number)description[1]).floatValue();
    };

    
}