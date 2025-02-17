// Exo_29

// Niveau : 3 ⭐

// Exercice :

// Vérifier si une chaîne est un palindrome (c'est-à-dire que la chaîne est identique lorsqu'on la lit de gauche à droite et de droite à gauche).

    // Faites une méthode qui prend en paramètre une chaîne de caractères.
    // Vérifiez si elle est un palindrome et affichez un message en conséquence.

// Exemple de chaîne : "radar"

// Exemple de sortie attendue :

// La chaîne est un palindrome.

public class Exo29 {
	public static void main(String[] args) {
		String sentence = "radar";
		String sentenceReverse = "";
		char letter;
		
		for(int i = 0; i < sentence.length(); i++) {
			letter = sentence.charAt(i);
			
			sentenceReverse = letter + sentenceReverse;
		}
		
		if(sentence.equals(sentenceReverse)) {
			System.out.println("La chaine est un palindrome");
		} else {
			System.out.println("La chaine n'est pas un palindrome");
		}
	}
}