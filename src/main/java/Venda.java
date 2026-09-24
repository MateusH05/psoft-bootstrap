import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private int id;
    private LocalDate data;
    private Cliente cliente;
    private List<Item> itens;
    private List<Pagamento> pagamentos;

    public Venda(int id, LocalDate data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
    }

    public void adicionarProduto(Item item) {
        itens.add(item);
    }

    public void removerProduto(Item item) {
        itens.remove(item);
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public double totalVenda() {
        double total = 0;

        for (Item item : itens) {
            total += item.subtotal();
        }

        double desconto = cliente.getAssinatura().desconto();

        return total * (1 - desconto);
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
}