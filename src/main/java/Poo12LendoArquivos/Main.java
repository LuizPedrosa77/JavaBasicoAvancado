package Poo12LendoArquivos;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
            Essa é a estrutura para ler arquivos em ".csv"
         */

        String texto;

        try {
            // Essa vai informar onde está o arquivo
            InputStream is = new FileInputStream("AulaArquivosJava.csv");

            // Esse vai preparar para manipulação
            InputStreamReader isr = new InputStreamReader(is);

            // Esse vai pegar os dados
            BufferedReader br = new BufferedReader(isr);

            // Como boa pratica, é adicionado essa variavel "String"
            String linha = br.readLine();
            linha = br.readLine();


            String nome;
            String cpf;
            int idade;
            char sexo;
            String dataNascimento;
            double salario;
            String cargo;

            InfoCadastro p;

            // Aqui pode ser adicionado a estrutura de repetição "while"
            while (linha != null) { // "null" significa ausencia de valor. Então, SE O CONTEUDO DA LINHA FOR DIFERENTE DE NULL ele continua
                System.out.println(linha); // Mostra o conteudo da variavel;
                String[] campos = linha.split(",");

                nome = campos[0];
                cpf = campos[1];
                idade = Integer.parseInt(campos[2]);
                sexo = campos[3].charAt(0);
                dataNascimento = campos[4];
                salario = Double.parseDouble(campos[5]);
                cargo = campos[6];

                p = new InfoCadastro(nome, cpf, idade, sexo, dataNascimento, salario, cargo);
                p.apresentar();


                linha = br.readLine();  // Vai ler a proxima linha;

            }
            // boa pratica é fechar o Input
            br.close();
            isr.close();
            is.close();


        } catch (FileNotFoundException e){
            System.out.println("O arquivo não foi encontrado!");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
