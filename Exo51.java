// Exo_51

// Niveau : 3 ⭐

// Exercice :

// Trier un ArrayList

    // Créez un ArrayList d'entiers avec des valeurs non triées.
    // Triez cet ArrayList dans l'ordre croissant.
    // Affichez l'ArrayList avant et après le tri.

// Exemple de sortie attendue :

// ArrayList avant le tri : [50, 30, 20, 40, 10]
// ArrayList après le tri : [10, 20, 30, 40, 50]

import java.util.ArrayList;
import java.util.Collections;

public class Exo51 {
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(10);
		
		System.out.println("ArrayList avant le tri : " + list);
		
		Collections.sort(list);
		
		System.out.println("ArrayList après le trie : " + list);
	}
}