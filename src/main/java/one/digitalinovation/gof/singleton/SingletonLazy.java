package one.digitalinovation.gof.singleton;

/**
 *  Sigleton "Preguiçoso"
 *
 gucabal    guca0203
 * *  @author gucabal
 */

public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getSingletonLazy(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }


}
