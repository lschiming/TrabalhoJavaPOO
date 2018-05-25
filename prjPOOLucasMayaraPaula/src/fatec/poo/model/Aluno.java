package fatec.poo.model;

public class Aluno extends Pessoa {

    private String escolaridade;
    private Matricula matricula;

    public Aluno(String nome, String cpf) {
        super(cpf, nome);
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }



}
