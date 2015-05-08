package observer;

/**
 * Created by Michi on 08.05.2015.
 */
public class Product extends AbstractObservable {

    private String name;
    private double price;

    public Product(String name){
        this.name = name;
    }

    public void update(){
        subscribers.parallelStream().forEach(s->s.update(this));
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        update();
    }

    public String getName(){
        return name;
    }
}
