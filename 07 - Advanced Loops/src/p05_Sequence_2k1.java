import java.util.Scanner;

/**
 * Created by User on 12.4.2017 г..
 */
public class p05_Sequence_2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int k = 1;

        while ( k <= n){
            System.out.println(k);

            k = k *2 + 1;

        }
    }
}
