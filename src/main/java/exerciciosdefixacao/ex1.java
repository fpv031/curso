package exerciciosdefixacao;

import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {
        String Product1 = "computador";
        String Product2 = "office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double Price1 =        2100.00;
        double Price2 =         650.00;
        double measure = 53.234566;

        System.out.println("Products");
        System.out.printf("%s, which price is $ %.2f%n",    Product1, Price1);
        System.out.printf("%s, which price is $ %.2f%n",    Product2, Price2);
        System.out.println();
        System.out.printf("Record:  %d years old,  code %d and gender: %c%n", age, code , gender);
        System.out.println();
        System.out.printf("measue with eight decial places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places):  %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }

}
