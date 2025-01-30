// Exo_18

// Niveau : 4 ⭐

// Compter combien de fois un élément apparaît dans un tableau.

// Exercice :

    // Créez un tableau de 10000 nombre aléatoire.
    // Sachant que les chiffres sont entre 0 et 10 inclusivement, comptez le nombre d'occurence de chaque chiffre.

// Exemple de sortie attendue :

// [5,1,2,2,1,4,5,6,6,7,8]
// 1 : 2
// 2 : 2
// 3 : 0
// 4 : 1
// 5 : 2
// 6 : 2
// 7 : 1
// 8 : 1
// 9 : 0
// 10 : 0


public class Exo18 {
	public static void main(String[] args) {
		
		short[] array = new short[10000];
		
		short numberOfZero = 0;
		short numberOfOne = 0;
		short numberOfTwo = 0;
		short numberOfThree= 0;
		short numberOfFourth = 0;
		short numberOfFive= 0;
		short numberOfSix = 0;
		short numberOfSeven = 0;
		short numberOfEigth = 0;
		short numberOfNine= 0;
		short numberOfTen = 0;
		
		for(short i = 0; i < array.length; i++) {
			array[i] = (short) (Math.random() * 11);
		}
		
		System.out.print("[");
		for(short i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ",");
			
		}
		System.out.println(array[array.length - 1] + "]");
		
		for(short i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				numberOfZero++;
			}
			
			if (array[i] == 1) {
				numberOfOne++;
			}
			
			if (array[i] == 2) {
				numberOfTwo++;
			}
			
			if (array[i] == 3) {
				numberOfThree++;
			}
			
			if (array[i] == 4) {
				numberOfFourth++;
			}
			
			if (array[i] == 5) {
				numberOfFive++;
			}
			
			if (array[i] == 6) {
				numberOfSix++;
			}
			
			if (array[i] == 7) {
				numberOfSeven++;
			}
			
			if (array[i] == 8) {
				numberOfEigth++;
			}
			
			if (array[i] == 9) {
				numberOfNine++;
			}
			
			if (array[i] == 10) {
				numberOfTen++;
			}
		}
		
		System.out.println("0 : " + numberOfZero);
		System.out.println("1 : " + numberOfOne);
		System.out.println("2 : " + numberOfTwo);
		System.out.println("3 : " + numberOfThree);
		System.out.println("4 : " + numberOfFourth);
		System.out.println("5 : " + numberOfFive);
		System.out.println("6 : " + numberOfSix);
		System.out.println("7 : " + numberOfSeven);
		System.out.println("8 : " + numberOfEigth);
		System.out.println("9 : " + numberOfNine);
		System.out.println("10 : " + numberOfTen);
	}
}