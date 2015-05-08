package strategy;

/**
 * Created by Michi on 08.05.2015.
 */
public class FriendlyGreetingStrategy implements IStrategy {

    public void greet() {
        System.out.println("Hello, how are you?");
    }
}
