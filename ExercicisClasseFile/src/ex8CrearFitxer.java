


import java.io.File;
import java.util.Scanner;

public class ex8CrearFitxer {

	 //mètode principal 
	public static void main(String[] args) {	
	        	
	        		//Demanem el nom del fitxer
	        		System.out.println("Si us plau introdueixi el nom del fitxer que voleu crear:\n");
	        		Scanner sc = new Scanner(System.in);
					String nomFitxer = sc.nextLine();
	                File f = new File(nomFitxer); 
	             try { 
	                // Creem el fitxer
	                if (f.createNewFile()) { 
	                    System.out.println("S'ha creat correctament el fitxer"); 
	                   
	                }else {
	                    System.out.println("El fitxer ja existeix"); 
	                    
	            } 
	        	//S'ha produït una excepció en crear el fitxer 
	        	}catch (Exception e) { 
	                System.err.println(e); 
	            } 
        }
	}


