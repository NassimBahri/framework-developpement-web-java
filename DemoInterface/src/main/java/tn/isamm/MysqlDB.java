package tn.isamm;

/**
 * Classe qui implémente l'interface IDB
 * Utilisée pour manipuler une base de données MySQL
 */
public class MysqlDB implements IDB {

    @Override
    public void add() {
        System.out.println("Ajout Mysql");
    }

    @Override
    public void get() {
        System.out.println("Get Mysql");
    }

    @Override
    public void update() {
        System.out.println("update Mysql");
    }

}
