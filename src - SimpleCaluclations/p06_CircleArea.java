import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class p06_CircleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double r = Double.parseDouble(console.nextLine());

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }

}
