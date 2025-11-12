class ItalianFactory implements CategoryFactory{
     public VegMenu getVegMenu(){
        return new VegMenuItalian();
     };
    public NonVegMenu getNonVegMenu(){
        return new NonVegMenuItalian();
        

    };
    public KidsMenu getKidsMenu(){
        return new KidsMenuItalian();
        

    };
 

}