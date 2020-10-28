/**
 * 
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ex12LlegirLiniesFitxer {
	
	//Mètode principal de la classe. Pot llançar una excepció en cas que es produeixi un error
    public static void main(String[] args) throws IOException {
        
        //Declarem un objecte de la classe Scanner. Aquesta classe conté mètodes per a poder llegir línies i paraules senceres
        Scanner input = null;
        //Escrivim les instruccions de manipulació dels fluxos de dades dintre d'un bloc try per si es produeix una excepció
        try {
           
             //Obrim el fitxer que conté les dades amb Scanner
             File f = new File("textProva.txt");
             input = new Scanner(f);
          
           //Llegim línia a línia el contingut del fitxer d'entrada
             while ((input.hasNext())){
                 //Escrivim la línia llegida en el fitxer de sortida
                 System.out.println(input.nextLine());
             }
            
        } catch (IOException e) {
            ///´S'ha produït un error
            System.out.println("Error: " + e);
           
        }finally {
            //En aquest bloc s'escriuen instruccions que s'executen sempre, es produeixin excepcions o no
            //tanquem el flux de sortida
            input.close();
				
        }
    }

}
