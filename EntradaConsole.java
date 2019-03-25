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
}
