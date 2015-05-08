package templatemethod;

/**
 * Created by Michi on 08.05.2015.
 */
public abstract class AbstractPerson {

    public void printName(){
        System.out.println("Mein Name ist " + getVorname()+" "+getNachname());
    }

    protected abstract String getVorname();

    protected abstract String getNachname();

}
