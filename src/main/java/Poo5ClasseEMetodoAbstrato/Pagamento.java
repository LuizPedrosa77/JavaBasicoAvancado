/**
    Essa "intarface Pagamento" será usada para utilização do metodo de pagamento e todos que a usarem são
    obrigados incluirem tudo que existe aqui dentro.
 */

package Poo5ClasseEMetodoAbstrato;

// A principal diferença entre este metodo de "interface" para a "abstract" é que a "interface" obrigado utilizar
// todos os conteudos que estão dentro da interface enquanto a "abstract" não, você escolhe o que quer usar.

public interface Pagamento {

    // Para utilizar "interface" só pode haver parametros mas não pode haver implementos que são as chaves "{}"
    // que seria assim -> public void pagar() {implementação/comportamento}
    public void pagar();

}
