package bataille;

public class Bataille{

  public static void main(String[] args){
    // Créer deux joueurs
	  Joueur Joueur1 = new Joueur();
	  Joueur Joueur2 = new Joueur();
	  
	  Joueur1.creerCarte(10);
	  Joueur2.creerCarte(10);
	  
	  Joueur1.melanger();
	  Joueur2.melanger();
	  
	  Carte carteTire1 = null;
	  Carte carteTire2 = null;
	  
	  int a;
	  
	  System.out.println("La Bataille commence !");
	  
	  for(int i = 0; i < 20; i++) {
		  carteTire1 = Joueur1.tirer();
		  carteTire2 = Joueur2.tirer();
		  a = carteTire1.comparer(carteTire2);
		  
		  //Boucle switch
		  
		  switch(a) {
		  	case 0:
		  	Joueur2.gagnerPoints(2);
		  	break;
		  
		  	case 1:
		  	Joueur1.gagnerPoints(2);
		  	break;
		  	
		  	case 2:
		  	Joueur1.gagnerPoints(1);
		  	Joueur2.gagnerPoints(1);
		  	break;		  	
		  }
		  
		  System.out.println("Joueur 1 : " + Joueur1.getPoint() + " Joueur 2 : " + Joueur2.getPoint());
	  }
	  	 if(Joueur1.getPoint() > Joueur2.getPoint()) {
	  		 System.out.println(" Joueur 1 a gagné !");
	  	 }else if(Joueur2.getPoint()> Joueur2.getPoint()) {
	  		System.out.println(" Joueur 2 a gagné !");
	  	 }
	  		else {
	  		 System.out.println("Egalité les gars !");
	  	 }
	  	 
	  	 System.out.println("Le game est terminé");
	  	 
	  
//	  //TEST TEST :
//	  
//	  Carte CarteTest = new Carte("Coeur", "4");
//	  System.out.println("Test carte : " + CarteTest.getValeur());
  }
}