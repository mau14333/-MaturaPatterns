package command;

/**
 * @author ggradnig
 */
public class Fernbedienung {
    public void druecken(AutoCommand knopf){
        knopf.execute();
    }
}
