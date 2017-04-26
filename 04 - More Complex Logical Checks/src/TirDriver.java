import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class TirDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine().toLowerCase();
        double distance = Double.parseDouble(scanner.nextLine());

        if (distance<=5000){
            if (season.equals("spring")){
                double salary = ((distance*0.75)*4);
                double taxes = salary*0.1;
                double netsalary = salary-taxes;
                System.out.printf("%.2f", netsalary);
            }else if (season.equals("autumn")){
                double salary = (distance*0.75)*4;
                double Taxes = salary*0.1;
                double netSalary = salary - Taxes;
                System.out.printf("%.2f", netSalary);
            }else if (season.equals("summer")){
                double salary = (distance*0.90)*4;
                double Taxes = salary*0.1;
                double netSalary = salary - Taxes;
                System.out.printf("%.2f", netSalary);
            }else if (season.equals("winter")){
                double salary = (distance*1.05)*4;
                double Taxes = salary*0.1;
                double netSalary = salary - Taxes;
                System.out.printf("%.2f", netSalary);
            }
        } else if (distance<=10000){
            if (season.equals("spring")){
                double salary = (distance*0.95)*4;
                double taxes = salary*0.1;
                double netsalary = salary-taxes;
                System.out.printf("%.2f", netsalary);
            }else if (season.equals("autumn")){
                double salary = (distance*0.95)*4;
                double Taxes = salary*0.1;
                double netSalary = salary - Taxes;
                System.out.printf("%.2f", netSalary);
            }else if (season.equals("summer")){
                double salary = (distance*1.10)*4;
                double Taxes = salary*0.1;
                double netSalary = salary - Taxes;
                System.out.printf("%.2f", netSalary);
            }else if (season.equals("winter")){
                double salary = (distance*1.25)*4;
                double Taxes = salary*0.1;
                double netSalary = salary - Taxes;
                System.out.printf("%.2f", netSalary);
            }
        } else if (distance<= 20000){
            double salary = (distance*1.45)*4;
            double Taxes = salary*0.1;
            double netSalary = salary - Taxes;
            System.out.printf("%.2f", netSalary);
        }

    }
}
