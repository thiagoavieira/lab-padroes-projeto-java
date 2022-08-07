package gof.one.digitalinnovation;

import gof.one.digitalinnovation.facade.Facade;
import gof.one.digitalinnovation.singleton.SingletonEager;
import gof.one.digitalinnovation.singleton.SingletonLazy;
import gof.one.digitalinnovation.singleton.SingletonLazyHolder;
import gof.one.digitalinnovation.strategy.*;

public class Test {
    /*
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

        // Testes relacionados ao Padrão Comportamental "Strategy":
        Comportamento passivo = new ComportamentoPassivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(passivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Testes relacionados ao Padrão Estrutural "Facade":
        Facade facade = new Facade();
        facade.migrarCliente("Thiago", "14801-192");
    }
    */
}
