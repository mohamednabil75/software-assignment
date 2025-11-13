public class Waiter implements Observer {
    Waiter(){
        System.out.println("This is a waiter");
    }
    public void updateState(String state){
        System.out.println(state);
    }
}
