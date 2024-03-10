import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // Testes relacionados ao Design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // Testes Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.esperar(3000);
        robo.mover();
        robo.esperar(3000);
        robo.setComportamento(agressivo);
        robo.mover();
        robo.esperar(2000);
        robo.mover();
        robo.esperar(2000);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.esperar(4000);
        robo.mover();
    }
}
