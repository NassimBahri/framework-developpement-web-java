package tn.isamm;

/**
 * Classe permettant de gérer les personnes
 * Cette classe dépend d'une implémentation de l'interface IDB
 */
public class Personne {

    IDB cnx ;

    public Personne(IDB c){
        cnx = c;
    }


    public void getAll(){
        cnx.get();
    }


}
