package app;

import java.util.Scanner;

public class whileAtv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha Invalida");
            password = sc.nextInt();
        }

        System.out.print("Acesso Permitido");

        sc.close();
    }
}
