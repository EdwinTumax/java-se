public class Sistema{

	public static void main(String args[]){
		ManejadorDeContactos manejador = new ManejadorDeContactos();
		Contacto contacto = new Contacto();
		contacto.setNombre("Edwin");
		contacto.setApellido("Tumax");
		contacto.setTelefono("888");
		manejador.agregar(contacto);

		Contacto contactoSolicitado = manejador.getContacto(0);
		System.out.println(contactoSolicitado.getNombre() + " " + contactoSolicitado.getApellido() + " " +
					contactoSolicitado.getTelefono());
	}
}
