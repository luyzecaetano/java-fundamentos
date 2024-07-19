import java.util.Locale;
import java.util.Scanner;

public class ifElseAtv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if (num < 0.0 || num > 100.0 ) {
            System.out.print("FORA DE INTERVALO");
        } else if (num <= 25.0) {
            System.out.print("INTERVALO: [0,25]");
        } else if (num <= 50.0) {
            System.out.print("INTERVALO: (25,50]");
        } else if (num <= 75.0) {
            System.out.print("INTERVALO: (50,75]");
        } else {
            System.out.print("INTERVALO: (75,100]");
        }

        sc.close();
    }
}
