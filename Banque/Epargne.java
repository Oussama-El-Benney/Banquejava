import java.util.ArrayList;

//Le compte Epargne hérite de la classe Compte
public class Epargne extends Compte{
	//Les attributs
	double tauxInteret;
	
	//Le constructeur avec paramètres
	Epargne(int n, Personne p, Date d){
		super(n,p,d); //** Appeler le constructeur de la classe mère pour initialiser les attributs hérités
		tauxInteret = 0.05;
	}
	
	// Le constructeur sans paramètres
	Epargne(){
		super(); //** Appeler le constructeur de la classe mère pour initialiser les attributs hérités
		tauxInteret = 0.05;
	}
	
	//La méthode permettant de calculer le montant des intetêts
	void CalculInteret(){
		solde += solde * tauxInteret;
	}
}
