package tn.isamm;

/**
 * Classe principale
 */
public class Main {

    /**
     * Méthode principale
     * Instanciation de la classe qui implémente l'interface IDB (MysqlDB ou OracleDB)
     */
    public static void main(String[] args) {
        Personne p = new Personne(new OracleDB());
        p.getAll();
    }
}