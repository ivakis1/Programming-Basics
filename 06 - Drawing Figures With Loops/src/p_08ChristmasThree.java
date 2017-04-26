import java.util.Scanner;

/**
 * Created by User on 8.4.2017 г..
 */
public class p_08ChristmasThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        String topRow = repeatStr(" ", n) + " |" + repeatStr(" ", n);
        System.out.println(topRow);

        for (int i = 0; i <n ; i++) {
            String tree = repeatStr(" ", n - 1 - i) + repeatStr("*", 1 + i)
                    + " | " + repeatStr("*", 1 + i);
            System.out.println(tree);


        }
        
        
    }
    static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text += strToRepeat;
            
        }
        return text;
    }
}
