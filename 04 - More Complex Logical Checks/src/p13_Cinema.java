import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class p13_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colls = Integer.parseInt(scanner.nextLine());
        double profit = 0;

        if (type.equals("Premiere")){
            profit = (rows * colls)*12.00;
        } else if (type.equals("Normal")){
            profit = (rows*colls)*7.50;
        }else if (type.equals("Discount")){
            profit = (rows * colls)*5;
        }
        System.out.printf("%.2f", profit);
    }
}
