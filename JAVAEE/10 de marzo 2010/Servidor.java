import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Servidor{
	private ServerSocket socketServidor;
	private Socket socketCliente;

	public Servidor(int puerto){
		System.out.println("Estoy recibiendo conexiones en el puerto " + puerto);
		try{
			socketServidor = new ServerSocket(puerto);
			PrintWriter escritor = null;
			BufferedReader lector = null;
			String linea = null;
			while(true){		
				socketCliente = socketServidor.accept();
				System.out.println("Se ha recibido una conexion");
				escritor = new PrintWriter(socketCliente.getOutputStream(), true);
				escritor.println("Bienvenido a mi servidor");
				lector = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
				while( (linea = lector.readLine()) != null){
					System.out.println(linea + "\n");
				}

			}
		}catch(IOException ioe){
			System.out.println("Error de entrada o salida: " + ioe.getMessage());
		}
		
	}
}
