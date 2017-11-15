import java.util.Scanner;

public class p11_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scanner.nextLine()); // "5" 5 5.24 4

                if (n % 2 == 0) {
                    break;
                }
                System.out.println("Entered number is not even.");
            } catch (Exception ex) {
                System.out.println("This is not a number! ");
            }
        }
        System.out.println("Even number entered: " + n);
    }
}
