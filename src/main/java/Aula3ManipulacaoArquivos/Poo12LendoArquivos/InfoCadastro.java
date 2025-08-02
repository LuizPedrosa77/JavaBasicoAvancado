package Aula3ManipulacaoArquivos.Poo12LendoArquivos;

public class InfoCadastro {

    // Atributos contido dentro do arquivo
    private String nome;
    private String cpf;
    private int idade;
    private char sexo;
    private String dataNascimento;
    private double salario;
    private String cargo;


    // Construtor dos atributos
    public InfoCadastro(String nome, String cpf, int idade, char sexo,
                        String dataNascimento, double salario, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Metodo de apresentação do construtor
    public void apresentar() {

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        String sexoTexto = sexo == 'm' ? "Masculino" : "Feminino"; // Esse if ternario é apenas para escrever Masculino ou Feminino
        System.out.println("Sexo: " + sexoTexto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("------------------------");
    }



}
