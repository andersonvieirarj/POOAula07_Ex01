import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Cliente> clientes = new LinkedList<>();

        clientes.add(new Cliente("João", "111.111.111-11", "1111 2222 3333 4444"));
        clientes.add(new Cliente("Maria", "222.222.222-22", "4444 3333 2222 1111"));
        clientes.add(new Cliente("Pedro", "333.333.333-33", "1234 5678 9012 3456"));
        clientes.add(new Cliente("Ana", "444.444.444-44", "9876 5432 1098 7654"));
        clientes.add(new Cliente("Carlos", "555.555.555-55", "6789 0123 4567 8901"));

        LinkedList<Produto> produtos = new LinkedList<>();
        produtos.add(new Produto("Caneta", 1, 1.50));
        produtos.add(new Produto("Caderno", 2, 10.00));
        produtos.add(new Produto("Lápis", 3, 0.50));
        produtos.add(new Produto("Borracha", 4, 0.75));
        produtos.add(new Produto("Mochila", 5, 50.00));
        produtos.add(new Produto("Régua", 6, 1.00));
        produtos.add(new Produto("Tesoura", 7, 3.50));
        produtos.add(new Produto("Apontador", 8, 0.75));
        produtos.add(new Produto("Papel", 9, 5.00));
        produtos.add(new Produto("Lapiseira", 10, 2.50));

        LinkedList<Vendas> vendas = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            Cliente cliente = clientes.get(i % clientes.size());
            Produto produto = produtos.get(i % produtos.size());
            int quantidade = (i % 4) + 1;
            vendas.add(new Vendas(cliente, produto, quantidade));
        }

        Vendas maiorCompra = vendas.getFirst();
        Vendas menorCompra = vendas.getFirst();

        for (Vendas venda : vendas) {
            if (venda.getValorTotal() > maiorCompra.getValorTotal()) {
                maiorCompra = venda;
            }
            if (venda.getValorTotal() < menorCompra.getValorTotal()) {
                menorCompra = venda;
            }
        }
        System.out.println("Maior compra:");
        System.out.println("Cliente: " + maiorCompra.getCliente().getNome());
        System.out.println("CPF: " + maiorCompra.getCliente().getCpf());
        System.out.println("Produto: " + maiorCompra.getProduto().getNome());
        System.out.println("Quantidade: " + maiorCompra.getQuantidade());
        System.out.println("Valor total: " + maiorCompra.getValorTotal());

        System.out.println();

        System.out.println("Menor compra:");
        System.out.println("Cliente: " + menorCompra.getCliente().getNome());
        System.out.println("CPF: " + menorCompra.getCliente().getCpf());
        System.out.println("Produto: " + menorCompra.getProduto().getNome());
        System.out.println("Quantidade: " + menorCompra.getQuantidade());
        System.out.println("Valor total: " + menorCompra.getValorTotal());
    }
    
    }
