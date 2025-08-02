package Aula5DataEHoraZonas.ProjetoMaternidade;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.format("Nome do bebê: \n");
        String nomeBebe = leitor.nextLine();

        System.out.format("Nome do Pai: \'");
        String nomePai = leitor.nextLine();

        System.out.format("Nome da Mae : \'");
        String nomeMae = leitor.nextLine();

        System.out.format("Nome da Maternidade : \'");
        String nomeMaternidade = leitor.nextLine();

        System.out.format("Nome do Médico: \'");
        String nomeMedico = leitor.nextLine();

        System.out.format("Nome da enfermeira do : \'");
        String nomeEnfermeira = leitor.nextLine();

        System.out.format("Peso do: \'");
        double peso = Double.parseDouble(leitor.nextLine());

        System.out.format("Altura do Bebê: \'");
        double altura = leitor.nextDouble();

        System.out.format("Ano do nascimento: \'");
        int ano = leitor.nextInt();

        System.out.format("Mês do nascimento: \'");
        String mes = leitor.nextLine();

        System.out.format("Dia de nascimento \'");
        int dia = leitor.nextInt();

        System.out.format("Hora de Nascimento: \'");
        int hora = leitor.nextInt();

        System.out.format("Minuto de Nascimento: \'");
        int minuto = leitor.nextInt();

        LocalDateTime dataHoraNascimento = LocalDateTime.of(ano, Month.valueOf(mes),dia,hora,minuto);

        RegistroNascimento registro = new RegistroNascimento(nomeBebe, nomePai,
                nomeMae, nomeMedico, nomeEnfermeira, peso, altura, dataHoraNascimento);

        registro.exibirRegistro();

        leitor.close();

    }
}
