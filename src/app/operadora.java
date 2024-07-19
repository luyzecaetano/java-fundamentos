import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double valor = 50.0;

        minutos = sc.nextInt();

        if (minutos > 100) {
            valor += (minutos - 100) * 2;
        }

        System.out.printf("Valor a pagar: R$ %.2f", valor);

        sc.close();
    }
}
