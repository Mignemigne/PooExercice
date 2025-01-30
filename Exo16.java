// Exo_16
// Niveau : 3 ⭐

// Exercice :

// Écrivez un programme qui initialise 2 tableaux d’entiers. Il affiche les 2 tableaux. Il affiche ensuite identique si les 2 tableaux ont le même nombre d’éléments et que tous les éléments au même index sont égaux, sinon il affiche différent.

// [5,1,2,2,1,4,5,6,6,7]
// [5,1,2,2,1,4,5,6,6,7]
// Identique
// [5,1,2,2,1,4,5,6,6,7]
// [5,1,2,2,0,4,5,6,6,7]
// Différent

import java.util.Arrays;

public class Exo16 {
	public static void main(String[] args) {
		
		int array1number1 = (int) (Math.random() * 101);
		int array1number2 = (int) (Math.random() * 101);
		int array1number3 = (int) (Math.random() * 101);
		int array1number4 = (int) (Math.random() * 101);
		int array1number5 = (int) (Math.random() * 101);
		int array1number6 = (int) (Math.random() * 101);
		int array1number7 = (int) (Math.random() * 101);
		int array1number8 = (int) (Math.random() * 101);
		int array1number9 = (int) (Math.random() * 101);
		int array1number10 = (int) (Math.random() * 101);
		
		int array1[] = {array1number1, array1number2, array1number3, array1number4, array1number5, array1number6, array1number7, array1number8, array1number9, array1number10};
		
		int array2number1 = (int) (Math.random() * 101);
		int array2number2 = (int) (Math.random() * 101);
		int array2number3 = (int) (Math.random() * 101);
		int array2number4 = (int) (Math.random() * 101);
		int array2number5 = (int) (Math.random() * 101);
		int array2number6 = (int) (Math.random() * 101);
		int array2number7 = (int) (Math.random() * 101);
		int array2number8 = (int) (Math.random() * 101);
		int array2number9 = (int) (Math.random() * 101);
		int array2number10 = (int) (Math.random() * 101);
		
		int array2[] = {array2number1, array2number2, array2number3, array2number4, array2number5, array2number6, array2number7, array2number8, array2number9, array2number10};
	
		System.out.print("" + Arrays.toString(array1) + "\n");
		System.out.print(""+ Arrays.toString(array2) + "\n");
		
		if (Arrays.equals(array1, array2)) {
			System.out.print("Identique");
		} else {
			System.out.print("Différent");
		}
	}
}


// Correction chatgpt

// import java.util.Arrays;

// public class Exo16 {
    // public static void main(String[] args) {
        
        // int array1[] = new int[10];
        // int array2[] = new int[10];

        // for (int i = 0; i < 10; i++) {
            // array1[i] = (int) (Math.random() * 101);
            // array2[i] = (int) (Math.random() * 101);
        // }

        // System.out.println(Arrays.toString(array1));
        // System.out.println(Arrays.toString(array2));
        
        // if (Arrays.equals(array1, array2)) {
            // System.out.println("Identique");
        // } else {
            // System.out.println("Différent");
        // }
    // }
// }
