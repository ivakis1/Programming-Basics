import java.util.Scanner;

/**
 * Created by User on 17.3.2017 г..
 */
public class p16_equalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        if(a == b && b==c && a==c){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
