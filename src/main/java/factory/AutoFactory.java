package factory;

/**
 * Created by Michi on 08.05.2015.
 */
public class AutoFactory {
    public Auto createAuto(String autoTyp){
        if(autoTyp.equals("pkw")) {
            return new PKW();
        }
        else if(autoTyp.equals("lkw")) {
            return new LKW();
        }
        else{
            return null;
        }
    }
}
