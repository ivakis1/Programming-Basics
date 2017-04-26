import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double bgn = Double.parseDouble(scan.nextLine());
        String inputCurrency = scan.nextLine();
        String outputCurrency = scan.nextLine();


        if (inputCurrency.equals("USD")){
            bgn = bgn * 1.79549;
        }else if (inputCurrency.equals("EUR")){
            bgn = bgn * 1.95583;
        } else if (inputCurrency.equals("GBP")){
            bgn = bgn*2.53405;
        }

        if (outputCurrency.equals("USD")){
            bgn = bgn / 1.79549;
        } else if (outputCurrency.equals("EUR")){
            bgn = bgn / 1.95583;
        } else if (outputCurrency.equals("GBP")){
            bgn = bgn / 2.53405;
        }


        System.out.printf("%.2f %s", bgn, outputCurrency);
    }


}
