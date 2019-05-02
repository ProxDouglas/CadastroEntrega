
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
        
        public void inserir(Aluno obj){
            this.arm.inserir(obj);
            
        }
        
        public void deletar(String ra){
            int indice ;
             indice = buscar(ra);
             if(indice >= 0 && arm.getTamanho() > 0){
              arm.deletar(indice);
          }
        }
        

       public  int buscar(String ra) {
          int indice = -1;
          if(arm.getTamanho() > 0){
              int i = 0;
              Object obj[] = arm.getLista().toArray();//para ArrayList
              //Object obj[] = ((VetDin)this.arm).getCad();//VetDin
              Aluno a = (Aluno) obj[0];
              if(obj != null){
                  while(!a.getRa().equals(ra) && i < obj.length){
                      a = (Aluno) obj[i+1];
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
