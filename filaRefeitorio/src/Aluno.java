public class Aluno {
    private int numeroDeMatricula;
    private String nome;
    private String curso;

    @Override
    public String toString() {
        return "Aluno{" +
                "numeroDeMatricula=" + numeroDeMatricula +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    public Aluno(int numeroDeMatricula, String nome, String curso) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nome = nome;
        this.curso = curso;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}
