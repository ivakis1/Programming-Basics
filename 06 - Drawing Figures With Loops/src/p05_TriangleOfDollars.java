import java.util.Scanner;

/**
 * Created by User on 5.4.2017 г..
 */
public class p05_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++) {
            System.out.print('$');

            for (int col = 0; col < row; col++) {
                System.out.print(" $");
            }

            System.out.println();
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
