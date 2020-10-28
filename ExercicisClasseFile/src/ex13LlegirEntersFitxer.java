/**
 * 
 */


import java.io.File;
import java.util.Scanner;

public class ex13LlegirEntersFitxer {
	//Mètode principal
    public static void main (String[] args) {
    	
    	int notaMax, notaMin, mitjana = 0;
    	Scanner lector = null;
    	
    	try {
            //S'intenta obrir el fitxer
            System.out.println("La carpeta de treball es: " + System.getProperty("user.dir"));
            File f = new File("Enters.txt");
            lector = new Scanner(f);
            mostraContingutFitxers(lector);
            lector.close();
            //Mostra la nota maxima
            notaMax = trobaNotaMaxima();
            System.out.println("La nota més alta  és: " + notaMax);
            //Mostra la nota minima
            notaMin = trobaNotaMinima();
            System.out.println("El valor més baix és: " + notaMin);
            //Mostra la nota mitjana
            mitjana = trobaNotaMitjana();
            System.out.println("La nota mitjana és: " + mitjana);
            
        } catch (Exception e) {
            //S'ha produït un error
            System.out.println("Error: " + e);
        }finally {
            //En aquest bloc s'escriuen instruccions que s'executen sempre, es produeixin excepcions o no
            //tanquem el flux de sortida
            lector.close();
				
        }
       
    }
    
    public static void mostraContingutFitxers(Scanner lector) {
        
    	//Si s'executa aquesta instrucciÃ³, s'ha obert el fitxer
        //Controla que arriba al final del fitxer mitjanÃ§ant una constant
    	
        while (lector.hasNext()) {
            int valor = lector.nextInt();
            System.out.println("El valor llegit es: " + valor);
        }
        
    }
    
    public static int trobaNotaMaxima() {
    	
    	int notaMax =0;
    	try {
	    	File f = new File("Enters.txt");
	        Scanner lector = new Scanner(f);
	    	//De moment, el mÃ xim Ã©s el primer valor
	    	notaMax = lector.nextInt();
	        //Recorrem la resta de valors
	    	while (lector.hasNext()) {
	            int valor = lector.nextInt();
	            //El nou valor Ã©s mÃ©s gran?
	            if (notaMax < valor) {
	                notaMax= valor;
	            }
	        }
	        lector.close();
	    	
    	}catch(Exception e) {
    		//S'ha produït un error en accedir al fitxer
    		System.out.println("Error: " + e);
    	}
    	return notaMax;
    }
    
   public static int trobaNotaMinima() {
    	
	   int notaMin =0;
	   	try {
		    	File f = new File("Enters.txt");
		        Scanner lector = new Scanner(f);
		    	//De moment, el mínim és el primer valor
		    	notaMin = lector.nextInt();
		        //Recorrem la resta de valors
		    	while (lector.hasNext()) {
		            int valor = lector.nextInt();
		            //El nou valores mes petit?
		            if (notaMin > valor) {
		                notaMin= valor;
		            }
		        }
		        lector.close();
		    	
	   	}catch(Exception e) {
	   		//S'ha produït un error en accedir al fitxer
	   		System.out.println("Error: " + e);
	   	}
   	return notaMin;
   
    	
    }
   
   public static int trobaNotaMitjana() {
   	
	   	int totals=0,suma =0;
	   
       try {
	    	File f = new File("Enters.txt");
	        Scanner lector = new Scanner(f);
	        //Comencem pel primer valor enter del fitxer
	        suma = lector.nextInt();
	      //Recorrem la resta de valors per a calcular la nota mitjana
	        while (lector.hasNext()) {
	           int valor = lector.nextInt();
	           suma = suma + valor;  
	           totals++;
	       }
	        lector.close();
		    	
	   	}catch(Exception e) {
	   		//S'ha produït un error en accedir al fitxer
	   		System.out.println("Error: " + e);
	   	}
	    return suma/totals;
   }

}
