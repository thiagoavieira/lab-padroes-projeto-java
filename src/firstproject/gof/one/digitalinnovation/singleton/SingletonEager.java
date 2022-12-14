package gof.one.digitalinnovation.singleton;

/**
 * Singleton "apressado"; instância já atribuída.
 *
 * @author thiagoavieira
 */
public class SingletonEager {

    private static SingletonEager instance  = new SingletonEager();;

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instance;
    }
}
