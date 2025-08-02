package Aula5DataEHoraZonas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataHoraZona {
    public static void main(String[] args) {

        // ----------------------------------------------------------------
        //  TRABALHANDO COM DATAS

        System.out.println();
        System.out.println("----- TRABALHANDO COM DATAS -----");
        System.out.println();

        LocalDate hoje = LocalDate.now();
        System.out.println("data de hoje é: " + hoje);

        LocalDate dataNAscimento = LocalDate.of(1992,1,20);
        System.out.println("Data de nascimento: " + dataNAscimento);

        LocalDate dataFutura = dataNAscimento.plusDays(10);
        System.out.println("Data de futura: " + dataFutura);

        LocalDate dataPassada = hoje.minusDays(20);
        System.out.println("Data de passada: " + dataPassada);

        LocalDate proximosAnos = hoje.plusYears(30);
        System.out.println("Data de anos: " + proximosAnos);

        LocalDate anosAnteriores = hoje.minusYears(5);
        System.out.println("Data de anos: " + anosAnteriores);


        // ----------------------------------------------------------------
        //  TRABALHANDO COM HORAS

        System.out.println();
        System.out.println("----- TRABALHANDO COM HORAS -----");
        System.out.println();

        LocalTime agora = LocalTime.now();
        System.out.println("Hora atual: " + agora);

        LocalTime horario = LocalTime.of(21,30,15);
        System.out.println("Hora atual: " + horario);

        LocalTime horaProximaMedicacao = agora.plusHours(2);
        System.out.println("Hora da proxima medicação: " + horaProximaMedicacao);

        // ----------------------------------------------------------------
        //  TRABALHANDO COM ZONAS

        System.out.println();
        System.out.println("----- TRABALHANDO COM ZONAS -----");
        System.out.println();

        ZonedDateTime dataEHoraAtual = ZonedDateTime.now();
        System.out.println("Será informado a data com a hora, os milésimos e o -3h do Brasil");
        System.out.println("Data e hora no fuso do sistema: "+dataEHoraAtual);

        ZonedDateTime dataHoraSP = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data e hora de São Paulo: "+dataHoraSP);

        ZonedDateTime dataHoraNY = dataHoraSP.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data e hora em Nova York é: "+dataHoraNY);

        System.out.println();
        // ----------------------------------------------------------------
        //  TRABALHANDO COM DATAS E HORAS AO MESMO TEMPO

        System.out.println("----- TRABALHANDO COM DATAS E HORAS AO MESMO TEMPO -----");
        System.out.println();

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: "+dataHoraAtual);

        LocalDateTime dataNascimento2 = LocalDateTime.of(2025, 8,1,21,23);
        System.out.println("Data de nascimento: "+dataNascimento2);

        DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataNascimento2.format(dataHoraFormatada);
        System.out.println("Data de nascimento formatada: "+dataFormatada);
    }
}
