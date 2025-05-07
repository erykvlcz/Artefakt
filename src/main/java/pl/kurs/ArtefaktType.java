package pl.kurs;

public enum ArtefaktType {
    AMULET("ochrania"),
    STONE("wzmacnia energie"),
    RING("odpycha złe siły");

    private String description;

    ArtefaktType(String description) {
        this.description = description;
    }
}
