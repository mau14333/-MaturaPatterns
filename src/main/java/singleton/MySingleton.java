package singleton;

/**
 * Created by Felix on 10.05.2015.
 */
public class MySingleton {

    // that block makes it a singleton
    private static MySingleton instance = new MySingleton();

    public static MySingleton getInstance() {
        return instance;
    }

    private MySingleton() {
    }


    // implement functionality here

    private int anInt;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
}
