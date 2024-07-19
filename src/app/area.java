import java.util.Locale;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTriangle, areaCircle, areaTrapezium, areaSquare, areaRectangle;

        System.out.print("Informe o valor de A:");
        A = sc.nextDouble();
        System.out.print("Informe o valor de B:");
        B = sc.nextDouble();
        System.out.print("Informe o valor de C:");
        C = sc.nextDouble();

        areaTriangle = (A * C)/2;
        areaCircle = 3.14159 * Math.pow(C, 2);
        areaTrapezium = ((A + B) * C)/2;
        areaSquare = Math.pow(B, 2);
        areaRectangle = (A * B);

        System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
        System.out.printf("CIRCULO: %.3f%n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f", areaRectangle);

        sc.close();
    }
}
