// Exo_7

// Niveau : 2 ⭐

// Exercice :

    // Créez un tableau d'entiers de taille 5. Remplissez le de 5 nombres aléatoires entre 0 et 100. (Voir Math.random dans les notes de cours)
    // Affichez chaque valeur du tableau.

// Exemple de sortie attendue :

// 45
// 30
// 56
// 77
// 34


public class Exo7 {
	public static void main(String[] args) {
		
		int firstNumber = (int) (Math.random() * 101);
		int secondNumber = (int) (Math.random() * 101);
		int thirdNumber = (int) (Math.random() * 101);
		int fourthNumber = (int) (Math.random() * 101);
		int fiftNumber = (int) (Math.random() * 101);
		
		int[] numberArray = {firstNumber, secondNumber, thirdNumber, fourthNumber, fiftNumber};
		
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}
		
	}
}