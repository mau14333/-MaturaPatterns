package command;

/**
 * @author ggradnig
 */
public class AutoOeffnenCommand implements AutoCommand{
    private Auto auto;

    public AutoOeffnenCommand(Auto auto){
        this.auto = auto;
    }

    public void execute(){
        auto.oeffnen();
    }
}
