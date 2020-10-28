/******Proposta de solució per a l'exercici 7 de la UF1**************/


import java.io.File;
import java.util.Scanner;

public class ex7Creardirectori {

	 //mètode principal 
	public static void main(String[] args) {
		
		//Sol·licitem a l'usuari la ruta on vol crear el directori
        Scanner sc = new Scanner(System.in);
		System.out.println("Si us plau introdueixi el directori que vol crear:\n");
		String ruta = sc.nextLine();
		// creem l'objecte que representa el directori
        File f = new File(ruta); 
  
        // comprova si el directori s'ha creat
        if (f.mkdirs()) { 
  
            // display that the directory is created 
            // as the function returned true 
            System.out.println("S'ha creat el directori"); 
        } 
        else { 
  
            // display that the directory cannot be created 
            // as the function returned false 
            System.out.println("No s'ha pogut crear el directori"); 
        } 
    //fi mètode main
	}
//fi de la classe
}
