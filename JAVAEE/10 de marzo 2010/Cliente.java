import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;
public class Cliente{
	private Socket socketCliente;
	private boolean conectado;
	private PrintWriter escritor;
	public void conectar(String direccion, int puerto){
		try{
			socketCliente = new Socket(direccion, puerto);
			escritor = new PrintWriter(socketCliente.getOutputStream() , true); 
			conectado = true;
		}catch(IOException ioe){
			System.out.println("Error de entrada / salida " + ioe.getMessage());
			conectado = false;
		}
	}

	public void desconectar(){
		try{
			socketCliente.close();
		}catch(IOException ioe){
			System.out.println("Error al cerrar la conexion");
		}
	}

	public boolean escribir(String mensaje){
		if(!conectado){
			return false;
		}	
		
		escritor.println(mensaje);
		return true;
	}
}
