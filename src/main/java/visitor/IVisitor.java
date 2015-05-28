package visitor;

/**
 * Created by Felix on 28.05.2015.
 */
public interface IVisitor {
    void visit(Car car);
    void visit(Bike bike);
}
