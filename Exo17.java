// Exo_17
// Niveau : 3 ⭐

// Exercice :

// Compter combien de voyelles (a, e, i, o, u, y) il y a dans un tableau de caractères.

// Créez un tableau de caractères : ['a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'].
// Utilisez une boucle pour compter combien de voyelles il y a dans le tableau et affichez le résultat.
// Exemple de sortie attendue :

// Il y a 5 voyelles dans le tableau.

public class Exo17 {
	public static void main(String[] args) {
		
		char[] array = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'};
		
		byte vowel = 0;
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] == 'a') {
				vowel++;
			} else if (array[i] == 'e') {
				vowel++;
			} else if (array[i] == 'i') {
				vowel++;
			} else if (array[i] == 'o') {
				vowel++;
			} else if (array[i] == 'u') {
				vowel++;
			} else if (array[i] == 'y') {
				vowel++;
			}
			
		}
		System.out.print("Il y a " + vowel + " voyelles dans le tableau.");
	}
}