package projetointegrador.model;

import java.util.Date;

public class TransacaoFinanceira {
    
    private int idTransacao;
    private Date dataTransacao;
    private double valorTransacao;
    private String tipo;
    private int categoria;
    private String descricaoTransacao;
    private int contaOrigem;
    private int contaDestino;
    private int usuarioId;
    private String status;

    public TransacaoFinanceira() {
    }

    public TransacaoFinanceira(int idTransacao, Date dataTransacao, double valorTransacao, String tipo, int categoria, String descricaoTransacao, int contaOrigem, int contaDestino, int usuarioId, String status) {
        this.idTransacao = idTransacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
        this.tipo = tipo;
        this.categoria = categoria;
        this.descricaoTransacao = descricaoTransacao;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.usuarioId = usuarioId;
        this.status = status;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescricaoTransacao() {
        return descricaoTransacao;
    }

    public void setDescricaoTransacao(String descricaoTransacao) {
        this.descricaoTransacao = descricaoTransacao;
    }

    public int getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return "Resumo da transação:" +
                "\nID: " + idTransacao +
                "\nData: " + dataTransacao +
                "\nValor: R$ " + valorTransacao +
                "\nTipo: " + tipo +
                "\nCategoria: " + categoria +
                "\nDescrição: " + descricaoTransacao +
                "\nConta Origem: " + contaOrigem +
                "\nConta Destino: " + contaDestino +
                "\nID do Usuário: " + usuarioId +
                "\nStatus: " + status;
    }
    
}
