package fatec.poo.model;

import java.util.ArrayList;

public class Curso {

    private String sigla, nome, dataVigencia, programa;
    private int cargaHoraria;
    private double valor, valorHoraInstrutor;
    private ArrayList<Turma> turmas;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    public void setDataVigencia(String dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValorHoraInstrutor(double valorHoraInstrutor) {
        this.valorHoraInstrutor = valorHoraInstrutor;
    }

    public void addTurma(Turma t) {
        turmas.add(t);
        t.setCurso(this);
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getDataVigencia() {
        return dataVigencia;
    }

    public String getPrograma() {
        return programa;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public double getValorHoraInstrutor() {
        return valorHoraInstrutor;
    }

}
