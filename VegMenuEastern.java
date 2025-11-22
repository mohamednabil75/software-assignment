class VegMenuEastern implements VegMenu{
    Object[][] easternVegPizzas = {
    {"Falafel Pizza", 100},
    {"Zaatar & Cheese Pizza", 105},
    {"Veg Shawarma Pizza", 110},
    {"Paneer Tikka Pizza", 115}
    };

    public void display(){
        int count=0;  
        for(Object[] pizza : easternVegPizzas) {
         System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
         count++;
        }

    };
    public String orderdesc(int n){
        Object[] description=easternVegPizzas[n];
        return description[0].toString();
    };

    public float cost(int n){
        Object[] description=easternVegPizzas[n];
        return ( (Number)description[1]).floatValue();
    };
    
}