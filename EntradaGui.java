
import javax.swing.JOptionPane;

public class EntradaGui implements Interface
{
    public int qtdAluno(){
        int qtdAluno = JOptionPane.showInputDialog("Insira a quantidade de alunos ");
        return qtdAluno;
    }
    
    public String lerNome(){
        String nome = JOptionPane.showInputDialog("Insira o nome ");
        return nome;
    }

    public int lerIdade(){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
        return idade;
    }

    public String lerRg(){
    String rg = JOptionPane.showInputDialog("Insira o rg");
      return rg;
    }

    public String lerRa(){
     String ra = JOptionPane.showInputDialog("Insira o ra");
     return ra;
    }

    public int lerSemestre(){
     int semestre = Integer.parseInt(JOptionPane.showInputDialog("Insira o semestre"));
     return semestre;
    }
}