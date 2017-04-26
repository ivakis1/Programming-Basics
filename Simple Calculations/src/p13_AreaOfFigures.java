import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by User on 17.3.2017 г..
 */
public class p13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine().toLowerCase();

        DecimalFormat format = new DecimalFormat("#.###");

        if (figure.equals("square")){

            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;

            System.out.printf(format.format(area));

        }else if (figure.equals("rectangle")){

            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;

            System.out.printf(format.format(area));


        }else if (figure.equals("circle")){

            double r = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * r * r;

            System.out.printf(format.format(area));


        }else if (figure.equals("triangle")){

            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double area =  (a*h)/2;

            System.out.printf(format.format(area));

        } else {
            System.out.println("invalid figure");  //not necessary
        }




    }
}
