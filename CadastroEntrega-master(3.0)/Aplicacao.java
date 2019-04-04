import java.util.Scanner;

class Aplicacao
{
    public static void main(String args[]){
        int opcao = 0;
        Cadastro cadAluno = new Cadastro();
        Interface ent = new EntradaConsole();
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
                //Aluno a = new Aluno(ent.lerNome());
                //a.setNome(ent.lerNome());
                cadAluno.arm.a.setNome(ent.lerNome());
                cadAluno.arm.a.setIdade(ent.lerIdade());
                cadAluno.arm.a.setId(ent.lerRg());
                cadAluno.arm.a.setRa(ent.lerRa());
                cadAluno.arm.a.setSemestre(ent.lerSemestre());
                cadAluno.arm.inserir(cadAluno.arm.a);
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