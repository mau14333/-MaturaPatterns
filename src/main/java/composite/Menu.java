package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 09.05.15.
 */

//Component
public abstract class Menu implements Component {
    protected List<Component> components = new ArrayList<>();

    public void add(Component component){
        this.components.add(component);
    }

    public void remove(Component component){
        this.components.remove(component);
    }
}
