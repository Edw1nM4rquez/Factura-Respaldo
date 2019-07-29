/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author edwin
 */
public class Persona {
    private String idpersona;
    private String nombres;
    private String cedula;
    private String direccion;
    private String fecha;
    private String telefono;

    public Persona(){
        
    }
    public Persona(String idpersona, String nombres, String cedula, String direccion, String fecha, String telefono) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fecha = fecha;
        this.telefono = telefono;
    }

    
    
    /**
     * @return the idpersona
     */
    public String getIdpersona() {
        return idpersona;
    }

    /**
     * @param idpersona the idpersona to set
     */
    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", nombres=" + nombres + ", cedula=" + cedula + ", direccion=" + direccion + ", fecha=" + fecha + ", telefono=" + telefono + '}';
    }
    
}
