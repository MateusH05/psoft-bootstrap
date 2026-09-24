import java.time.LocalDate;

public class Pagamento {

    private int id;
    private LocalDate data;
    private double valor;
    private TipoPagamento tipoPagamento;

    public Pagamento(int id, LocalDate data, double valor,
                     TipoPagamento tipoPagamento) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
}
