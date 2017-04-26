import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class p09_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i <text.length() ; i++) {
            char currSymb = text.charAt(i);

            switch (currSymb){
                case 'a':
                   sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }

        }
        System.out.println(sum);

    }
}
