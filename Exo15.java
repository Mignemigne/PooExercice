// Exo_15

// Niveau : 3 ⭐

// Exercice :

    // Créez un tableau d'entiers de taille 10. Remplissez le de 10 nombres aléatoires entre 0 et 100.
    // Affichez le
    // Affichez le nombre de nombres pairs dans le tableau.

// Exemple de sortie attendue :

// [5,1,2,2,1,4,5,6,6,7]
// Il y a 5 nombres pairs dans ce tableau

import java.util.Arrays;

public class Exo15 {
	public static void main(String[] args) {
		int firstNumber = (int) (Math.random() * 101);
		int secondNumber = (int) (Math.random() * 101);
		int thirdNumber = (int) (Math.random() * 101);
		int fourthNumber = (int) (Math.random() * 101);
		int fiftNumber = (int) (Math.random() * 101);
		
		int[] numberArray = {firstNumber, secondNumber, thirdNumber, fourthNumber, fiftNumber};
		
		System.out.println("" + Arrays.toString(numberArray));
		
		int n = 5;
		
		int evenSize = 0;
		
		for (int i = 0; i < n; i++) {
			if (numberArray[i] % 2 == 0) {
				evenSize++;
			}
		}
		System.out.println("Il y a " + evenSize + " nombres pairs dans ce tableau");
		
		int[] even = new int[evenSize];
	}
}