/******Proposta de solució per a l'exercici 5 de la UF1**************/

import java.io.File;
import java.util.Scanner;

public class ex5LListarContingutDirectori {
	
	 //mètode principal 
	public static void main(String args[]) {
		
		//Sol·licitem a l'usuari la ruta on vol crear el directori
        Scanner sc = new Scanner(System.in);
		System.out.println("Si us plau introdueixi el directori que vol llistar:\n");
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
	            System.out.println("L'espai que ocupa és " + fitxer.length());
	            System.out.println("El contingut del directori " + fitxer.getName() + " és: " );
	            
	          //Llista tots els fitxers del directori
	            String[] arrayElements = fitxer.list();
	            System.out.println("\nEl contingut de " + fitxer.getAbsolutePath() + " es:");
	            
	            for (int i = 0; i < arrayElements.length; i++){
	                String element = arrayElements[i];
	                //mostra un missatge diferent si l'element és una carpeta o un fitxer
	                System.out.println(element);
	            }
	    	}
	    }else {
	    	//Si no existeix mostra un missatge informatiu
	    	System.out.println("El fitxer o directori no existeix");
	    }
		
	}

}
