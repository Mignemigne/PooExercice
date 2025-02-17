// Exo_27

// Niveau : 3 ⭐

// Compter le nombre de voyelles (a, e, i, o, u, y) dans une chaîne de caractères donnée.

// Exercice :

    // Faites une méthode qui prend en paramètre une chaîne de caractères.
    // Comptez combien de voyelles elle contient et affichez le résultat.

// Exemple de chaîne : "Hello World"

// Exemple de sortie attendue :

// Hello World
// Le nombre de voyelles dans la chaîne est : 3


public class Exo27{
	public static void main(String[] args) {
		String sentence = "Hello World";
		int vowel = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == 'a') {
				vowel++;
			} else if(sentence.charAt(i) == 'A') {
				vowel++;
			} else if(sentence.charAt(i) == 'e') {
				vowel++;
			} else if(sentence.charAt(i) == 'E') {
				vowel++;
			} else if(sentence.charAt(i) == 'i') {
				vowel++;
			} else if(sentence.charAt(i) == 'I') {
				vowel++;
			} else if(sentence.charAt(i) == 'o') {
				vowel++;
			} else if(sentence.charAt(i) == 'O') {
				vowel++;
			} else if(sentence.charAt(i) == 'u') {
				vowel++;
			} else if(sentence.charAt(i) == 'U') {
				vowel++;
			} else if(sentence.charAt(i) == 'y') {
				vowel++;
			} else if(sentence.charAt(i) == 'Y') {
				vowel++;
			}
		}
		System.out.println(sentence);
		System.out.print("Le nombre de voyelles dans la chaîne est : " + vowel);
	}
}