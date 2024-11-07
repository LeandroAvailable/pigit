package projetointegrador.model;

public class TransacaoImposto {
    
    private int idTransacaoImposto;
    private int transacaoId;
    private int impostoId;
    private double valor;

    public TransacaoImposto() {
    }

    public TransacaoImposto(int idTransacaoImposto, int transacaoId, int impostoId, double valor) {
        this.idTransacaoImposto = idTransacaoImposto;
        this.transacaoId = transacaoId;
        this.impostoId = impostoId;
        this.valor = valor;
    }

    public int getIdTransacaoImposto() {
        return idTransacaoImposto;
    }

    public void setIdTransacaoImposto(int idTransacaoImposto) {
        this.idTransacaoImposto = idTransacaoImposto;
    }

    public int getTransacaoId() {
        return transacaoId;
    }

    public void setTransacaoId(int transacaoId) {
        this.transacaoId = transacaoId;
    }

    public int getImpostoId() {
        return impostoId;
    }

    public void setImpostoId(int impostoId) {
        this.impostoId = impostoId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
