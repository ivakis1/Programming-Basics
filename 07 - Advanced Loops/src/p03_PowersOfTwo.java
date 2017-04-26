import java.util.Scanner;

/**
 * Created by User on 12.4.2017 г..
 */
public class p03_PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        System.out.println(num);

        for (int i = 0; i < n ; i++) {

            num = num *2;

            System.out.println(num);

        }
    }
}
