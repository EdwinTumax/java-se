import java.io.IOException;
public class Menu{
	ManejadorDeContactos manejador;

	public Menu(){
		manejador = new ManejadorDeContactos();
	}
	
	public void mostrarMenu() throws IOException{
		manejador.ingresarContacto();
	}
}
