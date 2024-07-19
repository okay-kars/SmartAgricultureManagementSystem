package Main;

public class Düngemittelsystem {
    private boolean istDüngen;

    public Düngemittelsystem() {
        this.istDüngen = false;
    }

    public void startDüngung() {
        istDüngen = true;
        System.out.println("Düngemittelsystem gestartet.");
    }

    public void stopDüngung() {
        istDüngen = false;
        System.out.println("Düngemittelsystem gestoppt.");
    }

    public boolean istDüngen() {
        return istDüngen;
    }
}
