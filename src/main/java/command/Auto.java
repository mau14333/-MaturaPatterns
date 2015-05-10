package command;

public class Auto{
    private boolean offen;

    public Auto(){
        this.offen = false;
    }

    public void oeffnen(){
        this.offen = true;
    }

    public void schliessen(){
        this.offen = false;
    }

    public boolean isOffen(){
        return offen;
    }
}