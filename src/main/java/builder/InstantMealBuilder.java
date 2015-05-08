package builder;

/**
 * Created by Michi on 08.05.2015.
 */
public class InstantMealBuilder {

    private String vorspeise,hauptspeise,nachspeise;

    public InstantMealBuilder vorspeise(String vorspeise){
        this.vorspeise = vorspeise;
        return this;
    }

    public InstantMealBuilder hauptspeise(String hauptspeise){
        this.hauptspeise = hauptspeise;
        return this;
    }

    public InstantMealBuilder nachspeise(String nachspeise){
        this.nachspeise = nachspeise;
        return this;
    }

    public Meal build(){
        Meal meal = new Meal();
        meal.setVorspeise(vorspeise);
        meal.setHauptspeise(hauptspeise);
        meal.setNachspeise(nachspeise);
        return meal;
    }

}
