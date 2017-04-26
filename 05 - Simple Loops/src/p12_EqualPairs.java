import java.util.Scanner;

/**
 * Created by User on 2.4.2017 г..
 */
public class p12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxDiff = 0;
        int lastSum = 0;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int currentSum = num1+num2;
            int currentDiff = Math.abs(currentSum - lastSum);

            if (i>0 && maxDiff<currentDiff){
                maxDiff = currentDiff;
            }
            lastSum = currentSum;
        }

        if (maxDiff == 0){
            System.out.printf("Yes, value=%d", lastSum);
        }else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }

    }
}
