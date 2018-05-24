package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Instrutor extends Pessoa {

    private String formacao, areaAtuacao;
    private ArrayList<Turma> turmas;

    public Instrutor(String nome, String cpf) {
        super(cpf, nome);
        turmas = new ArrayList<Turma>();
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void addTurmas(Turma t) {
        turmas.add(t);
        t.setInstrutor(this);
    }
    

}
