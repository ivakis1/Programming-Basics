import java.util.Scanner;

/**
 * Created by User on 16.3.2017 г..
 */
public class p02_ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 5.5){
            System.out.println("Excellent!");
        }else {
            System.out.println("Not excellent.");
        }


    }
}
