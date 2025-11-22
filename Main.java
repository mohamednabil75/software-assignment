import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Menu menu=null;
        Scanner scan=new Scanner(System.in);
        ArrayList<ArrayList<Object>> orders = new ArrayList<>();
        while(true){
         System.out.println("1-Eastern\n2-Italian\n3-Burger");
            int choice=scan.nextInt();
            int orderchoice;
            switch (choice) {
                case 1:
                    CategoryFactory eastern=new EasternFactory();
                    System.out.println("1-veg\n2-non-veg\n3-kids");
                    int choice2=scan.nextInt();
                    if(choice2==1){
                        menu=new VegMenuEastern();
                        menu.display();
                        }
                    if(choice2==2){
                        menu=new NonVegMenuEastern();
                        menu.display();
                        }
                    if(choice2==3){
                        menu=new KidsMenuEastern();
                        menu.display();
                        }

                    
                    break;
                case 2:
                    CategoryFactory Italian=new ItalianFactory();
                    System.out.println("1-veg\n2-non-veg\n3-kids");
                    choice2=scan.nextInt();
                    if(choice2==1){
                        menu=new VegMenuItalian();
                        menu.display();
                        }
                    if(choice2==2){
                        menu=new NonVegMenuItalian();
                        menu.display();
                        }
                    if(choice2==3){
                        menu=new KidsMenuItalian();
                        menu.display();
                        
                        }

                    
                    break;
                case 3:
                    CategoryFactory Burger=new BurgerFactory();
                    System.out.println("1-veg\n2-non-veg\n3-kids");
                    choice2=scan.nextInt();
                    if(choice2==1){
                        menu=new VegMenuBurger();
                        menu.display();
                    }
                    if(choice2==2){
                        menu=new NonVegMenuBurger();
                        menu.display(); 
                        }
                    if(choice2==3){
                        menu=new KidsMenuBurger();
                        menu.display();
                        }

                    
                    break;
                default:
                    throw new AssertionError();
                
            }
            //add decorator
            orderchoice=scan.nextInt(); 
            System.out.println("1)add chesse \n2)Sauce\n3)Topping\n4)just order without adds.\n");
            int choice1=scan.nextInt();
            Decorator finalorder;
            switch (choice1) {
                case 1:
                    finalorder=new DecoratorChesse(menu);
                    break;
                case 2:
                    finalorder=new DecoratorSauce(menu);
                    break;
                case 3:
                    finalorder=new DecoratorTopping(menu);
                    
                    break;
                case 4:
                finalorder=new Decorator(menu);
                 break;
                default:
                    throw new AssertionError();
            }
            //end of add decorator
            //payment
            //  Paymethod pay;
            ArrayList<Object> order=new ArrayList<>();
            ArrayList<Object> discounts=new ArrayList<>();
            order.add(finalorder.orderdesc(orderchoice));
            order.add(finalorder.cost(orderchoice));
            // DiscountMethod Discountmethod;
            //apply discount
            DiscountMethod discountmethod=null;
            float priceDiscount;
            if(menu instanceof VegMenuEastern || menu instanceof NonVegMenuEastern || menu instanceof KidsMenuEastern ){
                discountmethod=new DiscountMethod(new EasternPizzaDiscount());
            }
            if(menu instanceof VegMenuItalian || menu instanceof NonVegMenuItalian || menu instanceof KidsMenuItalian ){
                discountmethod=new DiscountMethod(new ItalianPizzaDiscount());
            }

            if(menu instanceof VegMenuBurger || menu instanceof NonVegMenuBurger || menu instanceof KidsMenuBurger ){
                discountmethod=new DiscountMethod(new BurgerDiscount());
                
            }
            priceDiscount= discountmethod.calcDiscount(menu.cost(orderchoice));
            order.add(priceDiscount);
            //end of apply discount


            orders.add(order);
            System.out.println("1)add order\n2)end \n");
            int choiceadd=scan.nextInt();
            if(choiceadd==1)continue;
            if(choiceadd==2)break;

        }
        //end of orders and show order and notify kitchen
        Observer kitchen=new Kitchen();
        Observer waiter=new Waiter();
        Order orderObs=new Order();
        orderObs.addObs(kitchen);
        orderObs.addObs(waiter);
        String lineOrder="";
        float totalcost=0;
        System.out.println("your order is");
        for (ArrayList<Object> item : orders) {
            System.out.println(item.get(0) + " - " + item.get(1)+"-after discount is "+item.get(2));
            totalcost+=((Number)item.get(2)).floatValue();
            lineOrder+=item.get(0).toString()+"|||||||";
        }
        orderObs.setState(lineOrder);
        //end of notify and show order
        System.out.println("total cost is "+totalcost);

        System.out.println("pay by \n1)credit card\n2)mobile Wallet\n3)cash\n");
        int choicepay=scan.nextInt();
        
         switch (choicepay){
            case 1:
                {
                Payment payment=new CreditCard();
                Paymethod pay=new Paymethod(payment);
                pay.pay();
                break;
                }
            case 2:{
               Paymethod pay=new Paymethod(new MobileWallets());
                pay.pay();
                break;}
            case 3:{
                Paymethod pay=new Paymethod(new Cash());
                pay.pay();
                }



         }

         //end of payment 


    }
}