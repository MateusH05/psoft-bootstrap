public class Premium extends Assinatura {

    public Premium(String nome, float mensalidade) {
        super(nome, mensalidade);
    }

    @Override
    public float desconto() {
        return 0.05f;
    }
}