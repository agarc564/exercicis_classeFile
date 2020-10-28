/**
 * 
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ex17UsClasseBufferedWriter {
	
	public static void main (String[] args) {
		
		String nomFitxer = "exercici17.txt";
		File fitxer = new File (nomFitxer);
		//Declarem el buffer d'escriptura
		BufferedWriter bw = null;
		
		//Comprova si el fitxer existeix
		if(fitxer.exists()) {
			System.out.println("EL fitxer " + fitxer.getName() + " ja existeix");
		}else {
			//El fitxer no existeix
			try {
				//Obrim el buffer d'escriptura redireccionant al fitxer
				bw = new BufferedWriter(new FileWriter(fitxer));
	      
				//Escrivim 10 números
				for(int x=0;x<10;x++)
					bw.write("Fila número: " + x + "\n");
				System.out.println("S'ha escrit el fitxer");
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
	            //En aquest bloc s'escriuen instruccions que s'executen sempre, es produeixin excepcions o no
	            //tanquem el flux de sortida
	            if (bw != null) {
	                try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
			
		}
	}

}
