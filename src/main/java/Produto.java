import java.time.LocalDate;

public class Produto {
    private String nome;
    private float preco;
    private LocalDate validade;


    public Produto(String nome, float preco, LocalDate validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getPreco() {
        return preco;
    }


    public void setPreco(float preco) {
        this.preco = preco;
    }


    public LocalDate getValidade() {
        return validade;
    }


    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    
}
