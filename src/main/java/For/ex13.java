package For;

public class ex13 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
