public class Professor {
    private int numeroSiape;
    private String nome;
    private String titulacao;

    @Override
    public String toString() {
        return "Professor{" +
                "numeroSiape=" + numeroSiape +
                ", nome='" + nome + '\'' +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }

    public Professor(int numeroSiape, String nome, String titulacao) {
        this.numeroSiape = numeroSiape;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public int getNumeroSiape() {
        return numeroSiape;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }
}
