package abstractfactory;

/**
 * Created by Michi on 08.05.2015.
 */
public class BlueAutoFactory implements AutoFactory {

    public Auto createPKW(){
        return new BluePKW();
    }

    public Auto createLKW(){
        return new BlueLKW();
    }

}
