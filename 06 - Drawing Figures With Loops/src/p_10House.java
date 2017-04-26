import java.util.Scanner;

/**
 * Created by User on 9.4.2017 г..
 */
public class p_10House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int middleRoof = (n + 1) % 2 + 1;

        for (int i = 0; i < (n+1)/2 ; i++) {
            int roofLeftRight = (n - middleRoof) / 2;

            System.out.printf("%s%s%s%n", repeatStr("-", roofLeftRight), repeatStr("*", middleRoof),
                    repeatStr("-", roofLeftRight));

            middleRoof += 2;

        }
        for (int i = 0; i < n / 2 ; i++) {
            System.out.printf("|%s|%n", repeatStr("*",n-2 ));

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
