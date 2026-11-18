package br.com.inter.model;

public class TipoRefeicao {
    private Integer idRefeicao;
    private String nomeRefeicao;

    public TipoRefeicao(Integer idRefeicao, String nomeRefeicao) {
        this.idRefeicao = idRefeicao;
        this.nomeRefeicao = nomeRefeicao;
    }

    public Integer getIdRefeicao() { return idRefeicao; }
    public void setIdRefeicao(Integer idRefeicao) { this.idRefeicao = idRefeicao; }

    public String getNomeRefeicao() { return nomeRefeicao; }
    public void setNomeRefeicao(String nomeRefeicao) { this.nomeRefeicao = nomeRefeicao; }
}
