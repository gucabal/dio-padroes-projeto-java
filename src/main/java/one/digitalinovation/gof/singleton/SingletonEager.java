package one.digitalinovation.gof.singleton;

/**
 *  Sigleton "apressado"
 *
 *  @author gucabal
 */

public class SingletonEager {

    private static SingletonEager singletonLazy =  new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getSingletonEager(){
        return singletonLazy;
    }


}
