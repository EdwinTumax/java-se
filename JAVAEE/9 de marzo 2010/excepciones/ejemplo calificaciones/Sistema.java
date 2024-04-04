public class Sistema{
	public static void main(String args[]){
		GestorDeCalificaciones gestor = new GestorDeCalificaciones();
		try{
			gestor.setCalificacion(Byte.parseByte(args[0]));
		}catch(CalificacionInvalidaException excepcion){
			System.out.println(excepcion.getMessage());
		}catch(NumberFormatException nfe){
			System.out.println("Desbordamiento de la variable");
		}catch(Exception excepcion){
			System.out.println(excepcion.getMessage());
		}finally{
			System.out.println("Finalmente esto siempre se ejecuta");
		}
		
	}
}
