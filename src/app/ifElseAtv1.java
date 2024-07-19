import java.util.Scanner;

public class ifElseAtv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        System.out.print((num > 0) ? "POSITIVO" : "NEGATIVO");

        sc.close();
    }
}
