import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Menu menu;
        System.out.println("1-Eastern\n2-Italian\n3-Burger");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();

        switch (choice) {
            case 1:
                CategoryFactory eastern=new EasternFactory();
                System.out.println("1-veg\n2-non-veg\n3-kids");
                int choice2=scan.nextInt();
                if(choice2==1)eastern.getVegMenu().display();;
                if(choice2==2)eastern.getNonVegMenu().display();;
                if(choice2==3)eastern.getKidsMenu().display();;

                
                break;
            case 2:
                CategoryFactory Italian=new ItalianFactory();
                System.out.println("1-veg\n2-non-veg\n3-kids");
                choice2=scan.nextInt();
                if(choice2==1)Italian.getVegMenu().display();;
                if(choice2==2)Italian.getNonVegMenu().display();;
                if(choice2==3)Italian.getKidsMenu().display();;

                
                break;
            case 3:
                CategoryFactory Burger=new BurgerFactory();
                System.out.println("1-veg\n2-non-veg\n3-kids");
                choice2=scan.nextInt();
                if(choice2==1)Burger.getVegMenu().display();;
                if(choice2==2)Burger.getNonVegMenu().display();;
                if(choice2==3)Burger.getKidsMenu().display();;

                
                break;
            default:
                throw new AssertionError();
        }
    }
}