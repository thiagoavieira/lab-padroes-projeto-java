package gof.one.digitalinnovation.strategy;

public class ComportamentoPassivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
