import java.util.Scanner;

class Aplicacao
{
    public static void main(String args[]){
        int opcao = 0, del;
        Cadastro cadAluno = new Cadastro(5);
        Aluno a = new Aluno();
        Interface ent = new EntradaGui();
        Scanner scan = new Scanner( System.in );

        while(opcao != 4){
            System.out.println("Portal do aluno");
            System.out.println("1 - Inserir novo cadastro ");
            System.out.println("2 - Deletar cadastro");
            System.out.println("3 - Mostrar cadastro");
            System.out.println("4 - Sair");

            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                a.setNome(ent.lerNome());
                a.setIdade(ent.lerIdade());
                a.setId(ent.lerRg());
                a.setRa(ent.lerRa());
                a.setSemestre(ent.lerSemestre());
                cadAluno.inserir(a);
                break;

                case 2:
                System.out.println("Qual o numero do cadastrado voce deseja deletar: ");
                del = scan.nextInt();
                cadAluno.deletar(a, del);
                break;
                
                case 3:
                cadAluno.mostrar();
                break;
            }
        }
    }
}