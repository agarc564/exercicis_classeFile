/**
 * 
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ex18UsClasseBufferedReader {
	
	public static void main(String[] args) {
		String nomFitxer = "paraules.txt";
		File fitxer = new File (nomFitxer);
		String paraula;
		//Declarem el buffer de lectura
		BufferedReader br = null;
        
        try {
        	//Obrim el buffer d'escriptura redireccionant al fitxer
			br = new BufferedReader(new FileReader(fitxer));
          
           //Llegim paraula a paraula el contingut del fitxer d'entrada
             while ((paraula = br.readLine())!=null){
                 //Escrivim la línia llegida en el fitxer de sortida
                 System.out.println(paraula);
             }
            
        } catch (Exception e) {
            ///´S'ha produït una excepció
            System.out.println("Error: " + e);
           
        }finally {
            //En aquest bloc s'escriuen instruccions que s'executen sempre, es produeixin excepcions o no
            //tanquem el flux de sortida
            if (br != null) {
                try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
	}

}
