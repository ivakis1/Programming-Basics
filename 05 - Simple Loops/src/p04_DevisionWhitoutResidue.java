import java.util.Scanner;

/**
 * Created by User on 5.4.2017 г..
 */
public class p04_DevisionWhitoutResidue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0){
                p1++;
            }
            if ( num % 3 == 0){
                p2++;
            }
            if ( num % 4 == 0){
                p3++;
            }
        }

        System.out.printf("%.2f%%%n", (double) p1/n * 100);
        System.out.printf("%.2f%%%n", (double) p2/n * 100);
        System.out.printf("%.2f%%%n", (double) p3/n * 100);
    }
}
