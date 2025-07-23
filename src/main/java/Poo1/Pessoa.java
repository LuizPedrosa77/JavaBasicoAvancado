package Poo1;

public class Pessoa {
    // MODIFICADORES DE ACESSOS -> public - private - protected

    /**

     Atributos: São variáveis que armazenam dados e possuem modificadores de acesso que são:
     Como boa prática, é recomendável utilizar o modificador (private)

     Na classe 'Pessoa' o que seria interessante como variáveis que pudesse armazenar dados para serem manipulados
     todos de uma vez no meu programa:
     */

    // De modo geral, uma Classe representa uma estrutura padronizada expecífica


    // Atributos
    private String nome;
    private String cpf;
    private int idade;
    private String whatsapp;


    // Construtores

    /**
     O java tem 2 tipos de construtores:
     1. Padrão
     2. Já recebe parâmetros

     A palavra RESERVADA (this) serve para acessar específicamente tudo que está dentro da classe

     */

    // Construtor padrao
    public Pessoa() {
        nome = "";
        cpf = "";
        idade = 0;
        whatsapp = "";
    }


    //Construtor com parametros
    public Pessoa (String nome, String cfp, int idade, String whatsapp) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.whatsapp = whatsapp;
    }

    // Metodos

    /**
     Metodos -> São ações que representam comportamentos da minha Classe.
     Há 4 métodos que podemos usar:

     1. Sem retorno e sem parametro -> public void setNome() {}
     2. Sem retorno e com parametro -> public void setNome(String nome) {}
     3. Com retorno e sem parametro -> public String getNome() {}
     4. Com retorno e com parametro -> public String getApresentacao() {}
     */

    // public -> É o metodo que permite eu alterar variaveis dentro do construtor e tambem dentro de outra classe externa
    // void -> Serve para dar uma ordem para fazer aquela determinada atividade e pronto.
    // set -> alterar ou atualizar ou inserir uma informação
    // get -> pegar em inglês - vai recuperar a informação
    // Metodos Sem retorno e com retorno




    // sem retorno e com parametros
    public void setNome(String nome) {   // Este é o metodo sem retorno e com parametro pois tem algo entre parenteses '()'
        this.nome = nome;    // this -> pode ser usado para diferenciar um atributo da Classe ou referir a mesma instancia
    }

    public String getNome() {  //Como é nome, usa-se String (texto)
        return nome;  // return -> retorna para a Classe principal
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;  // this -> pode ser usado para diferenciar um atributo da Classe ou referir a mesma instancia
    }

    public String getCpf() {  //Como é nome, usa-se String (texto)
        return cpf;  // return -> retorna para a Classe principal
    }

    public void setIdade(int idade) {
        this.idade = idade;  // this -> pode ser usado para diferenciar um atributo da Classe ou referir a mesma instancia
    }

    public int getIdade() {  //Como é nome, usa-se String (texto)
        return idade;  // return -> retorna para a Classe principal
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;   // this -> pode ser usado para diferenciar um atributo da Classe ou referir a mesma instancia
    }

    public String getWhatsapp() {  //Como é nome, usa-se String (texto)
        return whatsapp;  // return -> retorna para a Classe principal
    }

    // Metodo sem retorno e sem parametro
    public void apresentar() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(idade);
        System.out.println(whatsapp);
    }

    // Metodo com retorno e com parametro
    public String getApresentacao() {
        return (nome+","+cpf+", "+idade+", "+whatsapp);
    }


}
