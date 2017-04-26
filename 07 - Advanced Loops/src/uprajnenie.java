import java.util.Scanner;

/**
 * Created by User on 22.4.2017 г..
 */
public class uprajnenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstLine = repeatStr("*", 2 * n ) + repeatStr(" ", n)
                + repeatStr("*", 2 * n );
        System.out.println(firstLine);

        for (int i = 0; i < n-2 ; i++) {
            if ( i == (n-1) / 2 - 1){
              String inside = "*" + repeatStr("/",  2* n-2)+ "*" + repeatStr("|", n)
                      + "*" + repeatStr("/", 2* n-2)+ "*";
                System.out.println(inside);

            }else{
                String inside = "*" + repeatStr("/", 2* n-2)+ "*" + repeatStr(" ", n)
                        + "*" + repeatStr("/", 2* n-2)+ "*";
                System.out.println(inside);

            }


        }
        System.out.println(firstLine);


    } static String repeatStr ( String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text + strToRepeat;

        }
        return text;
    }
}
