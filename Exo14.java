// Exo_14

// Niveau : 3 ⭐

// Exercice :

// Fusionner deux tableaux dans un seul tableau.

    // Créez deux tableaux : un tableau d'entiers [1, 2, 3] et un autre [4, 5, 6].
    // Fusionnez ces deux tableaux pour créer un tableau unique et affichez le résultat.

// Exemple de sortie attendue :

// Tableau fusionné : [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

public class Exo14 {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6};
		
		int arr1 = array1.length;
		int arr2 = array2.length;
		
		int arr3 = arr1 + arr2;
		
		int[] array3 = new int[arr3];
		
		System.arraycopy(array1, 0, array3, 0, arr1);
		System.arraycopy(array2, 0, array3, arr1, arr2);
		
		System.out.print("" + Arrays.toString(array3));
	}
}