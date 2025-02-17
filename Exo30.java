// Exo_30

// Niveau : 2 ⭐

// Exercice :

// Supprimer tous les espaces dans une chaîne de caractères.

    // Faites une méthode qui prend en paramètre une chaîne de caractères contenant des espaces.
    // Supprimez tous les espaces et affichez la chaîne résultante.

// Exemple de chaîne : "Hello World"

// Exemple de sortie attendue :

// La chaîne sans espaces est : HelloWorld


public class Exo30 {
	public static void main(String[] args) {
		String sentence = "Hello World";
		String newSentence = sentence.replace(" ", "");
		
		System.out.println("La chaîne sans espaces est : " + newSentence);
	}
}