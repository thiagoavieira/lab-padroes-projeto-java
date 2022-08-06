package gof.one.digitalinnovation.singleton;

/**
 * Singleton "preguiçoso"; não disponibiliza a instância para o usuário.
 *
 * @author thiagoavieira
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
