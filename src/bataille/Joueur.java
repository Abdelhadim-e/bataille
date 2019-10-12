package bataille;

import java.util.ArrayList; // ArrayList 
import java.lang.Math; // Utilisation outils math hasard (Math.random) 
import java.util.Collections; // Permet de récup la position d'un objet dans la liste (Collection.shuffle)


public class Joueur{

  // Attributs
  private int points;
  private ArrayList<Carte> paquet;

  Joueur(){
    this.points = 0;
    // Creer un paquet vide
    this.paquet = new ArrayList<Carte>();
  }

  Joueur(int points, ArrayList<Carte> paquet){
    this.points = points;
    this.paquet = paquet;
  }

  // Méthode tirer une carte du paquet
  public Carte tirer() {
	  int t = (int) (Math.random() * this.paquet.size() + 0.5);
	  
	  Carte carteTire = null;
	  for(int i = 0; i<t;i++) {
		  carteTire = paquet.get(i);
	  }
	  return carteTire;
  }
  // Méthode ajouter une carte au paquet
  public void ajouter(Carte a) {
	  // Ajout un element dans la liste
	  this.paquet.add(a);
  }
  
  // Pour creer le nombre "n" des cartes au hasard puis ranger dans un paquet ( init paquet de "n" carte)
  public void creerCarte(int n) {
	  for(int i = 0;i < n;i++) {
		  String coul = "";
		  String val = "";
		  int a = 0; //coul
		  int b = O; //val
		  
		  a = (int)(Math.random() * 4.5);
		  b = (int)(Math.random() * 13.5);
		  for(int j=0;j<a;j++) {
			  coul = couleurs[j];
		  }
		  for(int j=0;j<b;j++) {
			  val = valeurs[j];
		  }
		  this.ajouter(new Carte(coul,val));
	  }
  }
  
  public void melanger() {
	  // Mettre tout les éléments dans le désordres dans le paquet
	  Collection.shuffle(this.paquet);
  }
  
  public void gagnerPoints(int p) {
	  this.points+=p;
  }
  
  public int getPoint() {
	  return this.points;
  }
}
