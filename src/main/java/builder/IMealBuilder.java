package builder;

/**
 * Created by Michi on 08.05.2015.
 */
public interface IMealBuilder {
    public InstantMealBuilder vorspeise(String vorspeise);

    public InstantMealBuilder hauptspeise(String hauptspeise);

    public InstantMealBuilder nachspeise(String nachspeise);
}
