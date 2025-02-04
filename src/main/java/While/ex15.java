package While;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor máximo: ");
        int max = sc.nextInt();
        int a = 0, b = 1;

        do {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        } while (a <= max);
        sc.close();
    }
}
