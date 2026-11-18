package br.com.inter.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PlanoAlimentar {
    private Integer idPlano;
    private Integer idPaciente;
    private Integer idNutricionista;
    private String tituloPlano;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private BigDecimal objetivoCalorico;
    private String observacoes;

    public PlanoAlimentar(Integer idPlano, Integer idPaciente, Integer idNutricionista, String tituloPlano, LocalDate dataInicio, LocalDate dataFim, BigDecimal objetivoCalorico, String observacoes) {
        this.idPlano = idPlano;
        this.idPaciente = idPaciente;
        this.idNutricionista = idNutricionista;
        this.tituloPlano = tituloPlano;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.objetivoCalorico = objetivoCalorico;
        this.observacoes = observacoes;
    }

    public Integer getIdPlano() { return idPlano; }
    public void setIdPlano(Integer idPlano) { this.idPlano = idPlano; }

    public Integer getIdPaciente() { return idPaciente; }
    public void setIdPaciente(Integer idPaciente) { this.idPaciente = idPaciente; }

    public Integer getIdNutricionista() { return idNutricionista; }
    public void setIdNutricionista(Integer idNutricionista) { this.idNutricionista = idNutricionista; }

    public String getTituloPlano() { return tituloPlano; }
    public void setTituloPlano(String tituloPlano) { this.tituloPlano = tituloPlano; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }

    public BigDecimal getObjetivoCalorico() { return objetivoCalorico; }
    public void setObjetivoCalorico(BigDecimal objetivoCalorico) { this.objetivoCalorico = objetivoCalorico; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}
