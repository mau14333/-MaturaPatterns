package abstractfactory;

/**
 * Created by Michi on 08.05.2015.
 */
public class RedAutoFactory implements AutoFactory {

    public Auto createPKW(){
        return new RedPKW();
    }

    public Auto createLKW(){
        return new RedLKW();
    }

}
