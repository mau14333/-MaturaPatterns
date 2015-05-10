package iterator;

/**
 * Created by Felix on 10.05.2015.
 */
public interface Iterator<T> {
    void gotoNext();
    boolean hasNext();
    T getCurrent();
}
