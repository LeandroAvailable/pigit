package projetointegrador.util;

public class ConfiguracaoSistema {
    
    private int idConfiguracao;
    private String nomeConfiguracao;
    private String valor;

    public ConfiguracaoSistema() {
    }

    public ConfiguracaoSistema(int idConfiguracao, String nomeConfiguracao, String valor) {
        this.idConfiguracao = idConfiguracao;
        this.nomeConfiguracao = nomeConfiguracao;
        this.valor = valor;
    }

    public int getIdConfiguracao() {
        return idConfiguracao;
    }

    public void setIdConfiguracao(int idConfiguracao) {
        this.idConfiguracao = idConfiguracao;
    }

    public String getNomeConfiguracao() {
        return nomeConfiguracao;
    }

    public void setNomeConfiguracao(String nomeConfiguracao) {
        this.nomeConfiguracao = nomeConfiguracao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
