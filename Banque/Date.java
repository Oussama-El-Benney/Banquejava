import java.util.Scanner;

public class Date {
	//Les attributs
	int jour;
	int mois;
	int annee;
	
	//Un constructeur avec paramètres
	Date(int j, int m, int a){
		jour = j;
		mois = m;
		annee = a;
	}
	
	//Un constructeur sans paramètres
	Date(){
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("   - Donner l'année");
			annee = s.nextInt();
		}while(annee<1900);
		
		do {
			System.out.println("   - Donner le mois");
			mois = s.nextInt();
		}while((mois<1) || (mois>12));
		
		if(mois == 2) {
			if((annee%4 ==0)&&((annee % 100 != 0)||(annee % 400 == 0))) {
				do {
					System.out.println("   - Donner le jour");
					jour = s.nextInt();
				}while((jour<1)||(jour>29));
			}else {
				do {
					System.out.println("   - Donner le jour");
					jour = s.nextInt();
				}while((jour<1)||(jour>28));
			}
		}else if((mois == 4)||(mois==6)||(mois == 9)||(mois == 11)) {
			do {
				System.out.println("   - Donner le jour");
				jour = s.nextInt();
			}while((jour<1)||(jour>30));
		}else {
			do {
				System.out.println("   - Donner le jour");
				jour = s.nextInt();
			}while((jour<1)||(jour>31));
		}
	}
	
	//Une méthode pour l'affichage
	void afficher() {
		System.out.println(jour+"/"+mois+"/"+annee);
	}
}
