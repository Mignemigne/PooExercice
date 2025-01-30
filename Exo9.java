// Exo_9

// Niveau : 2 ⭐

// Exercice :

// Ajouter la somme des élément du tableau après l'affichage de celui-ci à l'exo 8.

// Exemple de sortie attendue :

// [45,30,56,77,34]
// La somme des éléments du tableau : 242

public class Exo9 {
	public static void main(String[] args) {
		
		int firstNumber = (int) (Math.random() * 101);
		int secondNumber = (int) (Math.random() * 101);
		int thirdNumber = (int) (Math.random() * 101);
		int fourthNumber = (int) (Math.random() * 101);
		int fiftNumber = (int) (Math.random() * 101);
		
		int[] numberArray = {firstNumber, secondNumber, thirdNumber, fourthNumber, fiftNumber};
		
		int average = firstNumber + secondNumber + thirdNumber + fourthNumber + fiftNumber;
		
		System.out.print("[" + numberArray[0] + "," + numberArray[1] + "," + numberArray[2] + "," + numberArray[3] + "," + numberArray[4] + "]" + "\n" );
		System.out.print("La somme des éléments'du tableau : " + average);
	}
}