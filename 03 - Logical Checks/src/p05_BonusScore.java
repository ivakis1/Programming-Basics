import java.util.Scanner;

/**
 * Created by User on 16.3.2017 г..
 */
public class p05_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double bonusScore = 0;

        if (num <= 100) {
            bonusScore = bonusScore + 5;
        } else if (num <= 1000) {
            bonusScore = num * 0.2;
        } else if (num > 1000) {
            bonusScore = num * 0.1;
        }

        if (num % 2 == 0) {
            bonusScore = bonusScore + 1;
        } else if (num % 5 == 0) {
            bonusScore = bonusScore + 2;
        }

        System.out.println(bonusScore);
        System.out.println(bonusScore + num);


    }
}
