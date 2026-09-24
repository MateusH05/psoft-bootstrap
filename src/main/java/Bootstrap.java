import java.time.LocalDate;

public class Bootstrap {

    public static void main(String[] args) {

    CPF cpf = new CPF("123.456.789-00");

    Assinatura assinatura = new Premium(
        "Premium",
        49.90f
    );

    Cliente cliente = new Cliente(
        "Mateus",
        cpf,
        assinatura
    );

    Produto produto = new Produto(
        "Teclado",
        100.0f,
        LocalDate.of(2026, 12, 31)
    );

    Item item = new Item(
        produto,
        20
    );

    Venda venda = new Venda(
        1,
        LocalDate.now(),
        cliente
    );

    venda.adicionarProduto(item);

    System.out.println("Cliente: " + cliente.getNome());
    System.out.println("Produto: " + produto.getNome());
    System.out.println("Subtotal: " + item.subtotal());
    System.out.println("Total da venda: " + venda.totalVenda());
}
}