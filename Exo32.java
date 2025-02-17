// Exo_32

// Niveau : 1 ⭐

// Convertir une chaîne de caractères en majuscules et en minuscules.

// Exercice :

    // Faites une méthode qui prend en paramètre une chaîne de caractères.
    // Affichez la version de la chaîne en majuscules et en minuscules.

// Exemple de chaîne : "java"

// Exemple de sortie attendue :

// Chaîne en majuscules : JAVA
// Chaîne en minuscules : java

public class Exo32 {
	public static void main(String[] args) {
		String sentenceLowerCase = "java";
		String sentenceUpperCase = sentenceLowerCase.toUpperCase();
		
		System.out.println("Chaîne en majuscules : " + sentenceUpperCase);
		System.out.println("Chaîne en minuscules : " + sentenceLowerCase);
	}
}