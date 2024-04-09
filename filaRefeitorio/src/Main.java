import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Object> filaRefeitorio = new LinkedList<>();

        var aluno1 = new Aluno(12345, "Joao", "BCC");
        var professor1 = new Professor(1234567, "Fernanda", "doutora");
        var terceirizado1 = new Terceirizado(12345, "juliana");
        var terceirizado2 = new Terceirizado(12345754, "Valdimar");
        var aluno2 = new Aluno(234567, "Matheus", "TSI");

        filaRefeitorio.add(aluno1);
        filaRefeitorio.add(professor1);
        filaRefeitorio.add(terceirizado1);
        filaRefeitorio.add(terceirizado2);

        removeNaFila(filaRefeitorio);
        adicionaNaFila(filaRefeitorio, aluno2);

        filaRefeitorio.forEach(System.out::println);

    }

    public static void removeNaFila(LinkedList<Object> fila){
        fila.removeFirst();
    }

    public static void adicionaNaFila(LinkedList<Object> fila, Object o){
        fila.add(o);
    }
}