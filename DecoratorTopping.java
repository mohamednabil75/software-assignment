class DecoratorTopping extends Decorator{
    DecoratorTopping(Menu menu){
        super(menu);
    }
    String orderdesc(int n){
        // menu.order();
        return menu.orderdesc(n)+"+ Topping";
    }
    float cost (int n){
        return menu.cost(n)+3;
    }
    }
    