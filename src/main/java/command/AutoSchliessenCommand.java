package command;

/**
 * @author ggradnig
 */
public class AutoSchliessenCommand implements AutoCommand{
    private Auto auto;

    public AutoSchliessenCommand(Auto auto){
        this.auto = auto;
    }

    public void execute(){
        auto.schliessen();
    }
}
