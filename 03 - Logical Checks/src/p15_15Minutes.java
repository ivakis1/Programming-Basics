import java.util.Scanner;

/**
 * Created by User on 18.3.2017 г..
 */
public class p15_15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hours = Double.parseDouble(scanner.nextLine());
        double minutes = Double.parseDouble(scanner.nextLine());

        minutes += 15;

        if (minutes > 59) {
            hours += 1;
            minutes -= 60;
        }
        if (hours > 23) {
            hours = 0;
        }
        if (minutes<10){
            System.out.printf("%.0f:0%.0f",hours, minutes);
        }else{
            System.out.printf("%.0f:%.0f", hours, minutes);
        }


    }
}
