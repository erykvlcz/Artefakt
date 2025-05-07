package pl.kurs;

import java.util.Set;

public class Artefakt {
    private String name;
    private int powerLevel;
    private ArtefaktType artefaktType;
    private Set<ArtefaktProperty> artefaktPropertySet;

    public Artefakt(String name, int powerLevel, ArtefaktType artefaktType) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.artefaktType = artefaktType;
    }

    public void addToArtefaktProperty(ArtefaktProperty property){
        artefaktPropertySet.add(property);
    }

    @Override
    public String toString() {
        return "Artefakt{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", artefaktType=" + artefaktType +
                ", artefaktPropertySet=" + artefaktPropertySet +
                '}';
    }
}
