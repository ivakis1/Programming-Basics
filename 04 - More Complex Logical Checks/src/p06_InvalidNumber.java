import java.util.Scanner;

/**
 * Created by User on 21.3.2017 г..
 */
public class p06_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isInRange = number >= 100 && number<=200|| number==0;

        if (!isInRange){
            System.out.println("invalid");
        }
    }
}
