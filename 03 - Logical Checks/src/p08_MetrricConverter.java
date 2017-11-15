import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by User on 16.3.2017 г..
 */
public class p08_MetrricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Value = Double.parseDouble(scanner.nextLine());

        String inputMetric = scanner.nextLine().toLowerCase();
        String outputMetric = scanner.nextLine().toLowerCase();


        if (inputMetric.equals("mm")){
            Value = Value / 1000;
        }else if (inputMetric.equals("cm")){
            Value = Value / 100;
        }else if (inputMetric.equals("mi")){
            Value = Value / 0.000621371192;
        }else if (inputMetric.equals("in")){
            Value = Value / 39.3700787;
        }else if (inputMetric.equals("km")){
            Value = Value / 0.001;
        }else if (inputMetric.equals("ft")){
            Value = Value / 3.2808399;
        }else if (inputMetric.equals("yd")){
            Value = Value / 1.0936133;
        }

        if (outputMetric.equals("mm")){
            Value = Value * 1000;
        }else if (outputMetric.equals("cm")){
            Value = Value * 100;
        }else if (outputMetric.equals("mi")){
            Value = Value * 0.000621371192;
        }else if (outputMetric.equals("in")){
            Value = Value * 39.3700787;
        }else if (outputMetric.equals("km")){
            Value = Value * 0.001;
        }else if (outputMetric.equals("ft")){
            Value = Value * 3.2808399;
        }else if (outputMetric.equals("yd")){
            Value = Value * 1.0936133;
        }

//        DecimalFormat format = new DecimalFormat("#.###############");
//
//        System.out.printf(format.format(Value)+ " " + outputMetric);

        System.out.printf("%.8f %s", Value, outputMetric);

    }
}
