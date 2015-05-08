package factory;

/**
 * Created by Michi on 08.05.2015.
 */
public class AutoFactory {

    public PKW createPKW(){
        return new PKW();
    }

    public LKW createLKW(){
        return new LKW();
    }

}
