package app;

import java.util.Locale;
import java.util.Scanner;

public class ifElseAtv7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble(), y = sc.nextDouble();

        if (x==0 && y==0) {
            System.out.print("ORIGEM");
        } else if (y==0) {
            System.out.print("EIXO X");
        } else if (x==0) {
            System.out.print("EIXO Y");
        } else if (x>0 && y>0) {
            System.out.print("Q1");
        } else if (x<0 && y>0) {
            System.out.print("Q2");
        } else if (x<0 && y<0) {
            System.out.print("Q3");
        } else {
            System.out.print("Q4");
        }

        sc.close();
    }
}
