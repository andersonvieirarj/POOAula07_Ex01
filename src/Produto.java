public class Produto {
    private String nome;
    private int codigo;
    private double valor;
    public Produto(String nome, int codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", valor=" + valor +
                '}';
    }
}
