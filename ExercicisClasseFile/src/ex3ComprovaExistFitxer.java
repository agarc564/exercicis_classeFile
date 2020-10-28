/******Proposta de solució per a l'exercici 3 de la UF1**************/

/*
En aquest exemple es mostra el funcionament dels mètodes de la classe File:
    getAbsolutePath()
    getName()
    getParent()
    exists()
 */

//Cal importar la classe File


import java.io.File;
import java.util.Scanner;

public class ex3ComprovaExistFitxer {
    
	 //mètode principal 
    public static void main(String[] args){
    	
    	//Sol·licitem a l'usuari la ruta a la carpeta o directori que vol comprobar:
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Si us plau introdueixi la ruta a la carpeta o directori que vol comprobar:\n");
    	String ruta = sc.nextLine();
        
    	//Inicialitzem un objecte File amb la ruta introduïda
        File fitxer = new File(ruta);
       
        //Es comprova si el fitxer o directori existeix 
        if(fitxer.exists()) {
        	System.out.println("La ruta al fitxer és " + fitxer.getAbsolutePath());
            System.out.println("El seu nom és " + fitxer.getName() + "\n");
            System.out.println("El seu pare és " + fitxer.getParent());
        }else {
        	//Si no existeix mostrem un missatge informatiu
        	System.out.println("No s'ha trobat el fitxer o directori");
        }   
      //fi main  
    }
    //fi classe
}
