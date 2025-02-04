package While;

public class ex6 {
    public static void main(String[] args) {
        int i = 1, soma = 0;

        do {
            soma += i;
            i++;
        } while (i <= 50);

        System.out.println("Soma dos números de 1 a 50: " + soma);
    }
}
