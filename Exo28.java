// Exo_28

// Niveau : 3 ⭐

// Exercice :

// Inverser une chaîne de caractères.

    // Faites une méthode qui prend en paramètre une chaîne de caractères.
    // Inversez cette chaîne sans utiliser la méthode reverse().

// Exemple de chaîne : "Java"

// Exemple de sortie attendue :

// Java inversée donne : avaJ

public class Exo28{
	public static void main(String[] args) {
		String sentence = "Java";
		String sentenceReverse = "";
		char letter;
		
		for(int i = 0; i < sentence.length(); i++) {
			letter = sentence.charAt(i);
			
			sentenceReverse = letter + sentenceReverse;
		}
		
		System.out.println("Java inversée donne : " + sentenceReverse);
	}
}