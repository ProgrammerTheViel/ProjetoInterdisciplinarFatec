package br.com.inter.model;

import java.time.LocalTime;

public class Refeicao {
    private Integer idRefeicao;
    private Integer idPlano;
    private Integer idTipo;
    private LocalTime horario;
    private String status;
    private String observacao;

    public Refeicao(Integer idRefeicao, Integer idPlano, Integer idTipo, LocalTime horario, String status, String observacao) {
        this.idRefeicao = idRefeicao;
        this.idPlano = idPlano;
        this.idTipo = idTipo;
        this.horario = horario;
        this.status = status;
        this.observacao = observacao;
    }

    public Integer getIdRefeicao() { return idRefeicao; }
    public void setIdRefeicao(Integer idRefeicao) { this.idRefeicao = idRefeicao; }

    public Integer getIdPlano() { return idPlano; }
    public void setIdPlano(Integer idPlano) { this.idPlano = idPlano; }

    public Integer getIdTipo() { return idTipo; }
    public void setIdTipo(Integer idTipo) { this.idTipo = idTipo; }

    public LocalTime getHorario() { return horario; }
    public void setHorario(LocalTime horario) { this.horario = horario; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}
