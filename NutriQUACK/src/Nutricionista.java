package br.com.inter.model;

public class Nutricionista {
    private Integer idNutricionista;
    private String crn;
    private String especialidade;

    public Nutricionista(Integer idNutricionista, String crn, String especialidade) {
        this.idNutricionista = idNutricionista;
        this.crn = crn;
        this.especialidade = especialidade;
    }

    public Integer getIdNutricionista() { return idNutricionista; }
    public void setIdNutricionista(Integer idNutricionista) { this.idNutricionista = idNutricionista; }

    public String getCrn() { return crn; }
    public void setCrn(String crn) { this.crn = crn; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
