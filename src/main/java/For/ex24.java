package For;

public class ex24 {
    public static void main(String[] args) {
        int n = 10;
        int triangular = 0;
        for (int i = 1; i <= n; i++) {
            triangular += i;
            System.out.println("Termo " + i + ": " + triangular);
        }
    }
}
