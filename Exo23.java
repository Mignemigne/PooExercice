// Exo_23

// Niveau : 3 ⭐

// Faites une méthode qui vérifie si un tableau de caractères (par exemple, un mot) est un palindrome (le mot est identique lorsqu'il est lu de gauche à droite ou de droite à gauche).

// Exercice :

    // Créez un tableau de caractères représentant un palindrome : ['L','a','v','a','l'].

    // Créez un autre tableau qui ne représente pas un palindrome.

    // Faites une méthode qui prend 1 tableau de caractère en paramètre et qui affiche si ce tableau contient ou non un palindrome.

    // Testez pour vos 2 tableaux. Exemple de sortie attendue :

// Le mot est un palindrome.
import java.util.Arrays;

public class Exo23 {
	public static void main(String[] args) {
		
		char[] array1 = {'l','a','v','a','l'};
		
		char[] array2 = {'v','o','i','t', 'u', 'r','e'};

		char[] array1Reverse = {'l','a','v','a','l'};
		char[] array2Reverse = {'v','o','i','t', 'u', 'r','e'};
		
		for(byte i = 0; i < array1Reverse.length / 2; i++) {
			char temp = array1Reverse[i];
			array1Reverse[i] = array1Reverse[array1Reverse.length - 1 - i];
			array1Reverse[array1Reverse.length - 1 - i] = temp;
		}
		
		for(byte j = 0; j < array2Reverse.length / 2; j++) {
			char temp2 = array2Reverse[j];
			array2Reverse[j] = array2Reverse[array2Reverse.length - 1 - j];
			array2Reverse[array2Reverse.length - 1 - j] = temp2;
		}
		
		if(Arrays.equals(array1, array1Reverse)) {
			System.out.println("Le mot est un palindrome.");
		} else if(!Arrays.equals(array1, array1Reverse)) {
			System.out.println("Le mot n'est pas un palindrome.");
		}		
		
		if(Arrays.equals(array2, array2Reverse)) {
			System.out.println("Le mot est un palindrome.");
		} else if(!Arrays.equals(array2, array2Reverse)) {
			System.out.println("Le mot n'est pas un palindrome.");
		}
	}
}