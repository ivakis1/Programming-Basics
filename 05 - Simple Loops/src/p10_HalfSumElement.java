import java.util.Scanner;

/**
 * Created by User on 30.3.2017 г..
 */
public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currNum;

            if (currNum > max) {
                max = currNum;
            }
        }
        sum = sum - max;
        int diff = Math.abs(sum - max);

        if (diff == 0) {
            System.out.println("Yes ");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("No ");
            System.out.println("Diff = " + diff);
        }
    }
}
