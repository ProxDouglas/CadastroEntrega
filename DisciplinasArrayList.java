public class DisciplinasArrayList
    {
        public Lista arm;
        public DisciplinasArrayList(){
           // n = tam;
           this.arm = new Lista();
        }
        
        public boolean inserir(Object obj){
            boolean inserido = true;
            Disciplina disc = (Disciplina) obj;
            int verif = buscar(disc.getSigla());
            if(verif == -1){
                this.arm.inserir(obj);
                inserido = true;
            }
            return inserido ;
        }
        
        public boolean deletar(String sigla){
            boolean deletar = false;
            int indice ;
             indice = buscar(sigla);
             if(indice >= 0 && arm.getTamanho() > 0){
              arm.deletar(indice);
              deletar = true;
          }
          return deletar;
        }
        
       
       
       public  int buscar(String sigla) {
          int indice = -1; 
          int i = 0;
          boolean verif;
          Object obj[] = arm.getLista().toArray();
          verif = arm.getLista().isEmpty();
          
          if(obj != null && !verif ){
            Disciplina disc = (Disciplina) obj[0];
            while(!disc.getSigla().equals(sigla) && i < obj.length){
                disc = (Disciplina) obj[i];
                i++;
            }
            if (disc.getSigla().equals(sigla)){
                indice = i;
            }
          }
          return indice;
       }
       
       
       
        public void mostrar(){
        Object obj[] = arm.getLista().toArray();
        int contador = obj.length;
        if(contador > 0){
            System.out.println("\n---------------------------------\n");
            for(int i = 0; i < contador; i++){
                
                Disciplina b = (Disciplina) obj[i];
                //System.out.println("Quantidade de Disciplinas: "+ b.getDisc().length + "\n");

                System.out.println("Disciplina: "+ b.getDisciplina() + "\n");
                System.out.println("Professor: "+ b.getProf() + "\n");
                //System.out.println("Nota: "+ b.getNota() + "\n");
                System.out.println("Sigla: "+ b.getSigla() + "\n");
                System.out.println("\n---------------------------------\n");
                
            }
        }else{
              System.out.println("Nenhum contato cadastrado!\n");
            }
        }
       
    }  
    
    
    
    /*public  int buscar(String sigla) {
          int indice = arm.getLista().indexOf(sigla);
          return indice;
       }*/
    
        
