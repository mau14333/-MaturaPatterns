package state;

/**
 * @author Dominik
 */
public class Closed extends State {

    public Closed(Door door) {
        super(door);
    }

    @Override
    public void close() {
        System.err.println(System.currentTimeMillis() + " - Das Tor ist bereits geschlossen!!!");
    }

    @Override
    public void open() {
        System.out.println(System.currentTimeMillis() + " - Das Tor wurde aufgemacht");
        door.setState(new Open(door));
    }
}
