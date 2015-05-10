import adapter.*;

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

        /*Builder
        GradualMealBuilder gradualMealBuilder = new GradualMealBuilder();
        System.out.println(gradualMealBuilder.vorspeise("Nudelsuppe").hauptspeise("Schweinsbraten").nachspeise("Himbeereis").build());
        InstantMealBuilder instantMealBuilder = new InstantMealBuilder();
        System.out.println(instantMealBuilder.vorspeise("Leberknedelsuppe").hauptspeise("Schweinsbraten").nachspeise("Himbeereis").build());
        */

        /*Template Method
        AbstractPerson person = new HubertMeier();
        person.printName();
        person = new FranzFerdinand();
        person.printName();*/

        /*Interpreter
        Expression banane = new Word("Banane!", new Stringbreaker().breakString("Banane!"));
        banane.interpret();
        */

        /*Factory
        AutoFactory factory = new AutoFactory();
        factory.createPKW().display();
        factory.createLKW().display();
        */

        /*Abstract Factory
        abstractfactory.AutoFactory redFactory = new RedAutoFactory();
        AutoFactory blueFactory = new BlueAutoFactory();
        redFactory.createLKW().display();
        redFactory.createPKW().display();
        blueFactory.createPKW().display();
        blueFactory.createLKW().display();*/

        /*Component
        Menu menu = new MainMenu("MyMenu");
        MenuItem menuItem = new MenuItem("MyMenuItem");
        menu.add(menuItem);
        menu.listSubComposites();
        */

        /* //Adapter
        Customer customer = new Customer("Daniel Lang", "4242 4242 4242", "123");
        PaymentAdapter payment = new PaymentAdapter();
        payment.pay(PaymentAdapter.Providers.PayPal, customer, 12.5f);
        payment.pay(PaymentAdapter.Providers.Stripe, customer, 7.5f);
        */

        /*  //State
        Door door = new Door();
        door.close();
        door.close();
        door.open();
        */

        /*// Iterator
        SchoolReport schoolReport = new SchoolReport(new int[]{3,2,4});
        System.out.println("My grades are: ");
        for(Iterator<Integer> iterator = schoolReport.createIterator(); iterator.hasNext(); iterator.gotoNext()){
            System.out.print(iterator.getCurrent() + ", ");
        }*/

        // Singleton
        /* MySingleton singleton1 = MySingleton.getInstance();
        singleton1.setAnInt(3);
        MySingleton singleton2 = MySingleton.getInstance();
        if(singleton1 == singleton2) System.out.println("singleton 1 equals singleton 2");
        else System.out.println("singleton not correctly implemented");
        System.out.println("anInt was already set to :" + singleton2.getAnInt()); */

        //Adapter Neu:
        Customer customer = new Customer("Daniel Lang", "4242 4242 4242", "123");
        new PayPalAdapter().pay(customer, 12.5f);
        new StripeAdapter().pay(customer, 7.5f);

    }
}
