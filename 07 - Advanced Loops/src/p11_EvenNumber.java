import java.util.Scanner;

/**
 * Created by User on 16.4.2017 г..
 */
public class p11_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {

                System.out.print("Enter even number: ");
                n = Integer.parseInt(scanner.nextLine());

                if (n % 2 == 0) {
                    break;
                }
                System.out.println("Entered number is not even.");
            } catch (NumberFormatException nfe) {
                System.out.println("This is not a number! ");
            }

        }
        System.out.println("Even number entered: " + n);


    }
}
