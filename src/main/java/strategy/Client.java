package strategy;

/**
 * Created by Michi on 08.05.2015.
 */
public class Client {

    private IStrategy strategy;

    public Client(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void greet(){
       strategy.greet();
    }

}
