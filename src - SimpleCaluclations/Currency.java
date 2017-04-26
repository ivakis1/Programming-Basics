import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double USD = Double.parseDouble(scanner.nextLine());

       double BGN = USD*1.79549;

        System.out.printf("%.2f BGN", BGN);
      //  System.out.print(" BGN");


    }
}
