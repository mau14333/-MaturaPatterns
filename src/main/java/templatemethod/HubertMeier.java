package templatemethod;

/**
 * Created by Michi on 08.05.2015.
 */
public class HubertMeier extends AbstractPerson {
    @Override
    protected String getVorname() {
        return "Hubert";
    }

    @Override
    protected String getNachname() {
        return "Meier";
    }
}
