import java.util.Scanner;

/**
 * Created by User on 21.3.2017 г..
 */
public class p02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String city = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (city.equals("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.50);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.80);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.20);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.45);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.60);
            }
        }
        if (city.equals("plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.40);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.30);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.50);
            }
        }
        if (city.equals("varna")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.45);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.10);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.55);
            }
        }
    }
}
