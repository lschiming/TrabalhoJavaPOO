
package fatec.poo.model;

public class APrazo {
    
    private double valor, taxaJuros;
    private String dataVencimento;
    private int qtdeMensalidade;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTaxaJuros(double taxaJuros) {
        if(taxaJuros < 1)
            this.taxaJuros = taxaJuros;
        else
            this.taxaJuros = taxaJuros/100;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }
    
}
