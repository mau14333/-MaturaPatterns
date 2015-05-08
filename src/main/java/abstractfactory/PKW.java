package abstractfactory;

/**
 * Created by Michi on 08.05.2015.
 */
public abstract class PKW extends Auto {
    @Override
    public void display() {
        super.display();
        System.out.println("___(o_o)___");
    }
}
