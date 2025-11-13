public class Kitchen implements Observer {
private static Kitchen instance;
private Kitchen(){
}
public static Kitchen getInstance(){
    if(instance==null){
        instance=new Kitchen();
    }
    return instance;
}
public void updateState(String state){
    System.out.println(state);
}
}
