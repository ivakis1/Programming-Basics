import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class p10_TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double comission = -1;

        if (city.equals("sofia")){
            if (sales >= 0 && sales<=500){
                comission = 0.05;
            }else if (sales >500 && sales<=1000){
                comission = 0.07;
            } else if (sales > 1000 && sales<=10000){
                comission = 0.08;
            }else if (sales > 10000){
                comission = 0.12;
            }
        }else if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                comission = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                comission = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                comission = 0.1;
            } else if (sales > 10000) {
                comission = 0.13;
            }
        }else if (city.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                comission = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                comission = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                comission = 0.12;
            } else if (sales > 10000) {
                comission = 0.145;
            }
        }

        if (comission >= 0){
            System.out.printf("%.2f", sales * comission);
        }else {
            System.out.println("error");
        }
    }

}
