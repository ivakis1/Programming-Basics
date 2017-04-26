import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class p05_TrapezoidArea {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        double area = (a + b)*h/2;

        System.out.println("Trapezoid area = " + area);


    }
}
