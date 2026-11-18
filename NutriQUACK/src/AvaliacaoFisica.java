package br.com.inter.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AvaliacaoFisica {
    private Integer idAvaliacao;
    private Integer idPaciente;
    private LocalDate dataAvaliacao;
    private BigDecimal peso;
    private BigDecimal percentualGordura;
    private BigDecimal kgGordura;
    private BigDecimal massaMagra;
    private BigDecimal cintura;
    private BigDecimal quadril;
    private BigDecimal braco;
    private BigDecimal torax;
    private BigDecimal coxa;
    private BigDecimal dobraTriceps;
    private BigDecimal dobraSubescapular;
    private BigDecimal dobraSuprailiaca;
    private BigDecimal imc;
    private BigDecimal tmb;

    public AvaliacaoFisica(Integer idAvaliacao, Integer idPaciente, LocalDate dataAvaliacao, BigDecimal peso, BigDecimal percentualGordura, BigDecimal kgGordura, BigDecimal massaMagra, BigDecimal cintura, BigDecimal quadril, BigDecimal braco, BigDecimal torax, BigDecimal coxa, BigDecimal dobraTriceps, BigDecimal dobraSubescapular, BigDecimal dobraSuprailiaca, BigDecimal imc, BigDecimal tmb) {
        this.idAvaliacao = idAvaliacao;
        this.idPaciente = idPaciente;
        this.dataAvaliacao = dataAvaliacao;
        this.peso = peso;
        this.percentualGordura = percentualGordura;
        this.kgGordura = kgGordura;
        this.massaMagra = massaMagra;
        this.cintura = cintura;
        this.quadril = quadril;
        this.braco = braco;
        this.torax = torax;
        this.coxa = coxa;
        this.dobraTriceps = dobraTriceps;
        this.dobraSubescapular = dobraSubescapular;
        this.dobraSuprailiaca = dobraSuprailiaca;
        this.imc = imc;
        this.tmb = tmb;
    }

    public Integer getIdAvaliacao() { return idAvaliacao; }
    public void setIdAvaliacao(Integer idAvaliacao) { this.idAvaliacao = idAvaliacao; }

    public Integer getIdPaciente() { return idPaciente; }
    public void setIdPaciente(Integer idPaciente) { this.idPaciente = idPaciente; }

    public LocalDate getDataAvaliacao() { return dataAvaliacao; }
    public void setDataAvaliacao(LocalDate dataAvaliacao) { this.dataAvaliacao = dataAvaliacao; }

    public BigDecimal getPeso() { return peso; }
    public void setPeso(BigDecimal peso) { this.peso = peso; }

    public BigDecimal getPercentualGordura() { return percentualGordura; }
    public void setPercentualGordura(BigDecimal percentualGordura) { this.percentualGordura = percentualGordura; }

    public BigDecimal getKgGordura() { return kgGordura; }
    public void setKgGordura(BigDecimal kgGordura) { this.kgGordura = kgGordura; }

    public BigDecimal getMassaMagra() { return massaMagra; }
    public void setMassaMagra(BigDecimal massaMagra) { this.massaMagra = massaMagra; }

    public BigDecimal getCintura() { return cintura; }
    public void setCintura(BigDecimal cintura) { this.cintura = cintura; }

    public BigDecimal getQuadril() { return quadril; }
    public void setQuadril(BigDecimal quadril) { this.quadril = quadril; }

    public BigDecimal getBraco() { return braco; }
    public void setBraco(BigDecimal braco) { this.braco = braco; }

    public BigDecimal getTorax() { return torax; }
    public void setTorax(BigDecimal torax) { this.torax = torax; }

    public BigDecimal getCoxa() { return coxa; }
    public void setCoxa(BigDecimal coxa) { this.coxa = coxa; }

    public BigDecimal getDobraTriceps() { return dobraTriceps; }
    public void setDobraTriceps(BigDecimal dobraTriceps) { this.dobraTriceps = dobraTriceps; }

    public BigDecimal getDobraSubescapular() { return dobraSubescapular; }
    public void setDobraSubescapular(BigDecimal dobraSubescapular) { this.dobraSubescapular = dobraSubescapular; }

    public BigDecimal getDobraSuprailiaca() { return dobraSuprailiaca; }
    public void setDobraSuprailiaca(BigDecimal dobraSuprailiaca) { this.dobraSuprailiaca = dobraSuprailiaca; }

    public BigDecimal getImc() { return imc; }
    public void setImc(BigDecimal imc) { this.imc = imc; }

    public BigDecimal getTmb() { return tmb; }
    public void setTmb(BigDecimal tmb) { this.tmb = tmb; }
}
