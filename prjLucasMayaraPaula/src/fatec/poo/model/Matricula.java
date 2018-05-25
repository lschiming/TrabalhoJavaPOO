package fatec.poo.model;

public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    //emitirCarne como assim nao eh pra implementar???;
}
