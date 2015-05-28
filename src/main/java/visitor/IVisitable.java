package visitor;

/**
 * Created by Felix on 28.05.2015.
 */
public interface IVisitable {
    void accept(IVisitor visitor);
}
