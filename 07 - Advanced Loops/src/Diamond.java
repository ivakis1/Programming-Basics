import java.util.Scanner;

/**
 * Created by User on 14.4.2017 г..
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());



        if ( n % 2 == 0) {
            int leftRight = (n - 1) / 2;
            for (int i = 0; i < n/2 ; i++) {


                System.out.printf(repeatStr("-", leftRight) + "*");
                System.out.printf(repeatStr("-", n - 2 * leftRight - 2) + "*");
                System.out.println(repeatStr("-", leftRight));

                leftRight--;
            }
            leftRight +=2;
            for (int i = 0; i < n/2 -1  ; i++) {
                System.out.printf(repeatStr("-", leftRight) + "*");
                System.out.printf(repeatStr("-", n - 2 * leftRight - 2)+ "*");
                System.out.println(repeatStr("-", leftRight));

                leftRight++;

            }


        } else {
            int leftRight = (n - 1) / 2;
            System.out.printf(repeatStr("-", leftRight) + "*" + repeatStr("-", leftRight) + "%n");
            leftRight--;

            for (int i = 0; i < n/2 ; i++) {


                System.out.printf(repeatStr("-", leftRight)+ "*");
                System.out.printf(repeatStr("-", n - 2 * leftRight - 2) + "*");
                System.out.println(repeatStr("-", leftRight));

                leftRight--;
            }
            leftRight +=2;
            for (int i = 0; i < n/2 -1  ; i++) {
                System.out.printf(repeatStr("-", leftRight)+ "*");
                System.out.printf(repeatStr("-", n - 2 * leftRight - 2)+ "*");
                System.out.println(repeatStr("-", leftRight));

                leftRight++;

            }
            if (n > 1) {
                System.out.printf(repeatStr("-", leftRight) + "*" + repeatStr("-", leftRight) + "%n");
            }

        }
    }
    static String repeatStr (String strToRepeat, int count){
        String text = ""; //----------
        for (int i = 0; i <count ; i++) {
            text+=strToRepeat;
        }
        return text;
    }
}
