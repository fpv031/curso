package For;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
             sc.close();
        }
    }
}
