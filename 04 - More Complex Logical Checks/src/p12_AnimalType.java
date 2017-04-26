import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class p12_AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();

        switch (type){
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");

        }
    }
}
