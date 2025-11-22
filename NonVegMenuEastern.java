class NonVegMenuEastern implements NonVegMenu{
    Object[][] easternNonVegPizzas = {
    {"Chicken Shawarma Pizza", 120},
    {"Kofta Pizza", 130},
    {"Spicy Chicken Pizza", 125},
    {"Beef Kofta Pizza", 135}
};

    public void display(){
      int count=0;  
        for(Object[] pizza : easternNonVegPizzas) {
            System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
            count++;
        }

    };
    public String orderdesc(int n){
        Object[] description=easternNonVegPizzas[n];
        return description[0].toString();
    };

    public float cost(int n){
        Object[] description=easternNonVegPizzas[n];
        return ( (Number)description[1]).floatValue();
    };
    
}