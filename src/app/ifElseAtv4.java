import java.util.Scanner;

public class ifElseAtv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt(), endTime = sc.nextInt(), duration;

        if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = (24 - startTime) + endTime;
        }

        System.out.print("O JOGO DUROU " + duration + " HORA(S)");

        sc.close();
    }
}
