// Exo_12

// Niveau : 3 ⭐

// Exercice :

    // Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100.
    // Affichez le
    // Calculez la moyenne des éléments du tableau et affichez-la.

// Exemple de sortie attendue :

// [45,30,56,77,34]
// La moyenne des éléments du tableau est : 48.4

public class Exo12 {
	public static void main(String[] args) {
		int firstNumber = (int) (Math.random() * 101);
		int secondNumber = (int) (Math.random() * 101);
		int thirdNumber = (int) (Math.random() * 101);
		int fourthNumber = (int) (Math.random() * 101);
		int fiftNumber = (int) (Math.random() * 101);
		
		int[] numberArray = {firstNumber, secondNumber, thirdNumber, fourthNumber, fiftNumber};
		
		float average = (firstNumber + secondNumber + thirdNumber + fourthNumber + fiftNumber) / 5.0f;
		
		System.out.print("[" + numberArray[0] + "," + numberArray[1] + "," + numberArray[2] + "," + numberArray[3] + "," + numberArray[4] + "]" + "\n");
		System.out.print("La moyenne des éléments du tableau est : " + average);
	}
}