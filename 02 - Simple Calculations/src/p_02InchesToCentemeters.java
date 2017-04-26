import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class p_02InchesToCentemeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("inches = ");
        double inches = Double.parseDouble(console.nextLine());
        double centimeters = inches * 2.54;

        System.out.println("centemetes = " + centimeters);


    }

}
