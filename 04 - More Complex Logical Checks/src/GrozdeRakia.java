import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class GrozdeRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double areaProduce = Double.parseDouble(scanner.nextLine());
        double waste = Double.parseDouble(scanner.nextLine());

        double totalProduce = (area * areaProduce) - waste;

        double grapeForRakia = totalProduce*0.45;
        double rakiaQuantity = grapeForRakia / 7.5;
        double rakiaIncome = rakiaQuantity * 9.80;

        double GrapeForSale = totalProduce*0.55;
        double grapeIncome = GrapeForSale * 1.50;

        System.out.printf("%.2f", rakiaIncome);
        System.out.println();
        System.out.printf("%.2f", grapeIncome);
    }
}
