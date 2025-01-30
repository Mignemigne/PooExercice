// Exo_6
// Niveau : 1 ⭐

// Exercice :

//--------------------------------------------------------------------
// Afficher le résulat de ces comparaisons sans l'écrire explicitement
//--------------------------------------------------------------------

// Enregistre dans une variable si 44 est égal à 66

// Enregistre dans une varible si 44 n'est pas égal a 66

// Enregistre dans une varible si 44 est plus grand que 66

// Enregistre dans une varible si 44 est plus petit ou égal à 66

// Affiche true si les variable estSante et estAbordable sont toutes les 2 true, false sinon


// Affiche true si estSante est fausse et estAbordable est true, false sinon



// Affiche true si estSante ou estAbordable est true, false sinon
// Exemple de sortie attendue :

// false
// true
// false
// true

// false
// false
// true


public class Exo6 {
	public static void main(String[] args) {
		int number1 = 44;
		int number2 = 66;
		
		boolean answer = true;
		
		boolean estSante = true;
		boolean estAbordable = false;
		
		if (number1 == number2) {
			answer = true;
			System.out.println(answer);
		} else {
			answer = false;
			System.out.println(answer);
		}
		
		if (number1 != number2) {
			answer = true;
			System.out.println(answer);
		}
		
		if (number1 > number2) {
			answer = true;
			System.out.println(answer);
		} else {
			answer = false;
			System.out.println(answer);
		}
		
		if (number1 < number2) {
			answer = true;
			System.out.println(answer);
		}
		
		if (estSante && estAbordable) {
			answer = true;
			System.out.println(answer);
		} else {
			answer = false;
			System.out.println(answer);
		}
		
		if (!estSante && estAbordable) {
			answer = true;
			System.out.println(answer);
		} else {
			answer = false;
			System.out.println(answer);
		}
		
		if (estSante || estAbordable) {
			answer = true;
			System.out.println(answer);
		} else {
			answer = false;
			System.out.println(answer);
		}
	}
}

// Corrigée chatgpt

// public class Exo6 {
    // public static void main(String[] args) {
        // int number1 = 44;
        // int number2 = 66;

        // // Enregistre les résultats des comparaisons dans des variables
        // boolean isEqual = number1 == number2;
        // boolean isNotEqual = number1 != number2;
        // boolean isGreater = number1 > number2;
        // boolean isLessOrEqual = number1 <= number2;

        // // Affiche les résultats des comparaisons
        // System.out.println(isEqual);          // false
        // System.out.println(isNotEqual);       // true
        // System.out.println(isGreater);        // false
        // System.out.println(isLessOrEqual);    // true

        // // Variables pour la santé et l'abordabilité
        // boolean estSante = true;
        // boolean estAbordable = false;

        // // Vérifie les conditions avec les opérateurs logiques
        // System.out.println(estSante && estAbordable);   // false
        // System.out.println(!estSante && estAbordable);  // false
        // System.out.println(estSante || estAbordable);   // true
    // }
// }
