package state;

/**
 * @author Dominik
 */
public class Door {

    private State state = new Closed(this);

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void setState(State state) {
        this.state = state;
    }
}
