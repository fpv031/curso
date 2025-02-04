package While;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        int i = 0;

        do {
            System.out.println(str.charAt(i));
            i++;
        } while (i < str.length());
          sc.close();
    }
}
