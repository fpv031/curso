package gettesestteres.tres;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o nome do produto: ");
    String nomeProduto = sc.nextLine();

    System.out.print("Digite o preço do produto: ");
    double precoProduto = sc.nextDouble();

    System.out.print("Digite a quantidade inicial em estoque: ");
    int estoqueInicial = sc.nextInt();

    Produto produto = new Produto(nomeProduto, precoProduto, estoqueInicial);

    produto.exibirDetalhes();

    System.out.print("\nDigite a quantidade a ser adicionada ao estoque: ");
    int quantidadeAdicionar = sc.nextInt();
    produto.adicionarEstoque(quantidadeAdicionar);

    System.out.print("\nDigite a quantidade a ser removida do estoque: ");
    int quantidadeRemover = sc.nextInt();
    produto.removerEstoque(quantidadeRemover);

    produto.exibirDetalhes();

    sc.close();
  }
}