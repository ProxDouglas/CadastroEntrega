import java.util.Scanner;

class Aplicacao
{
    public static void main(String args[]){
        int opcao = 0;
        int n = 0;
        Interface ent = new EntradaGui();
        Scanner scan = new Scanner(System.in);

        while(opcao != 4){
            System.out.println("Portal do aluno");
            System.out.println("1 - Inserir cadastro ");
            System.out.println("2 - Deletar cadastro");
            System.out.println("3 - Mostrar cadastro");
            System.out.println("4 - Sair");
            Cadastro cadAluno = new Cadastro(n);
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                //Aluno a = new Aluno(ent.lerNome());
                //a.setNome(ent.lerNome());
                cadAluno.cadastrarNome(ent.lerNome());
                cadAluno.cadastrarIdade(ent.lerIdade());
                cadAluno.cadastrarRg(ent.lerRg());
                cadAluno.cadastrarRa(ent.lerRa());
                cadAluno.cadastrarSemestre(ent.lerSemestre());
                cadAluno.arm.inserir(cadAluno.arm.a);
                n++;
                break;

                case 2:
                String ra;
                System.out.println("Qual o RA do cadastrado voce deseja deletar: ");
                ra = scan.next();
                //ra = scan.nextLine();
                cadAluno.arm.deletar(ra);
                break;
                
                case 3:
                cadAluno.arm.mostrar();
                break;
            }
        }
    }
}