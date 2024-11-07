package projetointegrador.model;

public class Conta {
    
    private int idConta;
    private String nomeConta;
    private String tipoConta;

    public Conta() {
    }

    public Conta(int idConta, String nomeConta, String tipoConta) {
        this.idConta = idConta;
        this.nomeConta = nomeConta;
        this.tipoConta = tipoConta;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    
}
