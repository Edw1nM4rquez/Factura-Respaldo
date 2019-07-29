/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.FacturaDetalle;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edwin
 */
public class GestionProductos {
     private List<FacturaDetalle> registros;
      private List<Persona> per;
     
     public GestionProductos(List<FacturaDetalle> registros, List<Persona> per){
         super();
		this.registros = registros; 
                this.per = per; 
     }
   public GestionProductos(){
       registros =new ArrayList<FacturaDetalle>();
        per =new ArrayList<Persona>();
   }
 public void IngresarProductos(String id,String catidad,String descripcion,String valorU,String valorT){
     FacturaDetalle fac=new FacturaDetalle();
     fac.setCantdad(catidad);
     fac.setDescripcion(descripcion);
     fac.setValorUni(valorU);
     fac.setValorTotal(valorT);
     fac.setId(id);
     registros.add(fac);
     
 }
 public void IngresarCliente(String id,String nombre,String cedula, String direccion, String fecha, String telefono ){
     Persona pers=new Persona();
     pers.setNombres(nombre);
     pers.setCedula(cedula);
     pers.setDireccion(direccion);
     pers.setFecha(fecha);
     pers.setTelefono(telefono);
     pers.setIdpersona(id);
     per.add(pers);
     
 }
    public List<FacturaDetalle> getProductos(){
		return registros;
		
	}
     public List<Persona> getPersona(){
		return per;
		
	}
  public void clienteRegistrado(){
      
  }
  
   public List<FacturaDetalle> getFactuaDetalle(){
		return registros;
		
	}
}
