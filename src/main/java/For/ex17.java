package For;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("String invertida: " + reversed);
        sc.close();
    }
}
