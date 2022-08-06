package gof.one.digitalinnovation.singleton;

/**
 * Singleton "Detentor Preguiçoso"; encapsula a instância em uma classe estática externa.
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 *
 * @author thiagoavieira
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instance;
    }
}
