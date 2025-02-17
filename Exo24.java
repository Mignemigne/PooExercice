// Exo_24

// Niveau : 2 ⭐

// Exercice :

    // Faites une méthode qui prend en paramètre un tableau de int et un int.
    // Renvoi true si le 2e paramètre est dans le tableau.

// Exemple de sortie attendue :

// true


public class Exo24 {
	public static void main(String[] args) {
		int[] array = {3, 2, 9, 34, 45, 65, 69};
		int number = 2;
		boolean answer = false;
		
		for(int i = 0; i < array.length; i++) {
			if(number == array[i]) {
				answer = true;
				break;
			}
		}
		
		System.out.println(answer);
	}
}