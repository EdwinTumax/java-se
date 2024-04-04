package org.edwintumax.agenda;
import java.util.ArrayList;
public class ManejadorOpcionesMenu{
 private ArrayList<OpcionesMenu> listaOpciones;
 private int posicion = -1;
 private String nombreMenu;
 public ManejadorOpcionesMenu(){
  listaOpciones = new ArrayList<OpcionesMenu>();
 }
 public ManejadorOpcionesMenu(String nombreMenu){
  this.nombreMenu =  nombreMenu;
 }
 public void agregarOpcion(OpcionesMenu nuevaOpcion){
  listaOpciones.add(nuevaOpcion);
 }
 public void eliminarOpcion(int indice){
  listaOpciones.remove(indice);
 }
 public String getNombreMenu(){
  return nombreMenu;
 }
 public int buscarOpcion(String nombreOpcion){
  for(OpcionesMenu elemento: listaOpciones){
   if(elemento.getOpcion().equals(nombreOpcion)){
	   break;
   }else{
    posicion++;	    
   }	   
  }
  return posicion;
 } 
}
