package bataille;

//import java.util.*;

public class Carte{

  // Attributs static accessible par tous les objets Carte
  public static String[] couleurs = {"coeur", "trefle", "carreau", "pique"};
  public static String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "valet", "dame", "roi", "as"};

  // Attributs privees
  private String couleur;
  private String valeur;

  //Constructeur
  public Carte(){
    this.couleur = "";
    this.valeur = "";
  }
  //Constructeur pour creer des carte
  public Carte(String couleur, String valeur){
    this.couleur = couleur;
    this.valeur = valeur;
  }

  public String getValeur(){
    return this.valeur;
  }

  public static int findValueIndex(String valeur){
    int i = 0;
    for(String val : valeurs){
      if(val == valeur){
        return i;
      }else{
        i++;
      }
    }
    return -1;
  }

  public int comparer(Carte carteAdverse){
    // return 1 si la carte qui appelle la méthode gagne
    // return 0 si la carte qui appelle la méthode perd
    // return 2 si les deux cartes ont la même valeur
    int index_valeur1 = findValueIndex(this.valeur);
    int index_valeur2 = findValueIndex(carteAdverse.getValeur());

    if (index_valeur1 > index_valeur2){
      return 1;
    }else if (index_valeur1 < index_valeur2){
      return 0;
    }else{
      return 2;
    }
  }
}
