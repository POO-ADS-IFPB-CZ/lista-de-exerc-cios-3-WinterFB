import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public boolean cadastrarNotas(double nota, int avaliacao){
        if(avaliacao < 4){
            if(nota <= 10) notas[avaliacao] = nota;
        }
        return true;
    }

    public double calcularMedia(){
        double total = 0;
        for(int i = 0; i<4; i++){
            total = total+notas[i];
        }
        return total/4;
    }

    public boolean estaAprovado(double media){
        if(media > 7.0){
            return true;
        } else return false;
    }
}


