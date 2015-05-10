package command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ggradnig
 */
public class AutoFernbedienungTest {
    @Test
    public void testOeffnen(){
        Auto meinAuto = new Auto();
        Fernbedienung meineAutoFernbedienung = new Fernbedienung();

        // ich definiere zuerst, was ich machen möchte und übergebe gleich das ziel der aktion (= das auto)
        AutoCommand autoCommand = new AutoOeffnenCommand(meinAuto);

        // an einer späteren stelle im code, muss ich weder das ziel (auto), noch das konkrete kommando (oeffnen) kennen
        meineAutoFernbedienung.druecken(autoCommand);

        assertEquals(meinAuto.isOffen(), true);
    }

    @Test
    public void testSchliessen(){
        Auto meinAuto = new Auto();
        Fernbedienung meineAutoFernbedienung = new Fernbedienung();

        AutoCommand autoCommand = new AutoSchliessenCommand(meinAuto);
        meineAutoFernbedienung.druecken(autoCommand);

        assertEquals(meinAuto.isOffen(), false);
    }
}
