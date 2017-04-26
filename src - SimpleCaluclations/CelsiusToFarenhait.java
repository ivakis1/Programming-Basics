import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class CelsiusToFarenhait {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Celsius = Double.parseDouble(scan.nextLine());

        double Fahrenhait = (Celsius * 1.8) + 32;

        System.out.printf("%.2f", Fahrenhait);


    }

}
