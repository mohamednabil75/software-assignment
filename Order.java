import java.util.ArrayList;
public class Order {
    private ArrayList<Observer> obs;
    private String state;
    public Order(){
        this.obs=new ArrayList<Observer>();
    }
    public void setState(String newstate){
        this.state=newstate;
        notifyObs();
    }
    public void addObs(Observer obs){
        this.obs.add(obs);
    }
    public void removeObs(Observer obs){
        this.obs.remove(obs);
    }
    public void notifyObs(){
        for (Observer observer : obs) {
            observer.updateState(state);
        }
    }
}
