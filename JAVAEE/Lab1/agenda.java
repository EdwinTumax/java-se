import java.io.*;
import java.util.ArrayList;

public class agenda
{
 public static void main(String args[]){
  
   ArrayList Agenda;
   InputStreamReader ingreso;
   BufferedReader lector;
   String opcion,cadena = null;
   int valor;
   do{
     System.out.println("1- Lista de contacto\n2- Introductor contacto\n3- Eliminar contacto\n4- Salir\nElija su opcion");
     ingreso = new InputStreamReader(System.in);
     lector = new BufferedReader(ingreso);
     try{
      cadena=lector.readLine();
     }
     catch (Exception ex) {}
     valor = Integer.parseInt(cadena);  
   }while(valor!=4);
 }
}
