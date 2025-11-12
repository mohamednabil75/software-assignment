class BurgerFactory implements CategoryFactory{
     public VegMenu getVegMenu(){
        return new VegMenuBurger();
     };
    public NonVegMenu getNonVegMenu(){
        return new NonVegMenuBurger();
        

    };
    public KidsMenu getKidsMenu(){
        return new KidsMenuBurger();
        

    };
 

}