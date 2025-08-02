package Aula5DataEHoraZonas;

import java.time.LocalTime;

public class ManipulandoHora {
    public static void main(String[] args) {

        System.out.println("----- HORA ATUAL -----");
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: "+horaAtual);
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("----- HORA ATUAL -----");
        LocalTime horaNova = LocalTime.of(11,40);
        System.out.println("Hora de entrada no serviço: "+horaNova);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----- HORAS, MINUTOS, SEGUNDOS DEPOIS -----");
        LocalTime horaEntrada = LocalTime.now();
        LocalTime horaDaMedicacao = horaEntrada.plusHours(2);
        LocalTime horaDa2Medicacao = horaDaMedicacao.plusHours(2);
        horaEntrada.plusMinutes(30);
        horaEntrada.plusSeconds(60);
        horaEntrada.plusHours(1);
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("----- HORAS, MINUTOS, SEGUNDOS ANTES -----");
        horaEntrada.minusHours(2);
        horaEntrada.minusMinutes(30);
        horaEntrada.minusSeconds(60);
        System.out.println("-----------------------------------");
        System.out.println();

    }
}
