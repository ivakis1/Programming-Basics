import java.util.Scanner;

/**
 * Created by User on 7.4.2017 г..
 */
public class p06_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String firstAndLastRow = "+ " + repeatStr("- ", n - 2) + "+";
        System.out.println(firstAndLastRow);


        for (int i = 0; i < n - 2; i++) {
            String innerLine = "| " + repeatStr("- ", n - 2) + "|";
            System.out.println(innerLine);
        }

        System.out.println(firstAndLastRow);


    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
