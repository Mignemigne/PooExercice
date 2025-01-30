// Exo_13

// Niveau : 4 ⭐

// Exercice :

    // Supprimer les doublons du tableau suivant en supposant que vous ne savez pas d'avance les valeur dans le tableau: [5,1,2,2,1,4,5,6,6,7,8].
    // Affichez le nouveau tableau Exemple de sortie attendue :

// [5,1,2,4,6,7,8]

import java.util.Arrays;

public class Exo13 {
	public static void main(String[] args) {
		
		int[] numbers = {5,1,2,2,1,4,5,6,6,7,8};
		int n = numbers.length;
		
		int m = 0;
		
		for (int i = 0; i < n; i++) {
			m = Math.max(m, numbers[i]);
		}
		
		int[] f = new int[m + 1];
		
		for (int i = 0; i < n; i++) {
			f[numbers[i]]++;
		}
		
		System.out.print("[");
		for (int i = 0; i < m + 1; i++) {
			
			if (f[i] > 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("]");
		
	}
}