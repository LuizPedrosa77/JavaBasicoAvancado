package Poo5ClasseEMetodoAbstrato;

// Aqui estou herdando a classe de "Funcionario" com tudo que ela tem e implementando a "interface Pagamento"
public class Gestor implements Pagamento {


    @Override
    public void pagar() {
        System.out.println("Pagar no dinheiro");
    }
}
