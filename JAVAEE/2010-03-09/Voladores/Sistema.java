public class Sistema{
 public static void main(String args[]){
  Paloma paloma1 = new Paloma();
  Avion avion1 = new Avion();
  Helicoptero helicoptero1 = new Helicoptero();
  Catapulca miCatapulca = new Catapulca();
  miCatapulca.hacerVolar(paloma1);
  miCatapulca.hacerVolar(avion1);
  miCatapulca.hacerVolar(helicoptero1);
 }
}