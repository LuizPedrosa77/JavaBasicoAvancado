package Aula4BDMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws SQLException {

        /**
         * // O cadastro do cliente pode ser dessa forma
         * Clientes cliente1 = new Clientes("Gustavo", "81993053838", "Pix", 2);
         *
         * // Mas é melhor fazer dessa outra para ter os valores independentes
         * Clientes cliente2 = new Clientes();
         * cliente2.setNome("Mariana");
         * cliente2.setTelefone("8181929281");
         * cliente2.setFormaDePagamento("A vista");
         * cliente2.setRecorrencia(1);
         */
        // Instanciando objetos da classe BD
        BancoDeDados bd = new BancoDeDados();

        // Retornando um cliente do BD
        // Clientes cliente = bd.getClientes(2);
        // cliente.apresentacao();

        // Retornando a lista toda de clientes do BD
        ArrayList<Clientes> listaClientes1 = new ArrayList<>();

        // Criano instancia para lista do BD

        for (int i = 1; i < 50; i++) {
            // Instanciando objeto para repetição
            Clientes c = bd.getClientes(i);
            listaClientes1.add(c);
        }

        // Usando estrutura anterior para apresentar a lista
        for (int i = 0; i < listaClientes1.size(); i++) {
            // Condições para repetição
            if (listaClientes1.get(i) == null) {
                continue;
            } else {
                listaClientes1.get(i).apresentacao();
            }
        }

        /**
         * ATUALIZANDO CLIENTES DO BD
         *
         *
         * Clientes cliente = new Clientes();
         *
         * cliente.setNome("Elena filha Sestito Pedrosa");
         * cliente.setTelefone("00112233");
         * cliente.setFormaDePagamento("Pix");
         * cliente.setRecorrencia(10);
         *
         *
         * bd.update(2, cliente);
         */

        /**
         * DELETAR CLIENTE DA LISTA
         */
        bd.deletar(1);

    }
}
