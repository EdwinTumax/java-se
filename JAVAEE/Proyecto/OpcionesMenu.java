package org.edwintumax.agenda;
public class OpcionesMenu{
 private int valorOpcion;
 private String nombreOpcion;
 public void setOpcion(int valorOpcion,String nombreOpcion){
  this.nombreOpcion = nombreOpcion;
  this.valorOpcion = valorOpcion;
 }
 public String getOpcion(){
  return nombreOpcion;
 }
 public void setValorOpcion(int valor){
  this.valorOpcion = valor;
 }
 public int getValorOpcion(){
  return valorOpcion;
 }
}
