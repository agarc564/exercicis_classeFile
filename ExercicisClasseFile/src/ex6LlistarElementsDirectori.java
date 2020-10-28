
/******Proposta de solució per a l'exercici 6 de la UF1**************/
import java.io.File;
import java.util.Scanner;

public class ex6LlistarElementsDirectori {
	 //mètode principal 
	 public static void main (String[] args){
	
		//Sol·licitem a l'usuari la ruta a la carpeta o directori que vol llistar:
	    Scanner sc = new Scanner(System.in);
		System.out.println("Si us plau introdueixi la ruta a la carpeta o directori que col comprobar:\n");
		String ruta = sc.nextLine();
	    
	   //S'inicialitzen una carpeta i un fitxer amb ruta absoluta 
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
	            File[] arrayElements = fitxer.listFiles();
	            System.out.println("\nEl contingut de " + fitxer.getAbsolutePath() + " es:");
	            
	            for (int i = 0; i < arrayElements.length; i++){
	                File f = arrayElements[i];
	                //mostra un missatge diferent si l'element és una carpeta o un fitxer
	                if(f.isDirectory()){
	                  System.out.print("[DIR] ");  
	                }else{
	                    //Si no és un directori serà un fitxer
	                   System.out.print("[FIT] "); 
	                }
	                System.out.println(f.getName());
	            }
	    	}
	    }else {
	    	//Si no existeix mostra un missatge informatiu
	    	System.out.println("No s'ha trobat el fitxer o directori");
	    }
	  //fi main  
	 }
	 //Fi classe
}
