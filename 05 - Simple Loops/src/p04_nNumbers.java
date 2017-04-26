import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class p04_nNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        } System.out.println(sum);
    }
}
