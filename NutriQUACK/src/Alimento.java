package br.com.inter.model;

import java.math.BigDecimal;

public class Alimento {
    private Integer idAlimento;
    private Integer idCategoria;
    private String nomeAlimento;
    private BigDecimal calorias;
    private BigDecimal proteinas;
    private BigDecimal carboidratos;
    private BigDecimal gordurasTotais;
    private BigDecimal fibras;
    private BigDecimal sodio;

    public Alimento(Integer idAlimento, Integer idCategoria, String nomeAlimento, BigDecimal calorias, BigDecimal proteinas, BigDecimal carboidratos, BigDecimal gordurasTotais, BigDecimal fibras, BigDecimal sodio) {
        this.idAlimento = idAlimento;
        this.idCategoria = idCategoria;
        this.nomeAlimento = nomeAlimento;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.carboidratos = carboidratos;
        this.gordurasTotais = gordurasTotais;
        this.fibras = fibras;
        this.sodio = sodio;
    }

    public Integer getIdAlimento() { return idAlimento; }
    public void setIdAlimento(Integer idAlimento) { this.idAlimento = idAlimento; }

    public Integer getIdCategoria() { return idCategoria; }
    public void setIdCategoria(Integer idCategoria) { this.idCategoria = idCategoria; }

    public String getNomeAlimento() { return nomeAlimento; }
    public void setNomeAlimento(String nomeAlimento) { this.nomeAlimento = nomeAlimento; }

    public BigDecimal getCalorias() { return calorias; }
    public void setCalorias(BigDecimal calorias) { this.calorias = calorias; }

    public BigDecimal getProteinas() { return proteinas; }
    public void setProteinas(BigDecimal proteinas) { this.proteinas = proteinas; }

    public BigDecimal getCarboidratos() { return carboidratos; }
    public void setCarboidratos(BigDecimal carboidratos) { this.carboidratos = carboidratos; }

    public BigDecimal getGordurasTotais() { return gordurasTotais; }
    public void setGordurasTotais(BigDecimal gordurasTotais) { this.gordurasTotais = gordurasTotais; }

    public BigDecimal getFibras() { return fibras; }
    public void setFibras(BigDecimal fibras) { this.fibras = fibras; }

    public BigDecimal getSodio() { return sodio; }
    public void setSodio(BigDecimal sodio) { this.sodio = sodio; }
}
