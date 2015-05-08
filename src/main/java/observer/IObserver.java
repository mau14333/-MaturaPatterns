package observer;

/**
 * Created by Michi on 08.05.2015.
 */
public interface IObserver {
    void update(Product product);

    void update(News news);
}
