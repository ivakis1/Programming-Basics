import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100){
            if (season.equals("summer")){
                budget = budget * 0.3;
                System.out.printf("Somewhere in Bulgaria %nCamp - %.2f", budget);
            } else if (season.equals("winter")){
                budget = budget * 0.70;
                System.out.printf("Somewhere in Bulgaria %nHotel - %.2f", budget);
            }
        }else if (budget <= 1000){
            if (season.equals("summer")){
                budget = budget * 0.40;
                System.out.printf("Somewhere in Balkans %nCamp - %.2f",budget);
            }else if (season.equals("winter")){
                budget = budget * 0.80;
                System.out.printf("Somewhere in Balkans %nHotel - %.2f",budget);
            }
        }else if (budget > 1000){
            budget = budget * 0.90;
            System.out.printf("Somewhere in Europe %nHotel - %.2f", budget);
        }
    }
}
