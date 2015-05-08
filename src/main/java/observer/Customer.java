package observer;

/**
 * Created by Michi on 08.05.2015.
 */
public class Customer implements IObserver {
    @Override
    public void update(Product product) {
        System.out.println("New Price of " + product.getName() + ":" + product.getPrice());
    }

    @Override
    public void update(News news) {
        System.out.println("Breaking news: " + news.getHeadline());
    }
}
