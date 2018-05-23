
package fatec.poo.model;

import java.util.ArrayList;

public class Turma {
    private String siglaTurma, descricao, dataInicio, dataTermino, periodo, observacoes;
    private int qtdVagas;
    private Curso curso;
    private Instrutor instrutor;
    private ArrayList<Matricula> matriculas;

    public Turma(String siglaTurma, String descricao) {
        this.siglaTurma = siglaTurma;
        this.descricao = descricao;
        this.matriculas = new ArrayList<>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setSiglaTurma(String siglaTurma) {
        this.siglaTurma = siglaTurma;
    }
    
    public void addMatricula(Matricula m) {
        matriculas.add(m);
        m.setTurma(this);
    }
}
