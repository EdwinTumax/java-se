import java.io.IOException;
public class Sistema{
	public static void main(String args[]){
		Menu menu = new Menu();
		try{
			menu.mostrarMenu();
		}catch(IOException ioe){
			System.out.println("Error de Entrada o salida: " + ioe.getMessage());
		}
	}
}