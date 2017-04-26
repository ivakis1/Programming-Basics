import java.util.Scanner;

/**
 * Created by User on 16.3.2017 г..
 */
public class p11_EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine().toLowerCase();
        String word2 = scanner.nextLine().toLowerCase();

        if (word1.equals(word2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
