import java.util.Scanner;

/**
 * Created by User on 16.3.2017 г..
 */
public class p04_BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

         if (firstNumber > secondNumber){
             System.out.println(firstNumber);
         }else{
             System.out.println(secondNumber);
         }



    }
}
