// Exo_31

// Niveau : 2 ⭐

// Trouver le premier et le dernier caractère d'une chaîne de caractères.

// Exercice :

    // Faites une méthode qui prend en paramètre une chaîne de caractères.
    // Affichez le premier et le dernier caractère de la chaîne.

// Exemple de chaîne : "Java"

// Exemple de sortie attendue :

// Le premier caractère est : J
// Le dernier caractère est : a


public class Exo31 {
	public static void main(String[] args) {
		String sentence = "Java";
		int sentenceSize = sentence.length();
		char letter;
		
		for(int i = 0; i < sentence.length(); i++) {
			letter = sentence.charAt(i);
			if(i == 0) {
				System.out.println("Le premier caractère est : " + letter);
			} else if(i == sentenceSize - 1) {
				System.out.println("Le dernier caractère est : " + letter);
			}
		}
	}
}