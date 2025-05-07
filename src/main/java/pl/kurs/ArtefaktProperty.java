package pl.kurs;

public enum ArtefaktProperty {

    INVISIBILITY("umiejętność znikania"),
    HEALING("przywraca 50% zdrowia"),
    TELEPORTATION("swobodne przemieszczanie");


    private String description;

    ArtefaktProperty(String description) {
        this.description = description;
    }
}
