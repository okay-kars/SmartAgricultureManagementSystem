package Main;

public class SmartFarm {
    private Bewässerungssystem bewässerungssystem;
    private Düngemittelsystem düngemittelsystem;
    private Wetterüberwachung wetterüberwachung;
    private PflanzenManager pflanzenManager;

    public SmartFarm(String pflanzenart) {
        this.bewässerungssystem = new Bewässerungssystem();
        this.düngemittelsystem = new Düngemittelsystem();
        this.wetterüberwachung = new Wetterüberwachung();
        this.pflanzenManager = new PflanzenManager(pflanzenart);
    }

    public Bewässerungssystem getBewässerungssystem() {
        return bewässerungssystem;
    }

    public Düngemittelsystem getDüngemittelsystem() {
        return düngemittelsystem;
    }

    public Wetterüberwachung getWetterüberwachung() {
        return wetterüberwachung;
    }

    public PflanzenManager getPflanzenManager() {
        return pflanzenManager;
    }

    @Override
    public String toString() {
        return "SmartFarm [Bewässerung=" + bewässerungssystem.istBewässern() + ", Düngung=" + düngemittelsystem.istDüngen() + ", " + wetterüberwachung + ", Pflanze=" + pflanzenManager.getPflanzenart() + " (" + (pflanzenManager.getWachstumsstadium() * 100) + "% ausgereift)]";
    }
}
