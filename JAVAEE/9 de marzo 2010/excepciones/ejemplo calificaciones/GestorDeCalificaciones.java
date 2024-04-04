public class GestorDeCalificaciones{
	public void setCalificacion(byte calificacion) throws CalificacionInvalidaException{
		if(calificacion < 0  || calificacion >100){
			throw new CalificacionInvalidaException();
		}
	}
}
