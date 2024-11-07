package projetointegrador.model;

import java.util.Date;

public class Usuario {
    
    private int idUsuario;
    private String nomeUsuario;
    private Date dataNascimento;
    private String enderecoUsuario;
    private String telefoneUsuario;
    private String emailUsuario;
    private String cpf;
    private String rg;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nomeUsuario, Date dataNascimento, String enderecoUsuario, String telefoneUsuario, String emailUsuario, String cpf, String rg) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.enderecoUsuario = enderecoUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.cpf = cpf;
        this.rg = rg;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
