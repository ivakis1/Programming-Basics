import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class p05_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
                if (currNum > max){ // 5, 10, 50, 40, 30, 100, 50
                    max = currNum;
                }

        }
        System.out.println(max);
    }
}
