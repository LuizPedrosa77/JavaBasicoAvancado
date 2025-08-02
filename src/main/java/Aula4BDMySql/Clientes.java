package Aula4BDMySql;

public class Clientes {

        // Atributos
        private String nome;
        private String telefone;
        private String forma_de_pagamento;
        private int recorrencia;

        // Construtor padrão
        public Clientes() {

        }

        // Construtor com parametros
        public Clientes(String nome, String telefone, String forma_de_pagamento, int recorrencia) {
            this.nome = nome;
            this.telefone = telefone;
            this.forma_de_pagamento = forma_de_pagamento;
            this.recorrencia = recorrencia;
        }

        // Get e Set
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setFormaDePagamento(String forma_de_pagamento) {
            this.forma_de_pagamento = forma_de_pagamento;
        }

        public String getFormaDePagamento() {
            return forma_de_pagamento;
        }

        public void setRecorrencia(int recorrencia) {
            this.recorrencia = recorrencia;
        }

        public int getRecorrencia() {
            return recorrencia;
        }

        // Metodo de apresentacao dos clientes
        public void apresentacao() {
            System.out.println(
                    "Clientes [nome=" + nome + ", telefone=" + telefone + ", forma_de_pagamento=" + forma_de_pagamento
                            + ", recorrencia=" + recorrencia + "]");
            System.out.println();
        }

    }
