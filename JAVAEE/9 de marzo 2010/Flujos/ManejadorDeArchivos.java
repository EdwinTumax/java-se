import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class ManejadorDeArchivos{
	private PrintWriter escritor;
	private BufferedReader lector;
	public ManejadorDeArchivos(String nombreDeArchivo){
		FileWriter escritorDeArchivos = null;
		try{
			escritorDeArchivos = new FileWriter(nombreDeArchivo, true);		
		}catch(IOException ioe){
			System.out.println("Error al intentar escribir archivo");
		}
		escritor = new PrintWriter(escritorDeArchivos,true);
	}

	public void escribir(String texto){
		escritor.println(texto);		
	}

	public String leer(String nombreDelArchivo){
		try{
			lector = new BufferedReader(new FileReader(nombreDelArchivo));
		}catch(FileNotFoundException fnf){
			System.out.println("El archivo " + nombreDelArchivo + " no existe");
		}
		StringBuffer sb = new StringBuffer();
		String linea;
		try{
			while( (linea = lector.readLine()) != null ){
				sb.append(linea + "\n");
			}
		}catch(IOException ioe){
			System.out.println("Error al leer archivo");
		}
		return sb.toString();
	}
}
