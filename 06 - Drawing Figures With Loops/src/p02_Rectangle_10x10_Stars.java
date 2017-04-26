/**
 * Created by User on 5.4.2017 г..
 */
public class p02_Rectangle_10x10_Stars {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            String text = repeatStr("*", 10);
            System.out.println(text);

        }


    }
    static String repeatStr (String strToRepeat, int count){
        String text = "";
        for (int i = 0; i <count ; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
