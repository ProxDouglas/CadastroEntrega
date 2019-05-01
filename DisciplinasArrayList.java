public class DisciplinasArrayList
    {
        public Lista arm;
        public DisciplinasArrayList(){
           // n = tam;
           this.arm = new Lista();
        }
        
        public void inserir(Object obj){
            this.arm.inserir(obj);
            //this.arm.inserir(obj);
        }
        
        public void deletar(String sigla){
            int indice ;
             indice = buscar(sigla);
             if(indice >= 0){
              arm.getLista().remove(indice);
          }
        }
        
        /*
         *  Existem dois metodos possiveis de busca abaixo um 
         *  que usa a função de busca da biblioteca e outro que 
         *  eh a propria função de busca.
         */
        
        
       public  int buscar(String sigla) {
          int indice = -1;
          indice = arm.getLista().indexOf(sigla);
          return indice;
       }
       
       /*public  int buscar(String sigla) {
          int indice = -1; 
          int i = 0;
          Object obj[] = arm.getLista().toArray();
          
          Disciplina disc = (Disciplina) obj[0];
          if(obj != null){
            while(!disc.getSigla().equals(sigla) && i < obj.length){
                disc = (Disciplina) obj[i+1];
                i++;
            }
            if (disc.getSigla().equals(sigla)){
                indice = i;
            }
          }
          return indice;
       }*/
       
       
       
        public void mostrar(){
        int j =0, contador=0;
        Object obj[] = arm.getLista().toArray();
        contador = obj.length;
        if(contador > 0){
            for(int i = 0; i < contador; i++){
                
                Disciplina b = (Disciplina) obj[i];
                //System.out.println("Quantidade de Disciplinas: "+ b.getDisc().length + "\n");

                System.out.println("Disciplina: "+ b.getDisciplina() + "\n");
                System.out.println("Professor: "+ b.getProf() + "\n");
                //System.out.println("Nota: "+ b.getNota() + "\n");
                System.out.println("Sigla: "+ b.getSigla() + "\n");
                System.out.println("\n---------------------------------\n");
                j++;
            }
        }else{
              System.out.println("Nenhum contato cadastrado!\n");
            }
        }
       
    }       
       
       /*public void mostrar(Object[] obj){
        int j =0;
        int contador = obj.length;
        if(contador > 0){
            for(int i = 0; i < contador; i++){
                
                Disciplina b = (Disciplina) obj[i];
                //System.out.println("Quantidade de Disciplinas: "+ b.getDisc().length + "\n");

                System.out.println("Disciplina: "+ b.getDisciplina() + "\n");
                System.out.println("Professor: "+ b.getProf() + "\n");
                //System.out.println("Nota: "+ b.getNota() + "\n");
                System.out.println("Sigla: "+ b.getSigla() + "\n");
                System.out.println("\n---------------------------------\n");
                j++;
            }
        }else{
              System.out.println("Nenhum contato cadastrado!\n");
            }
        }*/
    
        
        
