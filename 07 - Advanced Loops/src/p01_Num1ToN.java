import java.util.Scanner;

/**
 * Created by User on 12.4.2017 г..
 */
public class p01_Num1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
