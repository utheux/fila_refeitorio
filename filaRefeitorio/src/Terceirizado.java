public class Terceirizado {
    private int numeroSiape;
    private String nome;

    @Override
    public String toString() {
        return "Terceirizado{" +
                "numeroSiape=" + numeroSiape +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Terceirizado(int numeroSiape, String nome) {
        this.numeroSiape = numeroSiape;
        this.nome = nome;
    }

    public int getNumeroSiape() {
        return numeroSiape;
    }

    public String getNome() {
        return nome;
    }
}
