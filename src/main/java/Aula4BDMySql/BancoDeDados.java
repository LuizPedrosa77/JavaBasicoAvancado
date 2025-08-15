package Aula4BDMySql;

import java.sql.*;

public class BancoDeDados {

    // Conexao com banco de dados
    String url = "jdbc:mysql://localhost:3306/pizzaria";
    String login = "root";
    String senha = "root";
    Connection conexao = null; // Cria variavel da conexão
    String comandoSql; // Cria comandos para o SQL

    /**
     * Metodo para inserir dados
     */
    public void inserirDados(Clientes cliente) {

        System.out.println("----- CRIANDO CONEXÃO -----");
        System.out.println();
        try {

            // Criar conexao com BD
            conexao = DriverManager.getConnection(url, login, senha);
            System.out.println("Conexão realizada com sucesso!");
            System.out.println();

            // Inserindo dados dos clientes
            // Usa-se "?" para que o valor seja passado depois como variavel
            comandoSql = "insert into clientes(nome,telefone, forma_de_pagamento, recorrencia) values (?,?,?,?)";

            // Prepara o comando para o BD
            PreparedStatement stmt = conexao.prepareStatement(comandoSql);

            // Comandos para inserir os dados
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getFormaDePagamento());
            stmt.setInt(4, cliente.getRecorrencia());

            // Executando atualizaçao do BD
            stmt.executeUpdate();
            // Fechando serviço de stmt
            stmt.close();

            // Confirmando cadastro de usuario
            System.out.println("----- CADASTRO DE CLIENTE -----");
            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println();

            // Fechar conexão com o BD
            conexao.close();
            System.out.println("----- FECHANDO CONEXÃO -----");
            System.out.println("Conexão com o Banco de dados fechada!");
            System.out.println();

        } catch (SQLException e) {
            System.out.println("----- ERRO NA CONEXÃO -----");
            System.out.println("Não foi possível conextar ao banco de dados!");
            System.out.println();

        }
    }

    /**
     * Metodo para puxar informações dos clientes
     */
    public Clientes getClientes(int id) throws SQLException {

        comandoSql = "select * from clientes where id=?"; // Comando usado no SQL
        conexao = DriverManager.getConnection(url, login, senha); // Comando para criar conexao
        PreparedStatement stmt = conexao.prepareStatement(comandoSql); // Comando para preparar comando do SQL no BD
        stmt.setInt(1, id); // Comando para injetar comandos do JAVA no SQL

        stmt.executeQuery();

        try (ResultSet rs = stmt.getResultSet()) {

            if (rs.next()) {

                // Criando objeto dos clientes para pesquisa
                Clientes cliente = new Clientes();

                // Inserindo dados para retornar a pesquisa dos clientes
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setFormaDePagamento(rs.getString("forma_de_pagamento"));
                cliente.setRecorrencia(rs.getInt("recorrencia"));

                // Fechando Resultado
                rs.close();
                stmt.close();
                conexao.close();
                return cliente;

            }
        }

        return null;

    }

    /**
     * Metodo para atualizar lista dos clientes
     */
    public void update(int id, Clientes cliente) throws SQLException {

        comandoSql = "update clientes set nome = ?, telefone = ?, forma_de_pagamento = ?, recorrencia = ? where id=?";
        conexao = DriverManager.getConnection(url, login, senha);
        PreparedStatement stmt = conexao.prepareStatement(comandoSql);

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getTelefone());
        stmt.setString(3, cliente.getFormaDePagamento());
        stmt.setInt(4, cliente.getRecorrencia());
        stmt.setInt(5, id);
        stmt.executeUpdate();

        stmt.close();
        conexao.close();

        System.out.println("----- ATUALIZAÇÃO DE CLIENTE -----");
        System.out.println("Atualização concluida com sucesso!");
        System.out.println();

    }

    /**
     * Metodo para deletar clienta da lista BD
     */
    public void deletar(int id) throws SQLException {

        comandoSql = "delete from clientes where id=?";
        conexao = DriverManager.getConnection(url, login, senha);
        PreparedStatement stmt = conexao.prepareStatement(comandoSql);
        stmt.setInt(1, id);

        stmt.executeUpdate();
        stmt.close();
        conexao.close();

        System.out.println("----- ATUALIZAÇÃO DA LISTA -----");
        System.out.println("Cliente deletado com sucesso!");
        System.out.println();
    }
}
