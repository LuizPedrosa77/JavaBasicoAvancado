/**
package Poo3Polimorfismo;

import Poo2Heranca.Pessoa;

    // Quando se usa "extends + Classe", será herdade tudo que está na classe que foi usada
    public class Funcionario extends Pessoa {

        // Essa classe está herdando toda classe "Pessoa"

        // Atributos
        private String cpf;
        private double salario;
        private String cargo;

        // Metodos "Get" e "Set" dos atributos para ser adicionado aos objetos criados
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getCpf() {
            return cpf;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public String getCargo() {
            return cargo;
        }

        // Metodos de açao de SOBRECARGA do Funcionario
        // POLIMORFISMO - SOBRECARGA
        // Conceito de SOBRECARGA:
        // É quando a variavel é se repete, porém com parametros diferentes e, inclusive, pode ser com ou sem parametro e lugares trocados

        public void almocar() {     // Almoçando o que a empresa dá

        }

        public void almocar(int opcao) {    // Escolhendo o almoço pequeno médio ou grande

        }

        public void almocar(String opcao) {    // Escolhendo as opções de almoço do cardapio

        }

        public void almocar(String texto, int opcao) {    // Escolhendo a opção de almoço e informando o codigo do almoço

        }

        public void almocar(String texto, int opcao, int formaPagamento) { // Escolhendo a opção de almoço e informando o codigo do almoço com forma de pagamento

        }


        // POLIMORFISMO - SOBREESCRITA
        // Conceito de SOBREESCRITA:
        // Geralmente a sobreescrita é acompanhada por um "@Override". É um metodo que pode ter o mesmo nome
        // mas está sendo herdade de algum outro local (Outra Classe ou Package)

        // O exemplo abaixo mostra que estou puxando este metodo da classe "Pessoa" e mudando o comportamento
        /**
        @Override
        public void apresentar() {
            System.out.println(cpf);
            System.out.println(salario);
            System.out.println(cargo);
        }


        // Já neste exemplo, estou puxando este metodo da classe "Pessoa" e utilizando o comportamento que tem nele.
        // Aqui eu posso incluir os que são dessa classe "Funcionario"
        @Override
        public void apresentar() {
            super.apresentar();
            System.out.println(cpf);
            System.out.println(salario);
            System.out.println(cargo);

            }

    }
