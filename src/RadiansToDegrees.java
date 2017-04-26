import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rad = Double.parseDouble(scan.nextLine());

        double degrees = rad*180 / Math.PI;

        System.out.printf("%.0f", degrees);


    }

}
