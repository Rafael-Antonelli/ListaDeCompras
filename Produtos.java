public class Produtos {
    private String nome;
    private double quantidade;
    private String unidade;

    public Produtos (String nome, double quantidade, String unidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }
    public String getNome() {
        return nome;
    }
    public double getQuantidade() {
        return this.quantidade;
    }
    public String getUnidade() {
        return unidade;
    }
    @Override
    public String toString() {
        return nome+","+quantidade+" "+unidade;
    }
}
