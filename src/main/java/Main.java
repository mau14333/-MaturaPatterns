import observer.Customer;
import observer.News;
import observer.Product;
import strategy.Client;
import strategy.FriendlyGreetingStrategy;
import strategy.NormalGreetingStrategy;

/**
 * Created by Michi on 08.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        /*Strategy
        new Client(new FriendlyGreetingStrategy()).greet();
        new Client(new NormalGreetingStrategy()).greet();*/
        Customer herrMeier = new Customer();
        Product billig = new Product("Billiges Ding");
        Product teuer = new Product("teures Ding");
        News zeitung = new News();

        billig.subscribe(herrMeier);
        teuer.subscribe(herrMeier);
        billig.setPrice(2.50);
        teuer.setPrice(8.60);
        billig.unsubscribe(herrMeier);
        billig.setPrice(1.50);
        teuer.setPrice(9.60);
        zeitung.subscribe(herrMeier);
        zeitung.setHeadline("Herr Meier subscribt zu zeitung!");
    }
}
