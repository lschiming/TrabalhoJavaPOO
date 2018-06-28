package fatec.poo.model;


public class AVista {
    private double valor;
    private int agencia, nCheque;
    private String preData;
    private Matricula matricula;

    public AVista(Matricula matricula) {
        this.matricula = matricula;
    }
   
    public Matricula getMatricula() {
        return matricula;
    }

    public double getValor() {
        return valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getnCheque() {
        return nCheque;
    }

    public String getPreData() {
        return preData;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setnCheque(int nCheque) {
        this.nCheque = nCheque;
    }

    public void setPreData(String preData) {
        this.preData = preData;
    }
    
    
}
