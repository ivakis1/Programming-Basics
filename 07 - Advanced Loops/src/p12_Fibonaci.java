import java.util.Scanner;

/**
 * Created by User on 16.4.2017 г..
 */
public class p12_Fibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int f1 = 1;
        int f0 = 1;
        int currentNum;

        for (int i = 2; i <=n; i++) {

            currentNum = f0+ f1;
            f0 = f1;
            f1 = currentNum;


        }
        System.out.println(f1);
    }
}
