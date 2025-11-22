class DecoratorSauce extends Decorator{
    DecoratorSauce(Menu menu){
        super(menu);
    }
    String orderdesc(int n){
        // menu.order();
        return menu.orderdesc(n)+"+ Sauce";
    }
    float cost (int n){
        return menu.cost(n)+1;
    }
    }
    