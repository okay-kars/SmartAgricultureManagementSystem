package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Pflanzentyp ein: ");
        String pflanzenart = scanner.nextLine();

        SmartFarm smartFarm = new SmartFarm(pflanzenart);

        while (true) {
            System.out.println("\n--- Intelligentes Landwirtschaftsmanagementsystem ---");
            System.out.println("1. Bewässerungssystem starten/stoppen");
            System.out.println("2. Düngemittelsystem starten/stoppen");
            System.out.println("3. Wetter aktualisieren");
            System.out.println("4. Pflanzenwachstum erhöhen");
            System.out.println("5. Farmstatus anzeigen");
            System.out.println("6. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            int auswahl = scanner.nextInt();
            scanner.nextLine(); // Puffer leeren

            switch (auswahl) {
                case 1:
                    if (smartFarm.getBewässerungssystem().istBewässern()) {
                        smartFarm.getBewässerungssystem().stopBewässerung();
                    } else {
                        smartFarm.getBewässerungssystem().startBewässerung();
                    }
                    break;
                case 2:
                    if (smartFarm.getDüngemittelsystem().istDüngen()) {
                        smartFarm.getDüngemittelsystem().stopDüngung();
                    } else {
                        smartFarm.getDüngemittelsystem().startDüngung();
                    }
                    break;
                case 3:
                    smartFarm.getWetterüberwachung().updateWetter();
                    System.out.println(smartFarm.getWetterüberwachung());
                    break;
                case 4:
                    System.out.print("Geben Sie die Wachstumsmenge ein (0.0 - 1.0): ");
                    double wachstumsmenge = scanner.nextDouble();
                    smartFarm.getPflanzenManager().wachsen(wachstumsmenge);
                    break;
                case 5:
                    System.out.println(smartFarm);
                    break;
                case 6:
                    System.out.println("Programm wird beendet...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Option. Bitte versuchen Sie es erneut.");
            }
        }
    }
}
