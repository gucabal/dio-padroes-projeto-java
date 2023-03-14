package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getSingletonEager();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getSingletonEager();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getSingletonLazyHolder();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getSingletonLazyHolder();
        System.out.println(singletonLazyHolder);

        System.out.println("#####################################");

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        System.out.println("#####################################");

        // Facade

        Facade facade =  new Facade();
        facade.migrarCliente("Venilton", "06440000");





    }
}
