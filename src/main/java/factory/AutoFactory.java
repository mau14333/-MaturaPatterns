package factory;

/**
 * Created by Michi on 08.05.2015.
 */
public class AutoFactory {

    public Auto createPKW(){
        return new PKW();
    }

    public Auto createLKW(){
        return new LKW();
    }

}
