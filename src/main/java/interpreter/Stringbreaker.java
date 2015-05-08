package interpreter;

import java.util.ArrayList;

/**
 * Created by Michi on 08.05.g2015.
 */
public class Stringbreaker {

    public ArrayList<Expression> breakString(String toBreak){
        ArrayList<Expression> broken = new ArrayList<>();
        ArrayList<Expression> subBroken = new ArrayList<>();
        for (int i = 0;i<toBreak.length();i++){
            subBroken.add(new Letter(toBreak.toCharArray()[i]));
        }
        broken.add(new Word(toBreak.substring(0,toBreak.length()-1), subBroken));
        broken.add(new Letter(toBreak.charAt(toBreak.length()-1)));
        return broken;
    }

}
