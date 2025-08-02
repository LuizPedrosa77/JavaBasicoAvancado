package Aula5DataEHoraZonas;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ManipulandoDataEHoras {
    public static void main(String[] args) {

        System.out.println("----- DATA E HORA DE AGORA -----");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Agora são: "+agora);
        System.out.println("----------------------------------");

        System.out.println("----- FORMATANDO A DATA E HORA PARA dd/mm/yyyy HH:mm:ss -----");
        LocalDateTime dataNascimentoHora = LocalDateTime.of(2025,8,02,13,15);
        DateTimeFormatter formatandodataNascimentoHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataNascimentoHoraFormatada = formatandodataNascimentoHora.format(dataNascimentoHora);
        System.out.println("Data e hora do nascimento: "+dataNascimentoHoraFormatada);
        System.out.println("-------------------------------------------------------------");


        System.out.println("----- DATA E HORA NO FUTURO -----");
        LocalDateTime futuro0 = dataNascimentoHora.plusYears(2).plusMonths(2).plusWeeks(2).plusDays(2).plusHours(2).plusMinutes(2).plusSeconds(2);
        LocalDateTime futuro1 = dataNascimentoHora.plusDays(2);
        LocalDateTime futuro2 = dataNascimentoHora.plusHours(2);
        LocalDateTime futuro3 = dataNascimentoHora.plusMinutes(2);
        LocalDateTime futuro4 = dataNascimentoHora.plusSeconds(2);
        System.out.println("Data da primeira consulta: "+futuro0);
        // Para imprimir todos precisa ser separadamente
        System.out.println("-----------------------------------");
        System.out.println();


        System.out.println("----- DATA E HORA NO PASSADO -----");
        LocalDateTime passado0 = dataNascimentoHora.minusYears(2).minusMonths(2).minusWeeks(2).minusDays(2).minusHours(2).minusMinutes(2).minusSeconds(2);
        LocalDateTime passado1 = dataNascimentoHora.minusDays(2);
        LocalDateTime passado2 = dataNascimentoHora.minusHours(2);
        LocalDateTime passado3 = dataNascimentoHora.minusMinutes(2);
        LocalDateTime passado4 = dataNascimentoHora.minusSeconds(2);
        System.out.println("Data da primeira consulta: "+passado0);
        System.out.println("-----------------------------------");
        System.out.println();


    }
}
