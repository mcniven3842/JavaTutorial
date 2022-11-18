package lenguajes;

import java.util.Scanner;

public class testMatch {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String regex = "test"; // expression régulière à rechercher
			String chaine; // chaîne à traiter
			do {
				System.out.println("Veuillez entrer votre chaîne de test (CTRL-D to exit)");
				chaine=sc.nextLine();
				if (chaine.matches(regex))
					System.out.println(chaine + " --> OK");
				else
					System.out.println(chaine + " --> PAS OK");
				} while (sc.hasNext());
			}

}
