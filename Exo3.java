//--------------------------------------------------------------------
// Créer et afficher les variables avec le meilleur type possible
//--------------------------------------------------------------------
        
// Variable contenant l'âge d'une personne

// Population du cégep Marie-Victorin

// Variable comptant la population au Qc

// Variable pour calculer le revenu d'un individu

// Nombre de gouttes d'eau dans une piscine.

// Une variable qui se rappelle si le prof était bon ou pas

// Note en lettre qu'un étudiant obtient au cours
    
// Les mois de l'année sous format texte 

// Exemple de sortie attendue :

// 20 ans
// 4000 personnes
// 8_000_000 d'habitants au Qc
// 154_452,43 $/année
// 960_000_000 gouttes d'eau dans une piscine
// true
// A
// Janvier


public class Exo3 {
	public static void main(String[] args) {
		
		byte age = 20;
		
		short people = 4000;
		
		long qcPopulation = 8_000_000;
		
		double revenu = 154_452.43;
		
		long waterLiter = 960_000_000;
		
		boolean isAnswer = true;
		
		char grade = 'A';
		
		String month = "Janvier";
		
		System.out.print(age + " ans" + "\n" + people + " personnes" + "\n" + qcPopulation + " d'habitants au QC" + "\n" + revenu + " $/année" + "\n" + waterLiter + " gouttes d'eau dans une piscine" + "\n" + isAnswer + "\n" +  grade + "\n" + month);
	}
}