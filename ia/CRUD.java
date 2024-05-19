import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;
    private String sexo;

    public Pessoa(String nome, String endereco, String cpf, int idade, String sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

public class CRUD {

    private static List<Pessoa> pessoas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Atualizar Pessoa");
            System.out.println("4. Deletar Pessoa");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    adicionarPessoa();
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    atualizarPessoa();
                    break;
                case 4:
                    deletarPessoa();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void adicionarPessoa() {
        System.out.println("Nome:");
        String nome = scanner.nextLine();
        System.out.println("Endereço:");
        String endereco = scanner.nextLine();
        System.out.println("CPF:");
        String cpf = scanner.nextLine();
        System.out.println("Idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Sexo:");
        String sexo = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, endereco, cpf, idade, sexo);
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso.");
    }

    private static void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada ainda.");
            return;
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Endereço: " + pessoa.getEndereco());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Sexo: " + pessoa.getSexo());
            System.out.println("--------------------");
        }
    }

    private static void atualizarPessoa() {
        System.out.println("Digite o CPF da pessoa que deseja atualizar:");
        String cpf = scanner.nextLine();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("Novo Nome:");
                pessoa.setNome(scanner.nextLine());
                System.out.println("Novo Endereço:");
                pessoa.setEndereco(scanner.nextLine());
                System.out.println("Nova Idade:");
                pessoa.setIdade(scanner.nextInt());
                scanner.nextLine(); // Limpar o buffer
                System.out.println("Novo Sexo:");
                pessoa.setSexo(scanner.nextLine());
                System.out.println("Pessoa atualizada com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    private static void deletarPessoa() {
        System.out.println("Digite o CPF da pessoa que deseja deletar:");
        String cpf = scanner.nextLine();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoas.remove(pessoa);
                System.out.println("Pessoa deletada com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}
