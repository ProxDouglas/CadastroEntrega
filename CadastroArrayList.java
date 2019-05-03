
/**
 * Escreva a descrição da classe CadastroArrayList aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CadastroArrayList
{
        public Lista arm;
        
        public CadastroArrayList(){
           this.arm = new Lista();
           arm.getLista().clear();
        }
        
        public boolean inserir(Aluno obj){
            boolean inserido = true;
            Aluno a = (Aluno) obj;
            int verif = buscar(a.getRa());
            if(verif == -1){
                this.arm.inserir(obj);
                inserido = false;
            }
            return inserido;
        }
        
        public boolean deletar(String ra){
            boolean deletar = false;
            int indice ;
             indice = buscar(ra);
             if(indice >= 0 && arm.getTamanho() > 0){
              arm.deletar(indice);
              deletar = false;
          }
          return deletar ;
        }
        

       public  int buscar(String ra) {
          int indice = -1;
          if(arm.getTamanho() > 0){
              int i = 0;
              boolean verif;
              Object obj[] = arm.getLista().toArray();//para ArrayList
              verif = arm.getLista().isEmpty();
              
              if(obj != null && !verif){
                  Aluno a = (Aluno) obj[0];
                  while(!a.getRa().equals(ra) && i < obj.length){
                      a = (Aluno) obj[i];
                      i++;
                    }
                    if (a.getRa().equals(ra)){
                        indice = i;
                    }
              }
          }
          return indice;
       }
       
       
       public void mostrar(){
        Object obj[] = arm.getLista().toArray();
        int contador = obj.length;
        if(obj.length != 0){
            System.out.println("\n---------------------------------\n");
            for(int i = 0; i < contador; i++){
                Aluno a = (Aluno) obj[i];
                System.out.println("Nome: "+ a.getNome() + "\n");
                System.out.println("Idade: "+ a.getIdade() + "\n");
                System.out.println("RG: "+ a.getId() + "\n");
                System.out.println("RA: "+ a.getRa() + "\n");
                System.out.println("Semestre: "+ a.getSemestre() + "\n");
                System.out.println("\n---------------------------------\n");
                
            }
        }
       }
}




/* public  int buscar(String ra) {
          int indice = -1;
          indice = arm.getLista().indexOf(ra);
          return indice;
       }*/
