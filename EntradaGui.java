
import javax.swing.JOptionPane;

public class EntradaGui implements Interface
{
    public String lerNome(){
        String nome = JOptionPane.showInputDialog("Insira o nome ");
        return nome;
    }

   public int lerIdade(){
        int idade = 0;
        boolean excep = false;
         do{
            try{
                idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
                excep = true;
            }catch(NumberFormatException e){
                System.out.println("Caractere invalido\n");
                System.out.println("Tente novamente: ");
                excep = false;
            }
        }while(excep != true);
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
        int semestre = 0;
        boolean excep = false;
         do{
            try{
                semestre = Integer.parseInt(JOptionPane.showInputDialog("Insira o semestre"));
                excep = true;
            }catch(NumberFormatException e){
                System.out.println("\nCaractere invalido\n");
                System.out.println("Tente novamente: \n");
                excep = false;
            }
        }while(excep != true);
        return semestre;
        
    }

    public int lerQTDisciplinas(){
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Insira quantas disciplinas"));
        return tam;
    }

    public String lerDisciplina(){
        String disc = JOptionPane.showInputDialog("Insira a Disciplina");
        return disc;
    }

    public String lerProfessor(){
        String prof = JOptionPane.showInputDialog("Insira o Professor");
        return prof;
    }

    public int lerNota(){
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota"));
        return nota;
    }
    
    public String lerSigla(){
        String sigla = JOptionPane.showInputDialog("Insira a Sigla");
        return sigla;
    }

}