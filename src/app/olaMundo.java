package app;

import java.util.Locale;

public class olaMundo {

    public static void main(String[] args) {
        System.out.println("Ola mundo!");

        double x = 10.857294;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        String name = "Maria";
        int age = 58;
        double renda = 5000.0;

        System.out.printf("%s tem %d anos e recebe R$%.2f por mes.", name, age, renda);
    }
}
