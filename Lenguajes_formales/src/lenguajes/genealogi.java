package lenguajes;
import java.io.*;
import java.util.regex.*;

public class genealogi {
	public static void main (String[] args){
		String leFichier = "C:\\Users\\Mcniven\\eclipse-workspace\\Lenguajes_formales\\src\\gen1551.csv"; // Chemin vers le fichier
		String uneLigne;
		String uneLigneTraitee;
		try {
		BufferedReader input = new BufferedReader (new FileReader (leFichier));
			while (input.ready()) {
				uneLigne = input.readLine();
				uneLigneTraitee = traiter(uneLigne);
				if (!uneLigneTraitee.equals(""))
					System.out.println(uneLigneTraitee);
			}	
			input.close();
			}
		catch (FileNotFoundException ex) {
		System.out.println("Fichier inexistant !!");
		}
		catch (IOException ex) {
		System.out.println("Erreur de lecture du fichier !!");
		}
		}
		public static String traiter (String ligne){
		// Mettre ici le traitement souhaité
		return(ligne);
		}
}
