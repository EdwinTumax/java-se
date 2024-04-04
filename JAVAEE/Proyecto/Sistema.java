package org.edwintumax.agenda;
public class Sistema{
 public static void main(String args[]){
   
   ManejadorOpcionesMenu Menu = new ManejadorOpcionesMenu("Contactos");
   OpcionesMenu nuevaOpcion = new OpcionesMenu();
   //Menu.agregarOpcion("1. Ingresar");
   //Menu.agregarOpcion("2. eliminar");
   System.out.println(Menu.getNombreMenu());
 }
}
