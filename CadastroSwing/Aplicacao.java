import java.util.Scanner;
import javax.swing.JFrame;

class Aplicacao
{
    public static void main(String args[]){
        int opcao = 0, opcao2 =0, escolha = 0;
        int i, qtdisc;
        String aDisc, bDisc, cDisc;
        Interface ent = new EntradaGui();
        Scanner scan = new Scanner(System.in);
        
        /*
         *      A troca de cadAluno por cadAlunoArrayList faz 
         *  a troca de utilização do VetDin para o tipo Lista
         *  que eh o arrayList
         */
        
        //Cadastro cadAluno = new Cadastro();
        //Disciplinas cadDisc = new Disciplinas();
        CadastroArrayList cadAluno = new CadastroArrayList();
        DisciplinasArrayList cadDisc = new DisciplinasArrayList();

        while(opcao != 4){
            System.out.println("Portal do aluno");
            System.out.println("1 - Inserir cadastro ");
            System.out.println("2 - Deletar de cadastro");
            System.out.println("3 - Mostrar cadastro");
            System.out.println("4 - Sair");
            
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                System.out.println("1 - Cadastro Aluno  ");
                System.out.println("2 - Cadastrar Disciplina\n");
                opcao2 = scan.nextInt();
                
                if(opcao2 == 1){
                    //do{
                        //do{
                        MenuSwingAluno menu = new MenuSwingAluno("Cadastro Aluno");
                        menu.setVisible(true);
                        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        do{
                        if(menu.getClosed() == true ){
                            Aluno a = new Aluno(menu.getNome());
                        
                            a.setIdade(menu.getIdade());
                            a.setId(menu.getRg());
                            a.setRa(menu.getRa());
                            a.setSemestre(menu.getSemestre());
                            cadAluno.inserir(a);
                        }
                    }while(menu.getClosed() == false && menu.getSair() == false);
                       //}while(idade == 0);
                        //System.out.println("1 - Inserir Aluno ");
                        //System.out.println("2 - Parar cadastro \n");
                        //escolha = scan.nextInt();
                    //}while(escolha != 2);
                    //escolha = 0;
                }
                
                if(opcao2 == 2){
                    //do{
                        MenuSwingDisc menu = new MenuSwingDisc("Cadastro Disciplina");
                        menu.setVisible(true);
                        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        do{
                            aDisc = menu.getDisc();
                            bDisc = menu.getProf();
                            cDisc = menu.getSigla();
                            if(menu.getClosed() == true){
                                Disciplina disc = new Disciplina(aDisc, bDisc, cDisc);
                                cadDisc.inserir(disc);
                            }
                        }while(menu.getClosed() == false && menu.getSair() == false);
                        //System.out.println("1 - Inserir Disciplina ");
                        //System.out.println("2 - Parar cadastro ");
                        //escolha = ent.lerInt();
                        //}while(escolha != 2);
                        //escolha = 0;
                }
                
                
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
                System.out.println("1 - Mostrar Aluno ");
                System.out.println("2 - Mostrar Disciplina ");
                
                opcao2 = scan.nextInt();
                if(opcao2 == 1){
                   cadAluno.mostrar();
                    
                }else if(opcao2 == 2)
                   cadDisc.mostrar();
                
                break;
            }
        }
    }
}