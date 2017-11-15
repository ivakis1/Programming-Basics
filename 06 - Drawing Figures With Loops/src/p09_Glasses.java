import java.util.Scanner;

public class p09_Glasses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLastRow = repeatStr("*", 2 * n)
                + repeatStr(" ", n)
                + repeatStr("*", 2 * n);

        System.out.println(firstAndLastRow);

        for (int i = 0; i < n - 2; i++) {

            if ((n - 1) / 2 - 1 == i) {
                String middlePart = "*"
                        + repeatStr("/", 2 * n - 2)
                        + "*" + repeatStr("|", n)
                        + "*" + repeatStr("/", 2 * n - 2)
                        + "*";

                System.out.println(middlePart);
            } else {
                String middlePart = "*"
                        + repeatStr("/", 2 * n - 2)
                        + "*" + repeatStr(" ", n)
                        + "*" + repeatStr("/", 2 * n - 2)
                        + "*";

                System.out.println(middlePart);
            }
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
