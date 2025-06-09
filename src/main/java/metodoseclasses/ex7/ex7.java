import java.util.Scanner;

public static void ex7 (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers:");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int higher = findHigher(a, b, c);
    System.out.println("Higher = " + higher);

    sc.close();
}

// Função para encontrar o maior número
public static int findHigher (int a, int b, int c) {
    if (a > b && a > c) {
        return a;
    } else if (b > c) {
        return b;
    } else {
        return c;
    }
}

public void main() {
}
