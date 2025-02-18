// Exo_71
// Niveau : 4 ⭐

// Créer un menu pour gérer un reçu avec des options pour ajouter ou retirer des items.

// Exercice :

// Créez un tableau de String pour les noms des plats : ["Crevette", "Salade", "Frite", "Hamburger", "Gâteau"].
// Créez un tableau de float pour les prix des plats correspondants : [8.99, 5.60, 6.40, 10.99, 7.99].
// Implémentez un menu interactif avec les options suivantes :
// Ajouter un item.
// Retirer un item.
// Afficher le reçu (afficher les plats ajoutés et le total).
// Terminer la transaction (Afficher le reçu, écrire un message d'adieu et arrête le programme).
// À chaque ajout d'item, le prix du plat sera ajouté au total de la facture.
// À chaque retrait d'item, le prix du plat sera soustrait du total de la facture.
// Exemple de sortie attendue :

// Menu :
// 1. Ajouter un item
// 2. Retirer un item
// 3. Afficher le reçu
// 4. Terminer la transaction
// Total de la facture actuelle : 0.00$

// Entrez votre choix : 1
// Choisissez un item à ajouter :
// 1. Crevette           8.99$
// 2. Salade             5.60$
// 3. Frite              6.40$
// 4. Hamburger         10.99$
// 5. Gâteau             7.99$


// Entrez le numéro de l'item : 1
// Plat ajouté : Crevette
// Total de la facture actuelle : 8.99$

// Menu :
// 1. Ajouter un item
// 2. Retirer un item
// 3. Afficher le reçu
// 4. Terminer la transaction
// Total de la facture actuelle : 8.99$

// Entrez votre choix : 3
// Reçu :

// Crevette              8.99$
// ---------------------------
// Total                 8.99$


// Menu :
// 1. Ajouter un item
// 2. Retirer un item
// 3. Afficher le reçu
// 4. Terminer la transaction
// Total de la facture actuelle : 8.99$

// Entrez votre choix : 4

// Crevette              8.99$
// ---------------------------
// Total                 8.99$

// Merci pour votre visite!

import java.util.Scanner;
import java.util.ArrayList;

public class Exo71 {
	public static void main(String[] args) {
		
		String[] meal = {"Crevette", "Salade", "Frite", "Hamburger", "Gâteau"};
		float[] price = {8.99f, 5.60f, 6.40f, 10.99f, 7.99f};
		Scanner scanner = new Scanner(System.in);
		float notePrice = 0;
		ArrayList<String> myNote = new ArrayList<String>();
		
		while(true) {
			System.out.println("Menu : ");
			System.out.println("1. Ajouter un item");
			System.out.println("2. Retirer un item");
			System.out.println("3. Afficher le reçu");
			System.out.println("4. Terminer la transaction");
			System.out.printf("%.2f $%n%n", notePrice);
			System.out.println();
			System.out.print("Entrez votre choix : ");
			
			String choice = scanner.next();
			
			if(choice.equals("1")) {
				System.out.println("Choisissez un item à ajouter : ");
				System.out.println("1. Crevette           8.99$");
				System.out.println("2. Salade             5.60$");
				System.out.println("3. Frite              6.40$");
				System.out.println("4. Hamburger         10.99$");
				System.out.println("5. Gâteau             7.99");
				System.out.println("" + "\n");
				System.out.print("Entrez le numéro de l'item : ");
				String chosenItem = scanner.next();
				
				if(chosenItem.equals("1")) {
					System.out.println("Plat ajouté : Crevette");
					notePrice += 8.99f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.add(meal[0]);
				} else if(chosenItem.equals("2")) {
					System.out.println("Plat ajouté : Salade");
					notePrice += 5.60f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.add(meal[1]);
				} else if(chosenItem.equals("3")) {
					System.out.println("Plat ajouté : Frite");
					notePrice += 6.40f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.add(meal[2]);
				} else if(chosenItem.equals("4")) {
					System.out.println("Plat ajouté : Hamburger");
					notePrice += 10.99f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.add(meal[3]);
				} else if(chosenItem.equals("5")) {
					System.out.println("Plat ajouté : Gâteau");
					notePrice += 7.99f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.add(meal[4]);
				} else {
					System.out.println("Erreur");
				}
			} else if(choice.equals("2")) {
				System.out.println("Choisissez un item à retirer : ");
				System.out.println("1. Crevette           8.99$");
				System.out.println("2. Salade             5.60$");
				System.out.println("3. Frite              6.40$");
				System.out.println("4. Hamburger         10.99$");
				System.out.println("5. Gâteau             7.99");
				System.out.println("" + "\n");
				System.out.print("Entrez le numéro de l'item : ");
				String chosenItem = scanner.next();
				
				if(chosenItem.equals("1")) {
					System.out.println("Plat retirer : Crevette");
					notePrice -= 8.99f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.remove(meal[0]);
				} else if(chosenItem.equals("2")) {
					System.out.println("Plat retirer : Salade");
					notePrice -= 5.60f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.remove(meal[1]);
				} else if(chosenItem.equals("3")) {
					System.out.println("Plat ajouté : Frite");
					notePrice -= 6.40f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.remove(meal[2]);
				} else if(chosenItem.equals("3")) {
					System.out.println("Plat ajouté : Hamburger");
					notePrice -= 10.99f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.remove(meal[3]);
				} else if(chosenItem.equals("4")) {
					System.out.println("Plat ajouté : Gâteau");
					notePrice -= 7.99f;
					System.out.println("Total de la facture actuelle : " + notePrice + "$");
					myNote.remove(meal[4]);
				} else {
					System.out.println("Erreur");
				}
			} else if(choice.equals("3")) {
				System.out.println("Reçu : " + "\n");
				for(int i = 0; i < myNote.size(); i++) {
					if(myNote.get(i).equals("Crevette")) {
						System.out.println("Crevette               8.99$");
					} else if(myNote.get(i).equals("Salade")) {
						System.out.println("Salade                 5.60$");
					} else if(myNote.get(i).equals("Frite")) {
						System.out.println("Frite                  6.40$");
					} else if(myNote.get(i).equals("Hamburger")) {
						System.out.println("Hamburger              10.99$");
					} else if(myNote.get(i).equals("Gâteau")) {
						System.out.println("Hamburger              7.99$");
					}
					System.out.println("---------------------------");
					System.out.println("Total" + "" + "" + ""  + "" + notePrice + "$");
				}
			} else if(choice.equals("4")) {
				for(int i = 0; i < myNote.size(); i++) {
					if(myNote.get(i).equals("Crevette")) {
						System.out.println("Crevette               8.99$");
					} else if(myNote.get(i).equals("Salade")) {
						System.out.println("Salade                 5.60$");
					} else if(myNote.get(i).equals("Frite")) {
						System.out.println("Frite                  6.40$");
					} else if(myNote.get(i).equals("Hamburger")) {
						System.out.println("Hamburger              10.99$");
					} else if(myNote.get(i).equals("Gâteau")) {
						System.out.println("Hamburger              7.99$");
					}
				}
				System.out.println("---------------------------");
				System.out.println("Total              " + notePrice + "$");				
				System.out.println("Merci pour votre visite!");
				System.exit(0);
			}
		}
	}
}