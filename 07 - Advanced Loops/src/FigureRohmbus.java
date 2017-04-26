import java.util.Scanner;

/**
 * Created by User on 14.4.2017 г..
 */
public class FigureRohmbus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int r = 1; r <= n; r++) {
            String text = repeatStr(" ", n - r) + "* " + repeatStr("* ", r - 1);

            System.out.println(text);

        }
        for (int r = n-1; r >= 1; r--) {
            String text = repeatStr(" ", n - r) + "* " + repeatStr("* ", r - 1);

            System.out.println(text);


        }

    }static String repeatStr(String stringToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += stringToRepeat;
        }
        return text;
    }
}
