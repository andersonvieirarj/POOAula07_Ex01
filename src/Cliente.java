public class Cliente {
    private String nome;
    private String cpf;
    private String numeroCartao;
    public Cliente(String nome, String cpf, String numeroCartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCartao = numeroCartao;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numeroCartao='" + numeroCartao + '\'' +
                '}';
    }
}
