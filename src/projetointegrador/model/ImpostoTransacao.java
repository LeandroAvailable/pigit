package projetointegrador.model;

public class ImpostoTransacao {
    
    private int idImposto;
    private String nomeImposto;
    private String tipoImposto;
    private double taxa;

    public ImpostoTransacao() {
    }

    public ImpostoTransacao(int idImposto, String nomeImposto, String tipoImposto, double taxa) {
        this.idImposto = idImposto;
        this.nomeImposto = nomeImposto;
        this.tipoImposto = tipoImposto;
        this.taxa = taxa;
    }

    public int getIdImposto() {
        return idImposto;
    }

    public void setIdImposto(int idImposto) {
        this.idImposto = idImposto;
    }

    public String getNomeImposto() {
        return nomeImposto;
    }

    public void setNomeImposto(String nomeImposto) {
        this.nomeImposto = nomeImposto;
    }

    public String getTipoImposto() {
        return tipoImposto;
    }

    public void setTipoImposto(String tipoImposto) {
        this.tipoImposto = tipoImposto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
}
