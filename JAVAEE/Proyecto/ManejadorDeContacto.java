package org.edwintumax.agenda;
import java.util.ArrayList;
public class ManejadorDeContacto{
 private ArrayList<Contacto> listaContacto;
 private int posicionContacto=0;
 private boolean encontrado=false;
 public ManejadorDeContacto(){
  listaContacto = new ArrayList<Contacto>();
 }
 public void agregarContacto(Contacto nuevoContacto){
  listaContacto.add(nuevoContacto);
 }
 public void eliminarContacto(int indice){
  listaContacto.remove(indice);	 
 }
 public int buscarContacto(Contacto buscaElemento){
  return listaContacto.lastIndexOf(buscaElemento);	   
 }
}
