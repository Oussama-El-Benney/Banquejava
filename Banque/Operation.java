import java.util.Scanner;

public class Operation {
	// Les attributs
	int numero;
	Date dateop;
	String libelle;
	String type;
	double montant;
	
	// un constructeur avec paramètres
	Operation(int n, Date d, String l, String t, double m){
		numero = n;
		dateop = d;
		libelle = l;
		type = t;
		montant =m;
	}
	
	// un constructeur sans paramètres
	Operation(){
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\n"); // le délimiteur retour à la ligne est utilisé pour accepter une chaine de caractères contenant des espaces avec la méthode next()
							  //cela veut dire la saisie s'arrête lorsque l'utilisateur clique sur entrée
		System.out.println("Veuillez entrer les informations relative à cette opération:");
		System.out.print(" - Saisir le numéro:");
		numero = s.nextInt();
		System.out.println(" - Saisir la date:");
		dateop = new Date();
		System.out.println(" - Saisir le libellé:");
		libelle = s.next();
		System.out.println(" - Saisir le type de l'opération:");
		type = s.next();
		System.out.println(" - Saisir le montant:");
		montant = s.nextDouble();
	}
	
	//Une méthode pour l'affichage
	void afficher() {
		System.out.println("-----------------------------------------------------");
		System.out.println(" *** Détails de l'opétation N°"+numero);
		System.out.print("\t - Date opération : "); dateop.afficher();
		System.out.println("\t - libelle : "+libelle);
		System.out.println("\t - type : "+type);
		System.out.println("\t - montant : "+montant);
	}
}
