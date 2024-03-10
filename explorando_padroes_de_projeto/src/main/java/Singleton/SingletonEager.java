package Singleton;
/*
* Singleton "Apressado".
*
* @author: Lucas-Dias-Aragao
* */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
