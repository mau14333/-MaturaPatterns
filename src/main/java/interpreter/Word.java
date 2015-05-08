package interpreter;

import java.util.List;

/**
 * Created by Michi on 08.05.2015.
 */
public class Word extends Expression {

    private List<Expression> substrings;

    public Word(String content, List<Expression> substrings){
        this.content = content;
        this.substrings = substrings;
    }

    @Override
    public void interpret() {
        System.out.println("This word has " + content.length() + " letters.");
        substrings.stream().forEach(Expression::interpret);
    }
}
