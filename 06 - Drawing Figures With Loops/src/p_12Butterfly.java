import java.util.Scanner;

/**
 * Created by User on 11.4.2017 г..
 */
public class p_12Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n-2 ; i++) {
            if ( i % 2 !=0){
                String text = repeatStr("*", n-2) + "\\"+" "+"/"+repeatStr("*", n-2);
                System.out.println(text);
            }else {
                String text = repeatStr("-", n-2) + "\\"+" "+"/"+repeatStr("-", n-2);
                System.out.println(text);
            }
        }
        System.out.println(repeatStr(" ", n-1)+"@"+ repeatStr(" ", n-1));

        for (int i = 1; i <= n-2 ; i++) {
            if ( i % 2 !=0){
                String text = repeatStr("*", n-2) + "/"+" "+"\\"+repeatStr("*", n-2);
                System.out.println(text);
            }else {
                String text = repeatStr("-", n-2) + "/"+" "+"\\"+repeatStr("-", n-2);
                System.out.println(text);
            }


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
