import java.util.ArrayList;
import java.util.Scanner;

public class Compte {
	//Les attributs
	int numero;
	Personne prop;
	Date ouverture;
	double solde;
	//** Tableau d'opérations
	//Operation[] tabop;
	//int nbr;
	//** Liste d'opérations
	ArrayList<Operation> listeop;
	
	// Un constructeur avec paramètres
	Compte(int n, Personne p, Date d){
		numero = n;
		prop = p;
		ouverture = d;
		solde = 0;
		//tabop = new Operation[1000];
		//nbr = 0;
		listeop = new ArrayList();
	}
	
	//Un constructeur sans paramètres
	Compte(){
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez entrer les informations relative à ce compte:");
		System.out.print(" - Saisir le numéro:");
		numero = s.nextInt();
		System.out.println(" - Saisir les informations relatives au propriétaire:");
		prop = new Personne();
		System.out.println(" - Saisir la date:");
		ouverture = new Date();
		solde = 0; //initialiser le solde à 0
		listeop = new ArrayList(); // créer une liste d'opération vide
	}
	
	//**** Les méthodes
	// Méthode créditer	
	void crediter(Operation o) {
		if(o.type == "VRS") {
			solde += o.montant;
			//** Méthode de sauvegarde d'opération dans un tableau
			//tabop[nbr]=o;
			//nbr++;
			
			//** Méthode de sauvegarde d'opération dans une liste
			listeop.add(o);
		}
	}
	
	// Méthode débiter
	void debiter(Operation o) {
		if(o.type == "RTR") {
			if(solde >= o.montant) {
				solde -= o.montant;
				
				//** Méthode de sauvegarde d'opération dans un tableau
				//tabop[nbr]=o;
				//nbr++;
				
				//** Méthode de sauvegarde d'opération dans une liste
				listeop.add(o);
			}
		}
	}
	
	//Méthode afficher solde
	void afficher_solde() {
		System.out.println("** Solde Actuel : "+solde);
	}
	
	//Mathode info() permettant d'afficher les informations du compte
	void info() {
		System.out.println("**** Informations sur le compte N°"+numero);
		System.out.println("\t ** Propriétaire :"); prop.afficher();
		System.out.print("\t ** Date ouverture :"); ouverture.afficher();
		afficher_solde();
		
		System.out.println("______________________________________________________");
		System.out.println("**** Historique des opérations ****");
		for(int i=0; i<listeop.size(); i++) {
			//** Affichage à partir d'un tableau
			//tabop[i].afficher();
			
			//** Affichage à partir d'une liste
			listeop.get(i).afficher();
		}
		System.out.println("______________________________________________________\n");
	}
}
