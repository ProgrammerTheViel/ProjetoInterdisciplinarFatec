package br.com.inter.model;

import java.math.BigDecimal;

public class ItemRefeicao {
    private Integer idRefeicao;
    private Integer idAlimento;
    private BigDecimal quantidade;
    private String unidadeMedida;
    private BigDecimal caloriasTotais;

    public ItemRefeicao(Integer idRefeicao, Integer idAlimento, BigDecimal quantidade, String unidadeMedida, BigDecimal caloriasTotais) {
        this.idRefeicao = idRefeicao;
        this.idAlimento = idAlimento;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
        this.caloriasTotais = caloriasTotais;
    }

    public Integer getIdRefeicao() { return idRefeicao; }
    public void setIdRefeicao(Integer idRefeicao) { this.idRefeicao = idRefeicao; }

    public Integer getIdAlimento() { return idAlimento; }
    public void setIdAlimento(Integer idAlimento) { this.idAlimento = idAlimento; }

    public BigDecimal getQuantidade() { return quantidade; }
    public void setQuantidade(BigDecimal quantidade) { this.quantidade = quantidade; }

    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }

    public BigDecimal getCaloriasTotais() { return caloriasTotais; }
    public void setCaloriasTotais(BigDecimal caloriasTotais) { this.caloriasTotais = caloriasTotais; }
}
