package Aula5DataEHoraZonas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManipulandoData {
    public static void main(String[] args) {

        System.out.println("----- DATA ATUAL -----");
        LocalDate data = LocalDate.now();
        System.out.println("Data atual: "+data);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----- DATA DE NASCIMENTO -----");
        LocalDate dataNascimento = LocalDate.of(2025,12,20);
        System.out.println("Data de nascimento: "+dataNascimento);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----- COMO VER DIAS DEPOIS -----");
        LocalDate dataPrimeiraConsulta = dataNascimento.plusDays(7);
        System.out.println("Data da primeira consulta: "+dataPrimeiraConsulta);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----- COMO VER DIAS ANTES -----");
        LocalDate dadosCadastroCrianca10DiasAntes =  dataNascimento.minusDays(10);
        System.out.println("10 dias antes do nascimento: "+dataPrimeiraConsulta);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----- FORMATANDO A DATA PARA dd/mm/yyyy -----");
        DateTimeFormatter padraoDeFormatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimentoFormatada = dataNascimento.format(padraoDeFormatacao);
        System.out.println("Data de nascimento formatada : "+dataNascimentoFormatada);
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("----- TREINDANDO O ASSUNTO DA AULA -----");
        String nome = "Gustavo";
        int idade = 33;
        String faculdade = "Metropolitana";
        String periodoDaFaculdade = "2º Periodo";

        LocalDate dataDeEstudoHoje = LocalDate.now();
        LocalDate comecoDaFaculdade = LocalDate.of(2025,02,10);
        LocalDate comecoEstudoJava = LocalDate.of(2025,06,01);
        DateTimeFormatter formatandoDataDeEstudoHoje = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeEstudoHojeFormatada =  formatandoDataDeEstudoHoje.format(dataDeEstudoHoje);
        String comecoDaFaculdadeFormatada = formatandoDataDeEstudoHoje.format(comecoDaFaculdade);
        String comecoEstudoJavaFormatado = formatandoDataDeEstudoHoje.format(comecoEstudoJava);
        System.out.format("Ola, meu nome é %s, tenho %d anos de idade, atualmente estou na faculdade %s cursando ADS" +
                " e estou no %s.\n Comecei a cursar na data %s, comecei a estudar Java em %s" +
                " e hoje é %s \n",nome, idade, faculdade, periodoDaFaculdade, comecoDaFaculdadeFormatada,  comecoEstudoJavaFormatado,  dataDeEstudoHojeFormatada);
        System.out.println("-----------------------------------");
        System.out.println();



    }
}
