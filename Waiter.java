public class Waiter implements Observer {
    public void updateState(String state){
        System.out.println("Waiter: "+state);
    }
}
