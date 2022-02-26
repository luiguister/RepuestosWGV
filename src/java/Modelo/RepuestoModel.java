/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Soporte
 */
public class RepuestoModel {

    /**
     * @return the idRepuesto
     */
    public int getIdRepuesto() {
        return idRepuesto;
    }

    /**
     * @param idRepuesto the idRepuesto to set
     */
    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    /**
     * @return the nombreRepuesto
     */
    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    /**
     * @param nombreRepuesto the nombreRepuesto to set
     */
    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    /**
     * @return the descRepuesto
     */
    public String getDescRepuesto() {
        return descRepuesto;
    }

    /**
     * @param descRepuesto the descRepuesto to set
     */
    public void setDescRepuesto(String descRepuesto) {
        this.descRepuesto = descRepuesto;
    }

    /**
     * @return the precioRepuesto
     */
    public int getPrecioRepuesto() {
        return precioRepuesto;
    }

    /**
     * @param precioRepuesto the precioRepuesto to set
     */
    public void setPrecioRepuesto(int precioRepuesto) {
        this.precioRepuesto = precioRepuesto;
    }

    /**
     * @return the fotoRepuesto
     */
    public String getFotoRepuesto() {
        return fotoRepuesto;
    }

    /**
     * @param fotoRepuesto the fotoRepuesto to set
     */
    public void setFotoRepuesto(String fotoRepuesto) {
        this.fotoRepuesto = fotoRepuesto;
    }
    private int idRepuesto;
    private String nombreRepuesto;
    private String descRepuesto;
    private int precioRepuesto;
    private String fotoRepuesto;

    public RepuestoModel() {
    }

    public RepuestoModel(int idRepuesto, String nombreRepuesto, String descRepuesto, int precioRepuesto, String fotoRepuesto) {
        this.idRepuesto = idRepuesto;
        this.nombreRepuesto = nombreRepuesto;
        this.descRepuesto = descRepuesto;
        this.precioRepuesto = precioRepuesto;
        this.fotoRepuesto = fotoRepuesto;
    }
    
    
    
}
