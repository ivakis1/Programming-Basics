import java.util.Scanner;

/**
 * Created by User on 17.3.2017 г..
 */
public class p12_SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10){
            System.out.println("slow");
        }else if (speed <= 50){
            System.out.println("average");
        }else if (speed<=150){
            System.out.println("fast");
        }else if (speed<=1000){
            System.out.println("ultra fast");
        }else if (speed>1000){
            System.out.println("extremely fast");
        }
    }
}
