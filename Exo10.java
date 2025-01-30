// Exo_10

// Niveau : 3 ⭐

// Exercice :

// Trouver la valeur maximale et minimale d'un tableau.

    // Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100.
    // Affichez le
    // Trouvez le maximum et le minimum du tableau, puis affichez-les.

// Exemple de sortie attendue :

// [45,30,56,77,34]
// Le maximum est : 77
// Le minimum est : 30

import java.util.Arrays;

public class Exo10 {
	public static void main(String[] args) {
		int firstNumber = (int) (Math.random() * 101);
		int secondNumber = (int) (Math.random() * 101);
		int thirdNumber = (int) (Math.random() * 101);
		int fourthNumber = (int) (Math.random() * 101);
		int fiftNumber = (int) (Math.random() * 101);
		
		int[] numberArray = {firstNumber, secondNumber, thirdNumber, fourthNumber, fiftNumber};
		
		int maximum = Arrays.stream(numberArray).max().getAsInt();
		int minimum = Arrays.stream(numberArray).min().getAsInt();
		
		System.out.print("[" + numberArray[0] + "," + numberArray[1] + "," + numberArray[2] + "," + numberArray[3] + "," + numberArray[4] + "]" + "\n" );
		System.out.print("Le maximum est : " + maximum + "\n");
		System.out.print("Le minimum est : " + minimum);
	}
}