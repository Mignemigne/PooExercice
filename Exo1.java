// Niveau : 1 ⭐

// Exercice :

// Faites un programme qui prend prénom et nom de famille en argument et affiche bonjour <<Le_nom_complet_de_la_personne>>.

// Exemple de sortie attendue :

// java Exo1 Maxime Fournier
// bonjour Maxime Fournier

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre ton prénom");
		String firstName = scanner.nextLine();
		
		System.out.println("Entre ton nom de famille");
		String lastName = scanner.nextLine();
		
		System.out.println("Bonjour " + firstName + " " + lastName);
    }
}