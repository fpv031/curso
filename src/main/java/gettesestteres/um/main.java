package gettesestteres.um;

import java.util.Scanner;

public class main {
        public static void Main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Pessoa pessoa = new Pessoa();

            System.out.print("Digite o nome: ");
            pessoa.setNome(sc.nextLine());

            System.out.print("Digite a idade: ");
            pessoa.setIdade(sc.nextInt());

            System.out.println("\nDados da pessoa:");
            pessoa.exibirDados();

            sc.close();
        }
    }
