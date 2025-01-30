// Exo_11

// Niveau : 3 ⭐

// Exercice :

    // Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100.
    // Affichez le
    // Inverser l'ordre des éléments du tableau.
    // Affichez le

// Exemple de sortie attendue :

// [45,30,56,77,34]
// [34,77,56,30,45]

import java.util.Arrays;

public class Exo11 {
	public static void main(String[] args) {
		int firstNumber = (int) (Math.random() * 101);
		int secondNumber = (int) (Math.random() * 101);
		int thirdNumber = (int) (Math.random() * 101);
		int fourthNumber = (int) (Math.random() * 101);
		int fiftNumber = (int) (Math.random() * 101);
		
		int[] numberArray = {firstNumber, secondNumber, thirdNumber, fourthNumber, fiftNumber};
		
		
		System.out.print("[" + numberArray[0] + "," + numberArray[1] + "," + numberArray[2] + "," + numberArray[3] + "," + numberArray[4] + "]" + "\n");
		
		for (int i = 0; i < numberArray.length / 2; i++) {
			int t = numberArray[i];
			numberArray[i] = numberArray[numberArray.length - 1 - i];
			numberArray[numberArray.length - 1 - i] = t;
		}
		
		System.out.print("[" + numberArray[0] + "," + numberArray[1] + "," + numberArray[2] + "," + numberArray[3] + "," + numberArray[4] + "]" + "\n");
	}
}