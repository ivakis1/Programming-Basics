import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class p08_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;

        for (int i =0; i <n; i++) {
              if (i % 2 !=0){
                  odd = odd + Integer.parseInt(scanner.nextLine());
              }else {
                  even = even + Integer.parseInt(scanner.nextLine());
              }
        }int diff = Math.abs(even-odd);

        if (diff == 0){
            System.out.printf("Yes, sum = %d%n", even);
        }else {
            System.out.printf("No, diff = %d%n", diff);
        }
    }
}
