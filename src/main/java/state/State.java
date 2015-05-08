package state;

/**
 * Created by Dominik on 08.05.2015.
 */
public abstract class State {

    Door door;

    public State(Door door) {
        this.door = door;
    }

    public abstract void close();

    public abstract void open();

}
