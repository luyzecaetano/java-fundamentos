import java.util.Locale;
import java.util.Scanner;

public class ifElseAtv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt(), amount = sc.nextInt();
        double total;

        if (code == 1) {
            total = amount * 4.0;
        } else if (code == 2) {
            total = amount * 4.5;
        } else if (code == 3) {
            total = amount * 5.0;
        } else if (code == 4) {
            total = amount * 2.0;
        } else {
            total = amount * 1.5;
        }

        System.out.printf("Total: R$ %.2f", total);

        sc.close();
    }
}
