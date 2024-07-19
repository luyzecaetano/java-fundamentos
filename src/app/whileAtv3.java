package app;

import java.util.Scanner;

public class whileAtv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcohol = 0, gasoline = 0, diesel = 0;

        System.out.println("BEM VINDO!");
        System.out.println("1. ALCOOL");
        System.out.println("2. GASOLINA");
        System.out.println("3. DIESEL");
        System.out.println("4. FIM");

        int code = sc.nextInt();

        while (code != 4) {
            if (code == 1) {
                    alcohol += 1;
            } else if (code == 2) {
                    gasoline += 1;
            } else if (code == 3) {
                    diesel += 1;
            } else {
                System.out.println("CODIGO INVALIDO, DIGITE NOVAMENTE");
            }

            code = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("ALCOOL: " + alcohol);
        System.out.println("GASOLINA: " + gasoline);
        System.out.println("DIESEL: " + diesel);
    }
}
