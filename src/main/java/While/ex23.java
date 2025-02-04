package While;

public class ex23 {
    public static void main(String[] args) {
        int n = 1, termo = 1, contador = 1;

        do {
            System.out.println(termo);
            n++;
            termo += n;
            contador++;
        } while (contador <= 10);
    }
}
