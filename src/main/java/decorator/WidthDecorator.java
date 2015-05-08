package decorator;

/**
 * Created by Michi on 08.05.2015.
 */
public class WidthDecorator implements IDecoratee{

    private IDecoratee decoratee;
    int width;

    public WidthDecorator(IDecoratee decoratee, int width){
        this.decoratee = decoratee;
        this.width = width;
    }

    @Override
    public void displayInfo() {
        decoratee.displayInfo();
        System.out.println("Width:" + width);
    }
}
