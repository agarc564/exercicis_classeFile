/**
 * 
 */


import java.io.File;
import java.util.Scanner;

/**
 * @author angela
 *
 */
public class ex11ObrirFitxer {
	
	 public static void main(String[] args) {
		 
	
        try {
            // En el bloc try s'executa el codi quan el fitxer s'obre amb éxit
            File f = new File("input.txt");
            Scanner lector = new Scanner(f);
            // El fitxer existeix. Tot correcte.
            System.out.println("Fitxer obert correctament.");
            System.out.println("Enhorabona!");
        } catch (Exception e) {
            //En el bloc catch s'executa el codi quan s'ha produït un error en obrir el fitxer
            // o en algun lloc del bloc try
            System.out.println("Error: " + e);
        }
        // Les instruccions fora de l'estructura try/catch sempre s'executen,
        // igual que les que hi ha després d'una sentència if/else.
        System.out.println("Finalització del programa.");
		    
		 
	 }

}
