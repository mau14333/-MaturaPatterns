package state;

/**
 * @author Dominik
 */
public class Open extends State {

    public Open(Door door) {
        super(door);
    }

    @Override
    public void close() {
        System.out.println(System.currentTimeMillis() + " - Das Tor wurde geschlossen");
        door.setState(new Closed(door));
    }

    @Override
    public void open() {
        System.err.println(System.currentTimeMillis() + " - Das Tor ist bereits offen!!!");
    }
}
