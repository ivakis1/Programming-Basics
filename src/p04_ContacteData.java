import java.util.Scanner;

/**
 * Created by User on 12.3.2017 г..
 */
public class p04_ContacteData {
    public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    String FirstName = console.nextLine();
    String LastName = console.nextLine();
    int age = Integer.parseInt(console.nextLine());
    String Town = console.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", FirstName,LastName,age,Town);


    }

}
