// Niveau : 1 ⭐

// Exercice :

// //--------------------------------------------------------------------
// // Afficher le résulat de ces opérations sans l'écrire explicitement
// //--------------------------------------------------------------------

// // Additionne 50 et 34

// // Soustrait 50 à 34

// // Mutiplie 4 par 80

// // Divise 80 par 4

// // 50 modulo 3


// int i = 9;
// // Ajoute 1 à la variable i


// // Retire 2 à la variable i
   

// Exemple de sortie attendue :

// 84
// 16
// 320
// 20
// 2
// 10
// 8


public class Exo4 {
	
	public static int addition(int x, int y) {
		return x + y;
	}
	
	public static int soustraction(int x, int y) {
		return x - y;
	}
	
	public static int multiplication(int x, int y) {
		return x * y;
	}
	
	public static int division(int x, int y) {

		return x / y;
	}
	
	public static int modulo(int x, int y) {
		
		return x % y;
	}
	
	public static int operation(int i, int x, int y) {
		
		return i + x - y;
	}
	
	public static void main(String[] args) {
		
		System.out.print(addition(50, 34) + "\n" + soustraction(50, 34) + "\n" + multiplication(4, 80) + "\n" + division(80, 4) + "\n" + modulo(50, 3) + "\n" + operation(9, 1, 2));
	}
}