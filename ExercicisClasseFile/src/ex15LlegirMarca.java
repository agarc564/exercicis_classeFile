/**
 * 
 */


import java.io.File;
import java.util.Scanner;

public class ex15LlegirMarca {

	public static void main(String[] args) {
		
		//Declarem un objecte de la classe Scanner. Aquesta classe conté mètodes per a poder llegir línies i paraules senceres
        Scanner input = null;
        //Escrivim les instruccions de manipulació dels fluxos de dades dintre d'un bloc try per si es produeix una excepció
        try {
           
             //Obrim el fitxer que conté les dades amb Scanner
             File f = new File("paraules.txt");
             input = new Scanner(f);
             boolean llegir = true;
             String paraula;
          
           //Llegim paraula a paraula el contingut del fitxer d'entrada
             while (llegir){
            	 //llegim la següent paraula
            	  paraula = input.next();
            	  if ((paraula.equals("FI"))||(paraula.equals("FI"))) {
            		// Marca de finalització. Ja s'ha acabat la lectura.
                      llegir = false;
            	  }else {
            		  //No s'ha trobat la marca
            		  System.out.println(paraula);
            	  }
             }
            input.close();
            
        } catch (Exception e) {
            ///´S'ha produït una excepció
            System.out.println("Error: " + e);
        }finally {
            //En aquest bloc s'escriuen instruccions que s'executen sempre, es produeixin excepcions o no
            //tanquem el flux de sortida
            input.close();	
        }

	}

}
