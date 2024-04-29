public class Pessoa {
    // Atributo para armazenar o nome da pessoa
    private String nome;

    // Construtor da classe Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
        this.nome = this.nome + "teste";

    }

    // Método para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para mostrar o nome da pessoa
    public void mostrarNome() {
        System.out.println("O nome da pessoa é: " + nome);
    }

    // Método main para testar a classe Pessoa
    public static void main(String[] args) {
        // Criando uma nova pessoa com nome "João"
        Pessoa pessoa = new Pessoa("João");
        
        // Mostrando o nome da pessoa
        pessoa.mostrarNome();
    }
}
