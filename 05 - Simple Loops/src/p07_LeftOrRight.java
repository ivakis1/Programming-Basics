import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class p07_LeftOrRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;


        for (int i = 0; i <n; i++) {
            int left = Integer.parseInt(scanner.nextLine());
            sumLeft += left;

        }
        for (int i = 0; i <n; i++) {
            int right = Integer.parseInt(scanner.nextLine());
            sumRight += right;

        } int diff = Math.abs(sumRight-sumLeft);

        if (diff == 0){
            System.out.printf("Yes, sum = %d%n", sumLeft);
        }else{
            System.out.printf("No, diff = %d%n", diff);
        }
    }
}
