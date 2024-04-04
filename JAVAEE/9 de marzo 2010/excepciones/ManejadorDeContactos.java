import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ManejadorDeContactos{
	public void ingresarContacto() throws IOException{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String linea = lector.readLine();
		System.out.println("Has escrito: " + linea);
	}	
}
