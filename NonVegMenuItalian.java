class NonVegMenuItalian implements NonVegMenu{
    Object[][] italianNonVegPizzas = {
    {"Pepperoni Pizza", 150},
    {"Italian Sausage Pizza", 155},
    {"Chicken Supreme Pizza", 160},
    {"Meat Lovers Pizza", 165}
};

    public void display(){
        int count=0;  
        for(Object[] pizza : italianNonVegPizzas) {
            System.out.println(count+"-"+pizza[0] + " - $" + pizza[1]);
            count++;
        }

    };
    public String orderdesc(int n){
        Object[] description=italianNonVegPizzas[n];
        return description[0].toString();
    };
 
    public float cost(int n){
        Object[] description=italianNonVegPizzas[n];
        return ( (Number) description[1]).floatValue();
    };
    
}