package visitor;

/**
 * Created by Felix on 28.05.2015.
 */
public class PsVisitor implements IVisitor{
    @Override
    public void visit(Car car) {
        System.out.println("ps of car: 200");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("PS of bike: 50");
    }
}
