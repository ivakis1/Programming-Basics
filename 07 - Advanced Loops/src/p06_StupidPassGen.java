import java.util.Scanner;

/**
 * Created by User on 23.4.2017 г..
 */
public class p06_StupidPassGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char l = (char) Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < n; i++) {
            for (int s = 1; s < n; s++) {
                for (char t = 'a'; t <'a'+ l; t++) {
                    for (char f = 'a'; f <'a'+ l; f++) {
                        for (int j = 1 ; j <= n; j++) {
                            if (j > s && j > i){
                                System.out.print("" + i + s + t + f + j + " ");
                            }

                        }
                    }
                }
            }

        }


    }
}
