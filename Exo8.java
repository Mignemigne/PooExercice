// Exo_8

// Niveau : 3 ⭐

// Exercice :

// Afficher le tableau généré à la question précédente sous un format plus esthétique

// Exemple de sortie attendue :

// [45,30,56,77,34]

public class Exo8 {
	public static void main(String[] args) {
		
		int firstNumber = (int) (Math.random() * 101);
		int secondNumber = (int) (Math.random() * 101);
		int thirdNumber = (int) (Math.random() * 101);
		int fourthNumber = (int) (Math.random() * 101);
		int fiftNumber = (int) (Math.random() * 101);
		
		int[] numberArray = {firstNumber, secondNumber, thirdNumber, fourthNumber, fiftNumber};
		
		System.out.print("[" + numberArray[0] + "," + numberArray[1] + "," + numberArray[2] + "," + numberArray[3] + "," + numberArray[4] + "]");
	}
}