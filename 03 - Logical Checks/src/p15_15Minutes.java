import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by User on 18.3.2017 г..
 */
public class p15_15Minutes {
    private static Date DateUtilis;

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 15;

        if (minutes > 59) {
            hours += 1;
            minutes -= 60;
        }
        if (hours > 23) {
            hours = 0;
        }
//        if (minutes < 10) {
//            System.out.printf("%.0f:0%.0f", hours, minutes);
//        } else {
//            System.out.printf("%.0f:%.0f", hours, minutes);
//        }

        System.out.printf("%d:%02d", hours, minutes);


//        String myTime = hours +":" + minutes;
//        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
//        Date d = df.parse(myTime);
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(d);
//        cal.add(Calendar.MINUTE, 15);
//        String newTime = df.format(cal.getTime());
//
//        System.out.println(newTime);
    }
}
