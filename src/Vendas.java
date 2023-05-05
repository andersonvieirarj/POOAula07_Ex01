public class Vendas {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private double valorTotal;
    public Vendas(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = produto.getValor() * quantidade;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Produto getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    @Override
    public String toString() {
        return "Vendas{" +
                "cliente=" + cliente +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
