package Poo8Naruto;

public class Main {
    public static void main(String[] args) {

        // Instaciando os objetos da classe Aldeia
        Aldeia folha = new Aldeia("Aldeia da Folha");
        Aldeia areia = new Aldeia("Aldeia da Areia");

        // Instanciando os objetos da classe Pessoa
        Pessoa ichiraku = new Pessoa("Ichiraku", 65.2, 1.75,"Cozinheiro");
        Pessoa maeDaIno = new Pessoa("Mae da Ino", 60.3,1.68,"Florista");


        // Instanciando o Objeto da classe Naturo e Sasuke
        Naruto naruto = new Naruto("Naruto", 60, 1.69,"Ninja","Uzumaki", "Folha", 2);
        Sasuke sasuke = new Sasuke("Sasuke", 62,1.69,"Ninja","Ichiha","Areia",3);
        Sakura sakura = new Sakura("Sakura", 58, 1.71,"Ninja","Raruno","Folha", 2);

        // Adicionando objeto criados a lista de ninjas da Classe Aldeia
        folha.adicionarNinja(naruto);
        areia.adicionarNinja(sasuke);
        folha.adicionarNinja(sakura);

        // Adicionando objeto criados a lista de pessoas da Classe Aldeia
        folha.adicionarPessoas(ichiraku);
        folha.adicionarPessoas(maeDaIno);


        Time time7 = new Time("Time sete");
        time7.adicionarMembros(naruto);
        time7.adicionarMembros(sasuke);
        time7.adicionarMembros(sakura);





    }
}
