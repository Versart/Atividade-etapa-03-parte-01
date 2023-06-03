package questao3;

import java.util.ArrayList;
import java.util.List;

public class Experimento {


    private List<RoboAction> roboActionList;

    public Experimento() {
        roboActionList = new ArrayList<>();
    }

    public void addRobo(RoboAction roboAction){
        this.roboActionList.add(roboAction);
    }

    public void executaComandos() {
        for(RoboAction action : roboActionList)
            action.execute();
    }
}
