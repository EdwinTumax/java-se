public class SistemaCliente{

	public static void main(String args[]){
		Cliente cliente = new Cliente();
		cliente.conectar(args[0], Integer.parseInt(args[1]));
		cliente.escribir("Hola mundo");
	}
}
