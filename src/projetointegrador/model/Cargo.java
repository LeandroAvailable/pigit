package projetointegrador.model;

public class Cargo {
    
    private int idCargo;
    private String nomeCargo;

    public Cargo() {
    }

    public Cargo(int idCargo, String nomeCargo) {
        this.idCargo = idCargo;
        this.nomeCargo = nomeCargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }
    
    
}
