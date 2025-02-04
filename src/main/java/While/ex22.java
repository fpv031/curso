package While;

public class ex22 {
    public static void main(String[] args) {
        int num = 2, contador = 0;

        do {
            boolean primo = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num);
                contador++;
            }

            num++;
        } while (contador < 10);
    }
}
