public class ContaCorrente {
    private double valor = 0;

    public void executarOperacao(Operacao opr) {
        this.valor += opr.operar();
    }

    public double getSalarioAtual() {
        return valor;
    }
}
