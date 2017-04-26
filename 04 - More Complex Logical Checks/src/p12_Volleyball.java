import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeYear = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int homeTown = Integer.parseInt(scanner.nextLine());

        double weekendsInSofia = ((48 - homeTown) * 0.75);
        double holidaysPlaying = holidays * (2.0 / 3);

        double allGames = weekendsInSofia + holidaysPlaying + homeTown;

        if (typeYear.equals("leap")) {
            allGames = allGames * 1.15;
        }
        System.out.println((int) allGames);

    }
}
