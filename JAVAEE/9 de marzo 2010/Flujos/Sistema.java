public class Sistema{
	public static void main(String args[]){
		ManejadorDeArchivos manejador = new ManejadorDeArchivos("texto.txt");
		manejador.escribir("Esta linea no elimina la anterior");
		String texto = manejador.leer("texto.txt");
		System.out.println(texto);
	}
}