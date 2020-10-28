


import java.io.File;
import java.util.Scanner;

public class ex4ObtenirEspai {

	 //mètode principal 	
	public static void main(String[] args) {
		
		//Sol·licitem a l'usuari la ruta a la carpeta o directori que vol comprobar:
		Scanner sc = new Scanner(System.in);
    	System.out.println("Si us plau introdueixi la ruta a la carpeta o directori que vol consultar:\n");
    	String ruta = sc.nextLine();
        
        File fitxer = new File(ruta);
       
        //Es comprova si el fitxer o directori existeix 
        if(fitxer.exists()) {
        	//Es comprova si és un fitxer
        	if (fitxer.isFile()){
	        	System.out.println("La ruta al fitxer és " + fitxer.getAbsolutePath());
	            System.out.println("El seu nom és " + fitxer.getName() + "\n");
        	}else {
        		//És un directori
        		System.out.println("La ruta al directori és " + fitxer.getAbsolutePath());
	            System.out.println("El seu nom és " + fitxer.getName() + "\n");
	            System.out.println("El seu pare és " + fitxer.getParent());
	            System.out.println("L'espai total és " + fitxer.getTotalSpace());
	            System.out.println("L'espai disponible és " + fitxer.getUsableSpace());
	            System.out.println("L'espai lliure és " + fitxer.getFreeSpace());
        	}
        }else {
        	//Si no existeix mostra un missatge informatiu
        	System.out.println("No s'ha trobat el fitxer o directori");
        }
    //fi del main
	}
//fi de la classe
}
