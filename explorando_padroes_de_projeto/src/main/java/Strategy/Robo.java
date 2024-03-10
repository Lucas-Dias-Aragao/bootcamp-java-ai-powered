package Strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public void mover() throws InterruptedException {
        comportamento.mover();
    }

    public void esperar(Integer milis) throws InterruptedException {
        Thread.sleep(milis);
    }
}
