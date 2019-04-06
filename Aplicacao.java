import java.util.Scanner;

class Aplicacao
{
    public static void main(String args[]){
        int opcao = 0;
        int i, qtdisc;
        
        Interface ent = new EntradaGui();
        Cadastro cadAluno = new Cadastro();
        Scanner scan = new Scanner(System.in);

        while(opcao != 4){
            System.out.println("Portal do aluno");
            System.out.println("1 - Inserir cadastro ");
            System.out.println("2 - Deletar cadastro");
            System.out.println("3 - Mostrar cadastro");
            System.out.println("4 - Sair");
            
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                Aluno a = new Aluno(ent.lerNome());
                
                a.setIdade(ent.lerIdade());
                a.setId(ent.lerRg());
                a.setRa(ent.lerRa());
                a.setSemestre(ent.lerSemestre());
                cadAluno.arm.inserir(a);
                qtdisc = ent.lerQTDisciplinas();
                a.setDiscVet(qtdisc);
                i = 0;
                 while(i<qtdisc){
                     Disciplinas d = new Disciplinas(ent.lerDisciplinas(), ent.lerProfessor());
                     a.setDisc(d, i);
                     i++;
                 }  
                 
                
                break;

                case 2:
                String ra;
                System.out.println("Qual o RA do cadastrado voce deseja deletar: ");
                ra = scan.next();
                //ra = scan.nextLine();
                cadAluno.arm.deletar(ra);
                break;
                
                case 3:
                
                cadAluno.mostrar();
                break;
            }
        }
    }
}