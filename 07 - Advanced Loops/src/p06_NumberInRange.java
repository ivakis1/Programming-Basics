import java.util.Scanner;

/**
 * Created by User on 12.4.2017 г..
 */
public class p06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = Integer.parseInt(scanner.nextLine());
            while (num < 1 || num > 100) {
                System.out.printf("Invalid number!%n");
                System.out.printf("Еnter a number in the range [1...100]:%n");
                num = Integer.parseInt(scanner.nextLine());
            }
            System.out.println("The number is: " + num);

        } catch (NumberFormatException nfe){
            System.out.println("Invalid text for number!");
        }

    }
}
