
import javax.swing.JOptionPane;

public class EntradaGui implements Interface
{
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
    
    public int lerQTDisciplinas(){
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Insira quantas disciplinas"));
        return tam;
    }
    
    public String lerDisciplinas(){
        String disc = JOptionPane.showInputDialog("Insira a Disciplina");
        return disc;
    }
    
    public String lerProfessor(){
        String prof = JOptionPane.showInputDialog("Insira o Professor");
        return prof;
    }
    
    public int lerNota(){
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Insira quantas disciplinas"));
        return nota;
    }
    
    
}