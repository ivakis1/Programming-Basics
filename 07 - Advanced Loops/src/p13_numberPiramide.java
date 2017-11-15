import java.util.Scanner;

/**
 * Created by User on 16.4.2017 г..
 */
public class p13_numberPiramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;

        for (int row = 1; n >= count; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
                if (count > n) {
                    break;
                }

            }
            System.out.println();
        }
    }
}
