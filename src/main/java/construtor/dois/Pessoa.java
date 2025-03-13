package construtor.dois;

    public class Pessoa {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public Pessoa() {
            this.nome = "Desconhecido";
            this.idade = 0;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
        }
    }

