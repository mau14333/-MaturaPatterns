package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michi on 08.05.2015.
 */
public abstract class AbstractObservable {

    protected List<IObserver> subscribers = new ArrayList<>();

    public abstract void update();

    public void subscribe(IObserver observer){
        if (!subscribers.contains(observer)) {
            subscribers.add(observer);
        }
    }

    public void unsubscribe(IObserver observer){
        if (subscribers.contains(observer)){
            subscribers.remove(observer);
        }
    }
}
