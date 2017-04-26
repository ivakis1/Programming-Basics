import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class TriangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double area = a*h/2;

        System.out.printf("%.2f", area);



    }
}
