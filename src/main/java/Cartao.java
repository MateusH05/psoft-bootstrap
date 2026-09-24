public class Cartao extends TipoPagamento {

    private String numero;

    public Cartao(String numero) {
        super("Cartão");
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
