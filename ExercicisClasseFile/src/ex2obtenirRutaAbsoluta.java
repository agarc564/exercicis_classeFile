/******Proposta de solució per a l'exercici 2 de la UF1**************/


/*M06 UF1 Persistència en fitxers
 En aquest exemple es mostra com s'instancien objectes File amb rutes absolutes, fent ús de la propietat separator
 i el funcionament dels mètodes de la classe File:
    getAbsolutePath()
    getName()
i la propietat "separator"
*/

//Cal importar la classe File
import java.io.File;

public class ex2obtenirRutaAbsoluta {
    
    //mètode principal 
    public static void main(String[] args) {
            
        //S'inicialitza un fitxer amb ruta absoluta
    	File fitxer = new File (File.separator + "home"+ File.separator +"angela"+ File.separator +"prova1.txt");
    	  //S'inicialitza un directori amb ruta absoluta
    	File directori = new File (File.separator + "home"+ File.separator +"angela");
        
    	//Mostrem la ruta absoluta del fitxer
        System.out.println("La ruta al fitxer és " + fitxer.getAbsolutePath());
        //Mostrem el nom del fitxer
        System.out.println("El seu nom és " + fitxer.getName() + "\n");
        
        //Mostrem la ruta absoluta del directori
        System.out.println("La ruta a la carpeta és " + directori.getAbsolutePath());
        //Mostrem el directori pare del directori
        //System.out.println("El seu pare és " + directori.getParent());
        //Mostrem el nom del directori
        System.out.println("El seu nom és " + directori.getName() + "\n");
        //fi main
    }     
 
//fi classe    
}
