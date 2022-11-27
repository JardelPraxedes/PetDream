package entidades;

public class anamnese_geral {
    private String queixaPrincipal;
    private String historicoPrincipal;
    private String alimentacao;
    private String contactante;

    private String ambiente;
    private String vacinacao;
    private String vermifugacao;

    public anamnese_geral(){

    }
    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getHistoricoPrincipal() {
        return historicoPrincipal;
    }

    public void setHistoricoPrincipal(String historicoPrincipal) {
        this.historicoPrincipal = historicoPrincipal;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getContactante() {
        return contactante;
    }

    public void setContactante(String contactante) {
        this.contactante = contactante;
    }

    public String getAmbienteVive() {
        return ambiente;
    }

    public void setAmbienteVive(String ambienteVive) {
        this.ambiente = ambienteVive;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getVermifugacao() {
        return vermifugacao;
    }

    public void setVermifugacao(String vermifugacao) {
        this.vermifugacao = vermifugacao;
    }
}