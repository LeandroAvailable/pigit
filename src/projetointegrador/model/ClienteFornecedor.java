package projetointegrador.model;

public class ClienteFornecedor {
    
    private int idFornecedor;
    private String nomeFornecedor;
    private String tipoFornecedor;
    private String enderecoFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;
    private String cpf_cnpj;

    public ClienteFornecedor() {
    }

    public ClienteFornecedor(int idFornecedor, String nomeFornecedor, String tipoFornecedor, String enderecoFornecedor, String telefoneFornecedor, String emailFornecedor, String cpf_cnpj) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.emailFornecedor = emailFornecedor;
        this.cpf_cnpj = cpf_cnpj;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(String tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }
    
    
}
