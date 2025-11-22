class Decorator{
    protected Menu menu;
    Decorator(Menu menu){
        this.menu=menu;
    }
     String orderdesc(int n){return menu.orderdesc(n);};
     float cost(int n){return menu.cost(n);};


}