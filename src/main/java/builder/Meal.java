package builder;

/**
 * Created by Michi on 08.05.2015.
 */
public class Meal {
    private String vorspeise,hauptspeise,nachspeise;

    public void setNachspeise(String nachspeise) {
        this.nachspeise = nachspeise;
    }

    public void setHauptspeise(String hauptspeise) {
        this.hauptspeise = hauptspeise;
    }

    public void setVorspeise(String vorspeise) {
        this.vorspeise = vorspeise;
    }

    @Override
    public String toString() {
        return "Zum Mitagessen gab es " + vorspeise + ", " + hauptspeise + " und " + nachspeise + ".";
    }
}
