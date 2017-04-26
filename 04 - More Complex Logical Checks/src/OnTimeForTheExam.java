import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMin;
        int arrivalTime = arrivalHour * 60 + arrivalMin;

        int timeDiff = examTime - arrivalTime;

        if (timeDiff < 0) {
            System.out.println("Late");
            int hours = Math.abs(timeDiff) / 60;
            int mins = Math.abs(timeDiff) - hours * 60;

            if (hours > 0) {
                System.out.printf("%d:%02d hours after the start", hours, mins);
            } else {
                System.out.printf("%d minutes after the start", mins);
            }

        } else if (timeDiff <= 30) {
            System.out.println("On time");
            if (timeDiff != 0) {
                System.out.printf("%d minutes before the start", timeDiff);
            }

        } else if (timeDiff > 30) {
            System.out.println("Early");
            int hours = Math.abs(timeDiff) / 60;
            int mins = Math.abs(timeDiff) - hours * 60;

            if (hours > 0) {
                System.out.printf("%d:%02d hours before the start", hours, mins);
            } else {
                System.out.printf("%d minutes before the start", mins);
            }
        }
    }
}
