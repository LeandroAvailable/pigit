package projetointegrador.history;

public class RegistroFinanceiro {
    
    private int idRegistro;
    private String nomeRegistro;

    public RegistroFinanceiro() {
    }

    public RegistroFinanceiro(int idRegistro, String nomeRegistro) {
        this.idRegistro = idRegistro;
        this.nomeRegistro = nomeRegistro;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNomeRegistro() {
        return nomeRegistro;
    }

    public void setNomeRegistro(String nomeRegistro) {
        this.nomeRegistro = nomeRegistro;
    }
    
    
}
