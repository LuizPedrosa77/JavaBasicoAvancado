package Aula5DataEHoraZonas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ManipulacaoZonas {
    public static void main(String[] args) {

        System.out.println("----- ZONA COM DATA E HORA -----");
        ZonedDateTime dataEHoraAtual = ZonedDateTime.now();
        System.out.println("zona Data e Hora: " +dataEHoraAtual);
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("----- CONVERTENDO HORA PARA SÃO PAULO -----");
        ZonedDateTime dataHoraSP = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Zona data e hora: " +dataHoraSP);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----- DIFERENCA DE HORA ENTRE LUGARES -----");
        ZonedDateTime dataHoraNY = dataHoraSP.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Zona data e hora de NY: "+dataHoraNY);
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("----- PUXANDO AS ZONAS DISPONIVEIS -----");
        Set<String> zonas = ZoneId.getAvailableZoneIds();
        for(String zona : zonas) {
            System.out.println(zona);
        }
        System.out.println("-----------------------------------");
        System.out.println();

    }
}
