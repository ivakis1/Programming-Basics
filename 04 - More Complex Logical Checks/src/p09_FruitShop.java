import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class p09_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;


        if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.9;
            } else if (fruit.equals("grapefruit")) {
                price = 1.6;
            } else if (fruit.equals("kiwi")) {
                price = 3;
            } else if (fruit.equals("pineapple")) {
                price = 5.6;
            } else if (fruit.equals("grapes")) {
                price = 4.2;
            }
        } else if (day.equals("monday")|| day.equals("tuesday")|| day.equals("wednesday")|| day.equals("thursday")
                || day.equals("friday")){

            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.2;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.7;
            } else if (fruit.equals("pineapple")) {
                price = 5.5;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            }

        }
        boolean price1 =  (price == 0);
        if (!price1){
            System.out.println(price*quantity);
        } else {
            System.out.println("error");
        }
    }
}
