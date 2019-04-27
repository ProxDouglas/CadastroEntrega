public class Disciplinas
    {
        private int n;
        public IArmazenador arm;
        public Disciplinas(){
           // n = tam;
           this.arm = new VetDin();
        }
        public void inserir(Object obj){
         
            this.arm.inserir(obj);
          
        }
        
        public void deletar(String sigla){
            int indice = buscar(sigla);
            if(indice >= 0){
              this.arm.deletar(indice);
             }
        }
        
        public  int buscar(String sigla) {
          int indice = -1;
          int i = 0;
          //Object obj[] = ((Lista)this.armazen).getTamanho();
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
        
        /*public  int buscar(String sigla) {
            int indice = -1;
            //Object obj[] = ((Lista)this.armazen).getTamanho();
            Object obj[] = ((VetDin)this.arm).getCad();
            if(obj != null){
            for (int i = 0; i < obj.length; i++){
                Disciplina disc = (Disciplina) obj[i];
                if (disc.getSigla().equals(sigla)){
                    indice = i;
                    break;
                }
            } 
          }
          return indice;
       }*/
    }