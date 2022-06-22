import java.util.Scanner;

public class Personne {
	// Les attributs
	int cin;
	String nom;
	String prenom;
	Date naiss;
	String adresse;
	int telephone;
	
	//Un constructeur avec paramètres
	Personne(int c, String n, String p, Date d, String a, int t){
		cin = c;
		nom = n;
		prenom = p;
		naiss = d;
		adresse = a;
		telephone = t;
	}
	
	//Un construteur sans paramètres
	Personne(){
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\n"); // le délimiteur retour à la ligne est utilisé pour accepter une chaine de caractères contenant des espaces avec la méthode next()
							  //cela veut dire la saisie s'arrête lorsque l'utilisateur clique sur entrée
		System.out.print(" - Saisir le cin:");
		cin = s.nextInt();
		System.out.print(" - Saisir le nom:");
		nom = s.next();
		System.out.print(" - Saisir le prenom:");
		prenom = s.next();
		System.out.println(" - Saisir la date de naissance:");
		naiss = new Date();
		System.out.println(" - Saisir l'adresse:");
		adresse = s.next();
		System.out.println(" - Saisir le numéro de téléphone:");
		telephone = s.nextInt();
		
	}
	
	// Une méthode pour l'affichage
	void afficher() {
		System.out.println("\t - cin : "+cin);
		System.out.println("\t - nom : "+nom);
		System.out.println("\t - prenom : "+prenom);
		System.out.print("\t - date naissance : "); naiss.afficher();
		System.out.println("\t - adresse : "+adresse);
		System.out.println("\t - telephone : "+telephone);
	}
}
