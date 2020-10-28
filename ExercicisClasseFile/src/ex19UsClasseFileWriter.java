/**
 * Exemple de com fer servir la classe FileWriter

 */


import java.io.FileWriter;
import java.io.IOException;


public class ex19UsClasseFileWriter {
	
public static void main (String[] args) {
		
		String nomFitxer = "exercici19.txt";
		//Declarem l'objecte FileWriter
		FileWriter output = null;
		
			
			try {
				//Obrim el fitxer on s'escriuran les dades
	            output = new FileWriter(nomFitxer);
	      
				//Escrivim 10 files
				for(int x=0;x<10;x++)
					output.write("Fila número: " + x + "\n");
				System.out.println("S'ha escrit el fitxer");
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
	            //En aquest bloc s'escriuen instruccions que s'executen sempre, es produeixin excepcions o no
	            //tanquem el flux de sortida
	            if (output != null) {
	                try {
						output.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
			
	}

}
