package BerrocalJoel;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Exercici2 {

	   public final static float MAX_EXCELLENT = 10.0f;
	   public final static float MIN_EXCELLENT = 9.0f;
	   public final static float MAX_NOTABLE = 8.99f;
	   public final static float MIN_NOTABLE = 6.5f;
	   public final static float MAX_APROBAT = 6.4f;
	   public final static float MIN_APROBAT = 5.0f;
	   public final static float MAX_SUSPES = 4.9f;
	   public final static float MIN_SUSPES = 0.0f;
	   public final static char ASTERISC = '*';
	   public final static String[] NOTES = {
	         "Excel·lent ",
	         "Notable    ",
	         "Aprovat    ",
	         "Suspès     "};
	   public final static String FIT_ENTRADA = "fitxers/NotesClasse.txt";
	   public final static String FIT_SORTIDA = "fitxers/NotesClasseHisto.txt";
	   public final static int TOTAL_NOTES = 4;
	   

	   public static int liniesDelFitxer(String nomFitxer){
		    int comptador = 0;
		 // Creem una variable enllaçada amb el fitxer que volem llegir
		    File fitxer = new File(nomFitxer);
		    
		    // Creem un punter al fitxer a llegir
		    Scanner puntFitxer = null;

		    // Per controlar els errors amb el fitxer a gestionar
		    try {
		      // Creem un punter per llegir el contingut del fitxer
		      puntFitxer = new Scanner(fitxer);
		      // Mentre hi hagi una següent línia fitxer al fitxer
		      while (puntFitxer.hasNextLine()) {
		        // Llegim la línia i la guardem String que anomenem linia
		        String linia = puntFitxer.nextLine();
		        // Mostrem la línia, que acabem de llegir per pantalla
		        System.out.println(linia);
		        comptador ++;
		        
		      }
		    } catch (Exception exepcioRebuda) {
		      // Si tenim errors amb el fitxer que gestionem
		      // mostrem el missatge d'error rebut.
		      System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
		    }
		  return comptador;
		  }

	   public static void main(String[] args) {
		    boolean teRepetits = false;
	        String linia;
	        String[] arrayCadenes;
	        int comptaLinia = 1;
	        int totalLiniesFitxer = 0;
	        
	        
	        File fitxer = new File(FIT_ENTRADA);
	        Scanner puntFitxer = null;

	        // Per controlar els errors amb el fitxer a gestionar
	        try {
	            // Creem un punter per llegir el contingut del fitxer
	            puntFitxer = new Scanner(fitxer);
	            // Mentre hi hagi una següent línia fitxer al fitxer
	            while (puntFitxer.hasNextLine()) {
	                // Llegim la línia i la guardem String que anomenem linia
	                linia = puntFitxer.nextLine();   
	                arrayCadenes = linia.split("#");
	               
	                comptaLinia++;
	            }
	        } catch (Exception exepcioRebuda) {
	            // Si tenim errors amb el fitxer que gestionem
	            // mostrem el missatge d'error rebut.
	            System.out.println("Missatge d'error: " + exepcioRebuda.getMessage());
	       }
	        
	        
	        
	   		}
		 }