import java.util.Scanner;

public class EntradaConsole implements Interface
{
    Scanner scan = new Scanner( System.in );
    
    public String lerNome(){
        System.out.println("Insira o nome ");
        String nome = scan.next();
        return nome;
    }

    public int lerIdade(){
        System.out.println("Insira a idade ");
        int idade = scan.nextInt();
        return idade;
    }

    public String lerRg(){
        System.out.println("Insira o Rg ");
        String rg = scan.nextLine();
        rg = scan.nextLine();
        return rg;
    }

    public String lerRa(){
        System.out.println("Insira o Ra ");
        String ra = scan.nextLine();
        return ra;
    }

    public int lerSemestre(){
        System.out.println("Insira o Semestre ");
        int semestre = scan.nextInt();
        return semestre;
     }
     
    public int lerQTDisciplinas(){
        System.out.println("Insira o quantas disciplinas ");
        int qtd = scan.nextInt();
        return qtd;
    }
    
    public String lerDisciplinas(){
        System.out.println("Insira a Disciplina ");
        String disc = scan.nextLine();
        return disc;
    }
    
    public String lerProfessor(){
        System.out.println("Insira o Professor ");
        String prof = scan.nextLine();
        return prof;
    }
    
    public int lerNota(){
        System.out.println("Insira a nota");
        int nota = scan.nextInt();
        return nota;
    }
}
