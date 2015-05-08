package templatemethod;

/**
 * Created by Michi on 08.05.2015.
 */
public class FranzFerdinand extends AbstractPerson {
    @Override
    protected String getVorname() {
        return "Franz";
    }

    @Override
    protected String getNachname() {
        return "Ferdinand";
    }
}
