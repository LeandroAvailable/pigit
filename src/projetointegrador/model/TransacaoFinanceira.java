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
}
