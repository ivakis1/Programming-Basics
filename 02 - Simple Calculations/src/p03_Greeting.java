import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class p03_Greeting {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
      //  System.out.print("Enter your name: ");
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);

    }
}
