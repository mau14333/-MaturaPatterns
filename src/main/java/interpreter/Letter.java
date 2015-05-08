package interpreter;

/**
 * Created by Michi on 08.05.2015.
 */
public class Letter extends Expression {

    public Letter(char content){
        this.content = ""+content;
    }

    @Override
    public void interpret() {
        System.out.println("This letter is " + content);
    }
}
