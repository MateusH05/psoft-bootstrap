public class Item {
    private Produto produto;
    private int quantidade;
    
    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double subtotal(){
        double total = produto.getPreco()*this.quantidade;

        if(quantidade >= 20){
            total = total * 0.90;
        }

        return total;
    }
}
