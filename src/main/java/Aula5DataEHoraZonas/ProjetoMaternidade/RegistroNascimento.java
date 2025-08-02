package Aula5DataEHoraZonas.ProjetoMaternidade;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroNascimento {

    // Atributos
    private String nomeBebe;
    private String nomePai;
    private String NomeMae;
    private String nomeMaternidade;
    private String nomeMedico;
    private String nomeEnfermeira;
    private double peso;
    private double altura;
    private LocalDateTime dataNascimento;

    // construtor padrão
    public RegistroNascimento(String nomeBebe, String nomePai, String nomeMae,
                              String nomeMedico, String nomeEnfermeira,
                              double peso, double altura, LocalDateTime dataNascimento) {

    }


    // Construtor com parametros
    public RegistroNascimento(String nomeBebe, String nomePai, String nomeMae,
                              String nomeMaternidade, String nomeMedico,
                              String nomeEnfermeira, double peso, double altura,
                              LocalDateTime dataNascimento) {
        this.nomeBebe = nomeBebe;
        this.nomePai = nomePai;
        NomeMae = nomeMae;
        this.nomeMaternidade = nomeMaternidade;
        this.nomeMedico = nomeMedico;
        this.nomeEnfermeira = nomeEnfermeira;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }



    // Get e Set
    public String getNomeBebe() {
        return nomeBebe;
    }

    public void setNomeBebe(String nomeBebe) {
        this.nomeBebe = nomeBebe;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String nomeMae) {
        NomeMae = nomeMae;
    }

    public String getNomeMaternidade() {
        return nomeMaternidade;
    }

    public void setNomeMaternidade(String nomeMaternidade) {
        this.nomeMaternidade = nomeMaternidade;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeEnfermeira() {
        return nomeEnfermeira;
    }

    public void setNomeEnfermeira(String nomeEnfermeira) {
        this.nomeEnfermeira = nomeEnfermeira;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Metodo de retorno
    public void apresentacao() {
        System.out.println("RegistroNascimento{" +
                "nome do Bebe=" + nomeBebe + '\'' +
                ", nome do Pai=" + nomePai + '\'' +
                ", Nome da Mae=" + NomeMae + '\'' +
                ", nome da Maternidade=" + nomeMaternidade + '\'' +
                ", nome do Medico=" + nomeMedico + '\'' +
                ", nome da Enfermeira=" + nomeEnfermeira + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", data de Nascimento=" + dataNascimento +
                '}');
    }

    public String Apresentar() {
        return " "+nomeBebe+", "+dataNascimento+", "+peso+", "+altura+", "+nomePai+", "+NomeMae+", "+nomeMaternidade+", "+nomeMedico+", "+nomeEnfermeira;
    }

    // Metodo para exibir registro
    public void exibirRegistro() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(" ==== RegistroNascimento ===={" +
                "nome do Bebe=" + nomeBebe + '\'' +
                ", nome do Pai=" + nomePai + '\'' +
                ", Nome da Mae=" + NomeMae + '\'' +
                ", nome da Maternidade=" + nomeMaternidade + '\'' +
                ", nome do Medico=" + nomeMedico + '\'' +
                ", nome da Enfermeira=" + nomeEnfermeira + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", data de Nascimento=" + dataNascimento.format(formatador) +
                '}');
    }


}
