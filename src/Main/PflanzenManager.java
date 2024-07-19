package Main;

public class PflanzenManager {
    private String pflanzenart;
    private double wachstumsstadium; // 0.0 - 1.0, 1.0 ist voll ausgereift

    public PflanzenManager(String pflanzenart) {
        this.pflanzenart = pflanzenart;
        this.wachstumsstadium = 0.0;
    }

    public void wachsen(double menge) {
        wachstumsstadium += menge;
        if (wachstumsstadium > 1.0) {
            wachstumsstadium = 1.0;
        }
        System.out.println(pflanzenart + " Wachstumsstadium: " + (wachstumsstadium * 100) + "%");
    }

    public String getPflanzenart() {
        return pflanzenart;
    }

    public double getWachstumsstadium() {
        return wachstumsstadium;
    }
}
