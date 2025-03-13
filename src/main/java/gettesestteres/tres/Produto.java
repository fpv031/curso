package gettesestteres.tres;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double precoInicial, int estoqueInicial) {
        this.nome = nome;
        setPreco(precoInicial);
        this.estoque = estoqueInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! O preço não pode ser negativo.");
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Estoque atualizado! Novo estoque: " + estoque);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Estoque atualizado! Novo estoque: " + estoque);
            return true;
        } else {
            System.out.println("Quantidade insuficiente no estoque ou quantidade inválida.");
            return false;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + estoque);
    }
}

