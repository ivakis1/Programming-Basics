import java.text.DecimalFormat;
import java.util.Scanner;

public class p11_OddEvenPossition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double evenSum = 0;
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;
        double oddSum = 0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 1) {
                oddSum += num;

                if (num > oddMax) {
                    oddMax = num;
                }

                if (num < oddMin) {
                    oddMin = num;
                }

            } else {
                evenSum += num;

                if (num > evenMax) {
                    evenMax = num;
                }

                if (num < evenMin) {
                    evenMin = num;
                }

            }

        }
        DecimalFormat format = new DecimalFormat("#.#############");
        System.out.printf("OddSum=%s, ", format.format(oddSum));
        if (oddMin == Integer.MAX_VALUE) {
            System.out.printf("OddMin=No, ");
            System.out.printf("OddMax=No, ");
        } else {
            System.out.printf("OddMin=%s, ", format.format(oddMin));
            System.out.printf("OddMax=%s, ", format.format(oddMax));
        }
        System.out.printf("EvenSum=%s, ", format.format(evenSum));
        if (evenMin == Integer.MAX_VALUE) {
            System.out.printf("EvenMin=No, ");
            System.out.printf("EvenMax=No, ");
        } else {
            System.out.printf("EvenMin=%s, ", format.format(evenMin));
            System.out.printf("EvenMax=%s ", format.format(evenMax));
        }

    }
}
