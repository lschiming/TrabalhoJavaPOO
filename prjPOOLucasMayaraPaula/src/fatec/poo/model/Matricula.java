package fatec.poo.model;

public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;
    private Aluno aluno;
    private Turma turma;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public String getData() {
        return data;
    }

    public int getQtdeFaltas() {
        return qtdeFaltas;
    }

    public double getNota() {
        return nota;
    }

    public Aluno getAluno() {
        return aluno;
    }
    
    public Turma getTurma() {
        return turma;
    }
}
