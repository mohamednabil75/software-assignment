class DecoratorChesse extends Decorator{
    DecoratorChesse(Menu menu){
        super(menu);
    }
    String orderdesc(int n){
        // menu.order();
        return menu.orderdesc(n)+"+ Chesse";
    }
    float cost (int n){
        return menu.cost(n)+2;
    }
    }
    
