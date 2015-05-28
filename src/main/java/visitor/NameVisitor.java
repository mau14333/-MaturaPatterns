package visitor;

/**
 * Created by Felix on 28.05.2015.
 */
public class NameVisitor implements IVisitor{
    @Override
    public void visit(Car car) {
        System.out.println("name of car: BMW");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("name of bike: KTM");
    }
}
