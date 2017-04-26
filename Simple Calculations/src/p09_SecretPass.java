import java.util.Scanner;

/**
 * Created by User on 16.3.2017 г..
 */
public class p09_SecretPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String CorrectPass = "s3cr3t!P@ssw0rd";

        if (password.equals(CorrectPass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }




    }
}
