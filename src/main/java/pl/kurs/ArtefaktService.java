package pl.kurs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArtefaktService {
    private HashMap<ArtefaktType,Artefakt> artefaktGroup;
    private ArrayList<Artefakt> artefaktsList;

    public HashMap<ArtefaktType, Artefakt> getArtefaktGroup() {
        return artefaktGroup;
    }

    public ArrayList<Artefakt> getArtefaktsList() {
        return artefaktsList;
    }

    public void addToArtefaktGroup(ArtefaktType artefaktType, Artefakt artefakt){
        artefaktGroup.put(artefaktType, artefakt);
    }

    public void addToArtefaktsList(Artefakt artefakt){
        artefaktsList.add(artefakt);
    }


}
