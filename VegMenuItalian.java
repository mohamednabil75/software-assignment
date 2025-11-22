class VegMenuItalian implements VegMenu{
    Object[][] italianVegPizzas = {
    {"Margherita Pizza", 130},
    {"Four Cheese Pizza", 160},
    {"Veggie Delight Pizza", 140},
    {"Paneer Tikka Pizza", 145}
    };

    public void display(){
        int count=0;  
       for(Object[] pizza : italianVegPizzas) {
        System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
        count++;
    }

    };
    public String orderdesc(int n){
        Object[] description=italianVegPizzas[n];
        return description[0].toString();
    };
    public float cost(int n){
        Object[] description=italianVegPizzas[n];
        return ( (Number) description[1]).floatValue();
    };

}