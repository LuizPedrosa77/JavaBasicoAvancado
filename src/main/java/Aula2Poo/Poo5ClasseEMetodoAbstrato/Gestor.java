
/**
 A classe "Gestor" será a classe usada pela principal para criação de objetos.
 Essa classe "Gestor" vai receber a classe "abstract Pessoa" e a "interface Pagamento"
 Essa classe "Gestor" é uma classe CONCRETA. Classes CONCRETAS podem gerar objetos e ABSTRACT não
 */

package Aula2Poo.Poo5ClasseEMetodoAbstrato;

// Aqui estou herdando a "classe abstract Pessoa" com tudo que ela tem e implementando a "interface Pagamento"
// Como a classe "abstract Pessoa" tem um "metodo abstract" incluso, se torna obrigatorio a sua inclusao dentro
// dessa classe GESTOR
public class Gestor extends Pessoa implements Pagamento {


    @Override
    public void pagar() {
        System.out.println("Pagar no dinheiro");
    }


    // Este metodo foi herdado da "Classe abstract Pessoa" onde o metodo tambem é abstract e isso é
    // chamado de "POLIMORFISMO DE SOBREESCRITA"
    // Pelo fato de ter um "metodo abstract" detro da classe, quando herdamos a classe, se torna obrigatorio o uso
    // deste metodo.
    @Override
    public void falar() {
        System.out.println("Falar com autoridade");
    }
}
