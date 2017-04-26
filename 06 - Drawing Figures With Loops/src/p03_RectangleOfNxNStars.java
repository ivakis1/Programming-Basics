import java.util.Scanner;

/**
 * Created by User on 5.4.2017 г..
 */
public class p03_RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String text = repeatStr("*", n);
            System.out.println(text);
        }



    }
    static String repeatStr (String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
