import java.util.Scanner;

/**
 * Created by User on 16.4.2017 г..
 */
public class p08_Factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int fact = 1;

        do {
            fact = fact * a;
            a--;

        } while (a > 1);
        System.out.println(fact);

    }
}
