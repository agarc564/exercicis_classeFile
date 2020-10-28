/**
 * 
 */


import java.io.File;
import java.util.Scanner;

public class ex10Moure {
	
	    //mètode principal 
	  	public static void main(String[] args) {	
	        //Demana a l'usuari el directori o fitxer que vol moure
			Scanner sc = new Scanner(System.in);
			System.out.println("Si us plau introdueixi el directori o fitxer que vol moure:\n");
			String origen = sc.nextLine();
			//Demana a l'usuari la ubicació on vol moure el fitxer o directori
			System.out.println("Si us plau introdueixi la ubicació on vol moure:\n");
			String desti= sc.nextLine();
			
			//Crea un objecte que referencia la ruta on es troba el fitxer o directori a moure
			File rutaOrigen = new File(origen);
			//Obté el nom del fitxer o directori
			String nom = rutaOrigen.getName();
			File rutaDesti= new File(desti + File.separator + nom);
			 
			
		     boolean correcte = rutaOrigen.renameTo(rutaDesti);
		     if (correcte)
		     	 System.out.println("La carpeta s'ha mogut a la destinació indicada");
		     	else
		     	 System.out.println("La carpeta no s'ha pogut moure");
		 }
}
