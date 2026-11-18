package br.com.inter.model;

import java.math.BigDecimal;

public class Paciente {
    private Integer idPaciente;
    private BigDecimal altura;
    private String objetivo;
    private String nivelAtividadeFisica;
    private String historicoMedico;
    private String restricoes;

    public Paciente(Integer idPaciente, BigDecimal altura, String objetivo, String nivelAtividadeFisica, String historicoMedico, String restricoes) {
        this.idPaciente = idPaciente;
        this.altura = altura;
        this.objetivo = objetivo;
        this.nivelAtividadeFisica = nivelAtividadeFisica;
        this.historicoMedico = historicoMedico;
        this.restricoes = restricoes;
    }

    public Integer getIdPaciente() { return idPaciente; }
    public void setIdPaciente(Integer idPaciente) { this.idPaciente = idPaciente; }

    public BigDecimal getAltura() { return altura; }
    public void setAltura(BigDecimal altura) { this.altura = altura; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    public String getNivelAtividadeFisica() { return nivelAtividadeFisica; }
    public void setNivelAtividadeFisica(String nivelAtividadeFisica) { this.nivelAtividadeFisica = nivelAtividadeFisica; }

    public String getHistoricoMedico() { return historicoMedico; }
    public void setHistoricoMedico(String historicoMedico) { this.historicoMedico = historicoMedico; }

    public String getRestricoes() { return restricoes; }
    public void setRestricoes(String restricoes) { this.restricoes = restricoes; }
}
