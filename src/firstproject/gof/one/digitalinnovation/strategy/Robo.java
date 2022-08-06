package gof.one.digitalinnovation.strategy;

public class Robo {

    private Comportamento comportamento; // Strategy

    public void mover(){
        comportamento.mover();
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
}
