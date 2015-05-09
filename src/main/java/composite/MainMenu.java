package composite;

/**
 * Created by felix on 09.05.15.
 */
public class MainMenu extends Menu {

    private final String title;

    public MainMenu(String title) {
        this.title = title;
    }

    @Override
    public void listSubComposites() {
        System.out.println("The menu " + title + " has following submenues:");
        for (Component c : this.components) {
            c.listSubComposites();
        }
    }
}
