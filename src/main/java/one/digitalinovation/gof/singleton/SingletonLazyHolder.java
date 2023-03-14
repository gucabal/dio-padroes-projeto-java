package one.digitalinovation.gof.singleton;

/**
 * Sigleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author gucabal
 */
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder singletonLazyHolder = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getSingletonLazyHolder(){
        return Holder.singletonLazyHolder;
    }


}
