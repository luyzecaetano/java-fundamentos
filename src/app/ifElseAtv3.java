import java.util.Scanner;

public class ifElseAtv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt();

        System.out.print((A%B==0 || B%A==0) ? "MULTIPLOS" : "NAO SAO MULTIPLOS");

        sc.close();
    }
}
