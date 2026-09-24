public abstract class Assinatura {
    private String nome;
    private float mensalidade;
    
    public Assinatura(String nome, float mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public abstract float desconto();
}
