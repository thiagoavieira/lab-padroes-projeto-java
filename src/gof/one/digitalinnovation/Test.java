package gof.one.digitalinnovation;

public class Test {
    public static void main(String[] args) {

        /* Testes relacionados ao Design Pattern Singleton:
           Teste para verificar se retorna a mesma instância; mesmo endereço de memória. */
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println("\n" + singletonLazy);
        singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);

        // Teste para verificar se retorna a mesma instância; mesmo endereço de memória.
        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println("\n" + singletonEager);
        singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);

        // Teste para verificar se retorna a mesma instância; mesmo endereço de memória.
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("\n" + singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
    }
}
