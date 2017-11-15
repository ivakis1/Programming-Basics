import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class Fishland {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        double SkumriaCenaKG = Double.parseDouble(scan.nextLine());
        double CacaCenaKG = Double.parseDouble(scan.nextLine());
        double PalamudKG = Double.parseDouble(scan.nextLine());
        double SafridKG = Double.parseDouble(scan.nextLine());
        double MidiKG = Double.parseDouble(scan.nextLine());

        double PricePalamud = (SkumriaCenaKG * 1.6)*PalamudKG;
        double PriceSafrid = (CacaCenaKG * 1.8)*SafridKG;
        double PriceMidi = MidiKG * 7.50;

        double CostFish = PricePalamud + PriceSafrid + PriceMidi;

        System.out.printf("%.2f", CostFish);

    }
}
