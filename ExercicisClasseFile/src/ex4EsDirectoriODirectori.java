/******Proposta de solució per a l'exercici 4 de la UF1**************/
 /*
En aquest exemple es mostra el funcionament dels mètodes de la classe File:
    getAbsolutePath()
    getName()
    getParent()
    exists()
    isFile()
    isDirectory()
 */


import java.io.File;
import java.util.Scanner;

public class ex4EsDirectoriODirectori {
    
	 //mètode principal 
    public static void main (String[] args){
        
    	//Sol·licitem a l'usuari la ruta a la carpeta o directori que vol comprobar:
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Si us plau introdueixi la ruta a la carpeta o directori que col comprobar:\n");
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
        	}
        }else {
        	//Si no existeix mostra un missatge informatiu
        	System.out.println("No s'ha trobat el fitxer o directori");
        }
    }
    
}
