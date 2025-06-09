package While.ex25;

public class ex25 {
    public static void main(String[] args) {
        int i = 1, j;

        do {
            j = 1;
            do {
                System.out.print(i + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);
    }
}
