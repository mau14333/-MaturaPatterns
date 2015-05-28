package visitor;

/**
 * Created by Felix on 28.05.2015.
 */
public class Car implements IVisitable{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
