package decorator;

/**
 * Created by Michi on 08.05.2015.
 */
public class Tower implements IDecoratee{

    int height;

    public Tower(int height){
        this.height = height;
    }

    @Override
    public void displayInfo() {
        System.out.println("Height:" + height);
    }
}
