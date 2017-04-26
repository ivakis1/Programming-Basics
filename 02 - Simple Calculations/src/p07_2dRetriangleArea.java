import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class p07_2dRetriangleArea {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double a = Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2); //-30
        double area = a * b;
        double perimeter = 2 * (a + b);

        System.out.println(area);
        System.out.println(perimeter);


    }
}
