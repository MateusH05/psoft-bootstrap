public abstract class TipoPagamento {

    private String nome;

    public TipoPagamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}