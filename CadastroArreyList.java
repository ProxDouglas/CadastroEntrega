
/**
 * Escreva a descrição da classe CadastroArreyList aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CadastroArreyList
{
        public Lista arm;
        public CadastroArreyList(){
           this.arm = new Lista();
        }
        
        public void inserir(Object obj){
            this.arm.inserir(obj);
            
        }
        
        public void deletar(String ra){
            int indice ;
             indice = buscar(ra);
             if(indice >= 0){
              arm.getLista().remove(indice);
          }
        }
        
        /*
         *  Existem dois metodos possiveis de busca abaixo um 
         *  que usa a função de busca da biblioteca e outro que 
         *  eh a propria função de busca.
         */
        
        
       /* public  int buscar(String ra) {
          int indice = -1;
          indice = arm.getLista().indexOf(ra);
          return indice;
       }*/
       
       public  int buscar(String ra) {
          int indice = -1;
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
          return indice;
       }
}
