package Main;

import java.util.Random;

public class Wetterüberwachung {
    private double temperatur;
    private double feuchtigkeit;

    public Wetterüberwachung() {
        updateWetter();
    }

    public void updateWetter() {
        Random random = new Random();
        this.temperatur = 15 + (35 - 15) * random.nextDouble(); // 15-35 Grad
        this.feuchtigkeit = 30 + (70 - 30) * random.nextDouble(); // 30%-70%
    }

    public double getTemperatur() {
        return temperatur;
    }

    public double getFeuchtigkeit() {
        return feuchtigkeit;
    }

    @Override
    public String toString() {
        return "Wetter [Temperatur=" + temperatur + "°C, Feuchtigkeit=" + feuchtigkeit + "%]";
    }
}
