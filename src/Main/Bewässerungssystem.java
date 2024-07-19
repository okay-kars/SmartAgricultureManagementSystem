package Main;

public class Bewässerungssystem {
    private boolean istBewässern;

    public Bewässerungssystem() {
        this.istBewässern = false;
    }

    public void startBewässerung() {
        istBewässern = true;
        System.out.println("Bewässerungssystem gestartet.");
    }

    public void stopBewässerung() {
        istBewässern = false;
        System.out.println("Bewässerungssystem gestoppt.");
    }

    public boolean istBewässern() {
        return istBewässern;
    }
}
