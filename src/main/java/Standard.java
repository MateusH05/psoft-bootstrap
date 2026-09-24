public class Standard extends Assinatura {

    public Standard(String nome, float mensalidade) {
        super(nome, mensalidade);
    }

    @Override
    public float desconto() {
        return 0.0f;
    }
}
