import java.util.Scanner;

public class ifElseAtv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.print((num % 2 == 0) ? "PAR" : "IMPAR");

        sc.close();
    }
}
