import java.util.Scanner;

/**
 * Created by User on 16.3.2017 г..
 */
public class p06_NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if(num == 1){
            System.out.println("one");
        }else if ( num == 2){
            System.out.print("two");
        }else if ( num == 3){
            System.out.print("three");
        }else if ( num == 4){
            System.out.print("four");
        }else if ( num == 5){
            System.out.print("five");
        }else if ( num == 6){
            System.out.print("six");
        }else if ( num == 7){
            System.out.print("seven");
        }else if ( num == 8){
            System.out.print("eight");
        }else if ( num == 9){
            System.out.print("nine");
        }else if ( num > 9){
            System.out.print("Number too big");
        }
    }
}
