public class Turma {
    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        this.alunos = new Aluno[10];
    }

    public void aprovados(){
        for (int i = 0; i < 10; i++){
            double media = alunos[i].calcularMedia();
            System.out.println("O aluno "+(i+1) + " está aprovado? " + alunos[i].estaAprovado(media));
        }
    }
}
