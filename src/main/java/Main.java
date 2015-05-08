import builder.GradualMealBuilder;
import builder.InstantMealBuilder;

/**
 * Created by Michi on 08.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        /*Strategy
        new Client(new FriendlyGreetingStrategy()).greet();
        new Client(new NormalGreetingStrategy()).greet();*/

        /*Observer
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
        zeitung.setHeadline("Herr Meier subscribt zu zeitung!");*/

        /*Decorator
        IDecoratee tower = new Tower(123);
        IDecoratee decoratedTower = new WidthDecorator(tower, 25);
        tower.displayInfo();
        System.out.println("-----");
        decoratedTower.displayInfo();*/

        GradualMealBuilder gradualMealBuilder = new GradualMealBuilder();
        System.out.println(gradualMealBuilder.vorspeise("Nudelsuppe").hauptspeise("Schweinsbraten").nachspeise("Himbeereis").build());

        InstantMealBuilder instantMealBuilder = new InstantMealBuilder();
        System.out.println(instantMealBuilder.vorspeise("Leberknedelsuppe").hauptspeise("Schweinsbraten").nachspeise("Himbeereis").build());
    }
}
