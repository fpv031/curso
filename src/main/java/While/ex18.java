package While;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num != 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " é par.");
                } else {
                    System.out.println(num + " é ímpar.");
                }
            }
        } while (num != 0);
        sc.close();
    }
}
