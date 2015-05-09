package composite;

/**
 * Created by felix on 09.05.15.
 */
public class MenuItem implements Component {

    private final String title;

    public MenuItem(String title){
        this.title = title;
    }

    @Override
    public void listSubComposites() {
        System.out.println("The menu item " + title +" has folowing subitems:");
        System.out.println("null");
    }
}
