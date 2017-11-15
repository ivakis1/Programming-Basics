import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class Days1000AfterBirth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String date = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate parsedDate = LocalDate.parse(date, formatter);

        parsedDate = parsedDate.plusDays(999);

        System.out.println(parsedDate.format(formatter));


    }

}
