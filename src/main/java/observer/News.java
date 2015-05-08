package observer;

/**
 * Created by Michi on 08.05.2015.
 */
public class News extends AbstractObservable {

    private String headline;

    @Override
    public void update() {
        subscribers.parallelStream().forEach(s->s.update(this));
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
        update();
    }
}
