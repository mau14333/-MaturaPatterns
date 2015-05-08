package builder;

/**
 * Created by Michi on 08.05.2015.
 */
public class GradualMealBuilder {

    private Meal toBuild;

    public GradualMealBuilder(){
        toBuild = new Meal();
    }

    public GradualMealBuilder vorspeise(String vorspeise){
        toBuild.setVorspeise(vorspeise);
        return this;
    }

    public GradualMealBuilder hauptspeise(String hauptspeise){
        toBuild.setHauptspeise(hauptspeise);
        return this;
    }

    public GradualMealBuilder nachspeise(String nachspeise){
        toBuild.setNachspeise(nachspeise);
        return this;
    }

    public Meal build(){
        return toBuild;
    }

}
