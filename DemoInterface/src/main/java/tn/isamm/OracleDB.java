package tn.isamm;

/**
 * Classe qui implémente l'interface IDB
 * Utilisée pour manipuler une base de données Oracle
 */
public class OracleDB implements IDB {

    @Override
    public void add() {
        System.out.println("Ajout Oracle");
    }

    @Override
    public void get() {
        System.out.println("Get Oracle");
    }

    @Override
    public void update() {
        System.out.println("update Oracle");
    }
}
