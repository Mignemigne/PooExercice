// Exo_25

// Niveau : 2 ⭐

// Exercice :

// // Enregistre l'alphabet en minuscule dans une variable


// // Affiche la longeur de la varibale alphabet


// // Affiche l'alphabet en majuscule



// // Trouve la position du f dans l'alphabet

// Exemple de sortie attendue :

// L'alphabet a 26 lettres
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// Le f est à la 6e position dans l'alphabet

public class Exo25{
	public static void main(String[] args) {
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		System.out.println("L'alphabet a " + alphabet.length + " lettres");
		
		for(char alphabetStickTogether : alphabet) {
			char alphabetStickTogether2 = Character.toUpperCase(alphabetStickTogether);
			System.out.print(alphabetStickTogether2);
		}
		System.out.println(" ");
		
		char letter = 'f';
		
		for(int i = 0; i < alphabet.length; i++) {
			if(letter == alphabet[i]) {
				System.out.print("Le " + letter + " est à la " + alphabet[i] + "e" + " position dans l'alphabet");
			}
		}
	}
}