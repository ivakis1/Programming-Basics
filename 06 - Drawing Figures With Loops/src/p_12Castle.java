import java.util.Scanner;

/**
 * Created by User on 9.4.2017 г..
 */
public class p_12Castle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n  = Integer.parseInt(scanner.nextLine());
        int middlePart =  n * 2 - (n / 2) * 2 - 4; // 2

        String firstRow = "/" + repeatStr("^", n/2)+ "\\" + repeatStr("_", middlePart) + "/"
                + repeatStr("^", n / 2) + "\\";
        System.out.println(firstRow);

        for (int i = 0; i < n - 3; i++) {
            System.out.println("|" + repeatStr(" ", n * 2 - 2)+ "|");
        }
       if (n > 4) {
           String preLastRow = "|" + repeatStr(" ", n / 2 + 1) + repeatStr("_", middlePart)
                   + repeatStr(" ", n / 2 + 1) + "|";
           System.out.println(preLastRow);
       }else{
           String preLastRow = "|" + repeatStr(" ", n / 2 + 1)
                   + repeatStr(" ", n / 2 + 1) + "|";
           System.out.println(preLastRow);
       }

        String lastRow = "\\" + repeatStr("_", n/2) + "/" + repeatStr(" ",middlePart)
                + "\\" + repeatStr("_", n/2) + "/";
        System.out.println(lastRow);


    }
    public static String repeatStr (String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
