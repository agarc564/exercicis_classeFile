/**
 * 
 */


import java.io.File;
import java.util.Scanner;

/**
 * @author angela
 *
 */
public class ex9Reanomenar {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Si us plau introdueixi el directori o fitxer que vol reanomenar:\n");
		String origen = sc.nextLine();
		
		//Creem l'objecte File amb la ruta que ha introduït l'usuari
		File f1 = new File(origen);
		//comprova si existeix la carpeta o fitxer
		if(f1.exists()) {
			//Demana el nou nom
			System.out.println("Si us plau introdueixi el nom nou (només el nom):\n");
			String nom = sc.nextLine();
			//Obté la ruta origen del fitxer o directori (sense el nom antic)
			String pare = f1.getParent();
			//Obté la nova ruta
			String desti = pare + File.separator + nom;
			
			//Crea un nou objecte file amb el nom nou
			File f2 = new File (desti);
			if (f1.renameTo(f2)) {
				System.out.println("S'ha canviat el nom");
			}else {
				System.out.println("No s'ha pogut canviar el nom:\n");
			}
			
			
		}else {
			System.out.println("Ho sento, però no he trobat el fitxer o directori:\n");
		}
		
		
		
	}
}
