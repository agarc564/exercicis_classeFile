

import java.io.File;
import java.util.Scanner;

public class ex16RecorregutCerca {

	public static void main(String[] args) {
		//Declarem un objecte de la classe Scanner per a llegir de terminal i un altre per a llegir del fitxer
        Scanner inputFitxer = null;
        Scanner inputTerminal = new Scanner(System.in);
    	
        //Demanem a l'usuari la paraula que vol buscar
        System.out.println("Si us plau introdueixi la paraula que vol buscar:\n");
        String paraulaCerca = inputTerminal.nextLine();
        
        //Declarem una variable per a les paraules que anirem llegint i un comptador
        String paraulaLlegida;
        int comptaParaula = 0;
    	
        //Escrivim les instruccions de manipulació dels fluxos de dades dintre d'un bloc try per si es produeix una excepció     
       try {
           
             //Obrim el fitxer que conté les dades amb Scanner
             File f = new File("paraules.txt");
             inputFitxer = new Scanner(f);
          
          
           //Llegim paraula a paraula el contingut del fitxer d'entrada
             while (inputFitxer.hasNext()){
            	 //llegim la següent paraula
            	  paraulaLlegida = inputFitxer.next();
            	  if ((paraulaLlegida.equals(paraulaCerca))) {
            		comptaParaula++;
            	  }else {
            		  //No és la paraula cercada. No fem res
            	  }
             }
             //Es mostra per pantalla el número de vegades que s'ha trobat la paraula
            System.out.println("La paraula " + paraulaCerca + " s'ha trobat " + comptaParaula + " vegades");
            inputFitxer.close();
            inputTerminal.close();
            
        } catch (Exception e) {
            ///´S'ha produït una excepció
            System.out.println("Error: " + e);
           
        }
	}

}
