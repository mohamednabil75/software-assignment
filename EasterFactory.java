class EasternFactory implements CategoryFactory{
    
     public VegMenu getVegMenu(){
        return new VegMenuEastern();
     };
    public NonVegMenu getNonVegMenu(){
        return new NonVegMenuEastern();
        

    };
    public KidsMenu getKidsMenu(){
        return new KidsMenuEastern();
        

    };
 

}