// Exo_50
// Niveau : 3 ⭐

// Exercice :

// Supprimer un élément d'un ArrayList

// Créez un ArrayList d'entiers avec les valeurs suivantes : [1, 2, 3, 4, 5].
// Demandez à l'utilisateur de saisir un nombre à supprimer.
// Supprimez ce nombre de l'ArrayList et affichez l'ArrayList après suppression.
// Exemple de sortie attendue :

// Entrez un nombre à supprimer : 3
// ArrayList après suppression : [1, 2, 4, 5]

import java.util.ArrayList;
import java.util.Scanner;

public class Exo50 {
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("1");
		array.add("2");
		array.add("3");
		array.add("4");
		array.add("5");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un nombre a supprimer : ");
		
		String number = scanner.nextLine();
		
		if (number.equals("1")) {
			array.remove(0);
			System.out.println(array);
		} else if (number.equals("2")) {
			array.remove(1);
			System.out.println(array);
		} else if (number.equals("3")) {
			array.remove(2);
			System.out.println(array);
		} else if (number.equals("4")) {
			array.remove(3);
			System.out.println(array);
		} else if (number.equals("5")) {
			array.remove(4);
			System.out.println(array);
		}
		
	}
}