import java.util.Scanner;

class Aplicacao
{
    public static void main(String args[]){
        int opcao = 0, opcao2 =0;
        int i, qtdisc;
        String aDisc, bDisc, cDisc;
        
        Interface ent = new EntradaGui();
        Cadastro cadAluno = new Cadastro();
        Disciplinas cadDisc = new Disciplinas();
        Scanner scan = new Scanner(System.in);

        while(opcao != 4){
            System.out.println("Portal do aluno");
            System.out.println("1 - Inserir cadastro ");
            System.out.println("2 - Deletar de cadastro");
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
                
                
                do{
                    opcao2 = 0;
                    System.out.println("1 - Inserir Disciplina ");
                    System.out.println("2 - Parar cadastro ");
                    opcao2 = scan.nextInt();
                    if(opcao2 == 1){
                        aDisc = ent.lerDisciplina();
                        bDisc = ent.lerProfessor();
                        cDisc = ent.lerSigla();
                 
                        Disciplina disc = new Disciplina(aDisc, bDisc, cDisc);
                        cadDisc.arm.inserir(disc);
                    }
                }while(opcao2 != 2);
                
                break;

                case 2:
                System.out.println("1 - Deletar Aluno ");
                System.out.println("2 - Deletar Disciplina ");
                opcao2 = scan.nextInt();
                if(opcao2 == 1){
                    cadAluno.deletar(ent.lerRa());
                }else if(opcao2 == 2){
                    cadDisc.deletar(ent.lerSigla());
                }
                //ra = scan.nextLine();
                //cadAluno.arm.deletar(ra);
                break;
                
                case 3:
                
                //cadAluno.mostrar();
                break;
            }
        }
    }
}