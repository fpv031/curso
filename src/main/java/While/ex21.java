package While;

public class ex21 {
    public static void main(String[] args) {
        int num = 1, contador = 0;

        do {
            int somaDivisores = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == num) {
                System.out.println(num);
                contador++;
            }

            num++;
        } while (contador < 10);
    }
}
