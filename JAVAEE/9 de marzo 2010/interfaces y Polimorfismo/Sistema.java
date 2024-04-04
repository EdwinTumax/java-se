public class Sistema{
	public static void main(String args[]){
		Paloma paloma = new Paloma();
		Avion avion = new Avion();
		Catapulta catapulta = new Catapulta();

		catapulta.hacerVolar(paloma);
		catapulta.hacerVolar(avion);
	}
}
