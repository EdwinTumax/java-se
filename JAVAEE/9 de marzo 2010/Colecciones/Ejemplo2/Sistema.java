import java.util.ArrayList;
import java.util.Vector;
public class Sistema{
	public static void main(String args[]){
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		Vector<String> cadenas = new Vector<String>();

		enteros.add(3);
		enteros.add(4);
		enteros.add(5);

		cadenas.add("Jorge Samuel Perez");
		cadenas.add("Edwin Tumax");
		cadenas.add("Thomas Alba Edison");

		//System.out.println(enteros.get(2) + " " + cadenas.get(0));

		for(String elemento:cadenas){
			System.out.print(elemento+ ",");
			
		}

		for(int entero: enteros){
			System.out.println(entero);
		}
	}
}
