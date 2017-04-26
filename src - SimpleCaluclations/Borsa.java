import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class Borsa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double VegetablesCost = Double.parseDouble(scan.nextLine());
        double FruitCost = Double.parseDouble(scan.nextLine());

        double VegetablesWeight = Double.parseDouble(scan.nextLine());
        double FruitWeight = Double.parseDouble(scan.nextLine());

        double result =((VegetablesCost*VegetablesWeight) + (FruitCost*FruitWeight)) / 1.94;

        System.out.printf("%f", result);

    }


}
