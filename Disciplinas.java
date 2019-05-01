public class Disciplinas
    {
        private int n;
        public IArmazenador arm;
        public Lista list;
        public Disciplinas(){
           // n = tam;
           this.arm = new VetDin();
        }
        public void inserir(Object obj){
            this.list.inserir(obj);
            //this.arm.inserir(obj);
        }
        
        public void deletar(String sigla){
            int indice ;
            /*indice = buscar(sigla);
            if(indice >= 0){
              this.arm.deletar(indice);
             }*/
             indice = buscarArrayList(sigla);
             if(indice >= 0){
              list.getLista().remove(indice);
          }
        }
        
        public  int buscar(String sigla) {
          int indice = -1; 
          int i = 0;
          //Object obj[] = list.getLista().toArray();
          Object obj[] = ((VetDin)this.arm).getCad();
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
       }
       
       
       public  int buscarArrayList(String sigla) {
          int indice = -1;
          Object obj = (Lista)list.getLista().clone();//((Lista)this.arm).getTamanho();
          indice = list.getLista().indexOf(sigla);
          
          return indice;
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
    
        
        
