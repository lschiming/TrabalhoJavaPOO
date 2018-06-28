
package fatec.poo.model;

public class APrazo {
    private int qtdeMensalidade;
    private double valor, taxaJuros;
    private String dataVencimento;
    private Matricula matricula;

    public APrazo(Matricula matricula) {
        this.matricula = matricula;
    }

    public Matricula getMatricula() {
        return matricula;
    }
    

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    
    
}
