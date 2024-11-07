package projetointegrador.history;

import java.util.Date;

public class HistoricoUsuario {
    
    private int idHistorico;
    private Date dataHistorico;
    private int usuarioId;
    private String tipoAcao;
    private Date dataExclusao;

    public HistoricoUsuario() {
    }

    public HistoricoUsuario(int idHistorico, Date dataHistorico, int usuarioId, String tipoAcao, Date dataExclusao) {
        this.idHistorico = idHistorico;
        this.dataHistorico = dataHistorico;
        this.usuarioId = usuarioId;
        this.tipoAcao = tipoAcao;
        this.dataExclusao = dataExclusao;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }

    public Date getDataHistorico() {
        return dataHistorico;
    }

    public void setDataHistorico(Date dataHistorico) {
        this.dataHistorico = dataHistorico;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getTipoAcao() {
        return tipoAcao;
    }

    public void setTipoAcao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
    }

    public Date getDataExclusao() {
        return dataExclusao;
    }

    public void setDataExclusao(Date dataExclusao) {
        this.dataExclusao = dataExclusao;
    }
    
    
}
