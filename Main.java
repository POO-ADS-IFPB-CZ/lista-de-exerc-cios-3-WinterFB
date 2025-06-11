import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double notas[] = new double[4];
        System.out.println("Informe a primeira nota: ");
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();
        Aluno aluno = new Aluno("João", "1111-1", notas);
        aluno.cadastrarNotas(nota,0);

        System.out.println("Informe a segunda nota: ");
        nota = scanner.nextDouble();
        aluno.cadastrarNotas(nota,1);

        System.out.println("Informe a terceira nota: ");
        nota = scanner.nextDouble();
        aluno.cadastrarNotas(nota,2);

        System.out.println("Informe a quarta nota: ");
        nota = scanner.nextDouble();
        aluno.cadastrarNotas(nota,3);

        double media = aluno.calcularMedia();
        System.out.println("Média: " + media);
        System.out.println("Está aprovado? " + aluno.estaAprovado(media));
    }
}
