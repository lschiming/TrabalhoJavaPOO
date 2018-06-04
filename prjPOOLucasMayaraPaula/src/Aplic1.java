import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;

public class Aplic1 {

    public static void main(String[] args) {
        
        //INSTRUTOR
        Instrutor instrutor01 = new Instrutor("Marcelo Neves", "32514187569");
        instrutor01.setAreaAtuacao("Automação Industrial");
        instrutor01.setFormacao("Engenharia Mecanica");
        instrutor01.setDataNasc("16/03/1984");
        instrutor01.setEndereco("Constatino Soares");
        instrutor01.setNumero(365);
        instrutor01.setBairro("Centro");
        instrutor01.setCidade("Sorocaba");
        instrutor01.setEstado("São Paulo");
        instrutor01.setCEP("15078-060");
        instrutor01.setTelefone("3223-9999");
        instrutor01.setCelular("99758-6379");
        instrutor01.setSexo("Masculino");
        instrutor01.setEstadoCivil("Casado");
        instrutor01.setRG("789753663");
        instrutor01.setEmail("marcelo_neves10@global.com");
        

        //MATRICULA
        Matricula matricula01 = new Matricula("17/05/2018");
        matricula01.setNota(5);
        matricula01.setQtdeFaltas(10);
        
        Matricula matricula02 = new Matricula("10/01/2018"); 
        matricula02.setNota(10);
        matricula02.setQtdeFaltas(4);
        
        //ALUNOS
        Aluno aluno01 = new Aluno("Fernanda Melo", "32747187569");
        aluno01.setEscolaridade("Terceiro Grau Completo");
        aluno01.setDataNasc("30/03/1995");
        aluno01.setEndereco("Eliza Costa");
        aluno01.setNumero(100);
        aluno01.setBairro("Parque Esmeralda");
        aluno01.setCidade("Sorocaba");
        aluno01.setEstado("São Paulo");
        aluno01.setCEP("15111-060");
        aluno01.setTelefone("3223-9352");
        aluno01.setCelular("98758-5079");
        aluno01.setSexo("Feminino");
        aluno01.setEstadoCivil("Solteira");
        aluno01.setRG("7897540514");
        aluno01.setEmail("fernanda.mel@gmail.com");
        aluno01.setMatricula(matricula01); 
        
        
        Aluno aluno02 = new Aluno("Tereza Batista", "45010125399");
        aluno02.setEscolaridade("Ensino Superior Completo");
        aluno02.setDataNasc("29/07/1989");
        aluno02.setEndereco("Florindo Lopes de Almeida");
        aluno02.setNumero(053);
        aluno02.setBairro("Parque Manchester");
        aluno02.setCidade("Sorocaba");
        aluno02.setEstado("São Paulo");
        aluno02.setCEP("15987-050");
        aluno02.setTelefone("3333-9340");
        aluno02.setCelular("98888-5079");
        aluno02.setSexo("Feminino");
        aluno02.setEstadoCivil("Casada");
        aluno02.setRG("7897548752");
        aluno02.setEmail("tereza.batista@outlook.com");   
        aluno02.setMatricula(matricula02);      
        
        

        //TURMA
        Turma turma01 = new Turma("AUT-N1801","Aut. Ind. Noturno 01/2018");
        Turma turma02 = new Turma("AUT-N1801","Aut. Ind. Noturno 01/2018");
        
        //CURSO
        Curso curso01 = new Curso("AUT", "Automação Industrial");
        curso01.setCargaHoraria(120);
        curso01.setValor(450.99);
        curso01.setDataVigencia("05/06/2018");
        curso01.setValorHoraInstrutor(30.00);
        curso01.setPrograma("");
        
        Curso curso02 = new Curso("LOG", "Logistica");
        curso01.setCargaHoraria(230);
        curso01.setValor(600.00);
        curso01.setDataVigencia("11/11/2018");
        curso01.setValorHoraInstrutor(35.00);
        curso01.setPrograma("");
        
        
        curso01.addTurma(turma01);
        instrutor01.addTurma(turma01);
        
        curso02.addTurma(turma02);
        instrutor01.addTurma(turma02);

//        curso01.listar();
        
    }
    
}
