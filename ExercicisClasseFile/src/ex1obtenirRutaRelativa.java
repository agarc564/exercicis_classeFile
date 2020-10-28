/******Proposta de solució per a l'exercici 1 de la UF1**************/


/*M06 UF1 Persistència en fitxers
 En aquest exemple es mostra com s'instancien objectes File amb rutes relatives
 i el funcionament dels mètodes de la classe File:
    getAbsolutePath()
    getName()
*/

//Cal importar la classe File
import java.io.File;

public class ex1obtenirRutaRelativa {
    
    //mètode principal 
    public static void main(String[] args) {
            
        //S'inicialitza un fitxer amb ruta relativa
    	File fitxer = new File ("clients.txt");
    	  //S'inicialitza un directori amb ruta relativa
    	File directori = new File ("src");
        
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
