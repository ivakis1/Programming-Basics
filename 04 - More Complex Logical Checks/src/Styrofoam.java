import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());
        double windows = Double.parseDouble(scanner.nextLine());
        double styrofoamQuantity = Double.parseDouble(scanner.nextLine());
        double styrofoamPrice = Double.parseDouble(scanner.nextLine());


        double netArea = area - windows*2.4;
        double netAreaPlusWaste = netArea*1.1;
        double neededStyroPacks = Math.ceil(netAreaPlusWaste/styrofoamQuantity); //11
        double priceOfEvrything = neededStyroPacks*styrofoamPrice; //11*30=330

        if (priceOfEvrything < budget){
           double left = budget - priceOfEvrything;

            System.out.printf("Spent: %.2f ", priceOfEvrything );
            System.out.println();
            System.out.printf("Left: %.2f", left);

        }else {
            double needed = priceOfEvrything - budget;
            System.out.printf("Need more: %.2f", needed);
        }
    }
}
