    public class Cadastro
    {
      public IArmazenador arm;
      
        
        //VetDin
        public Cadastro(){
           // n = tam;
           this.arm = new VetDin();
        }
        
        public void inserir(Object obj){
            //this.list.inserir((Lista)obj);//ArrayList
            this.arm.inserir(obj);//VetDin
          
        }
        //VetDin
        public void deletar(String ra){
            int indice;
            
            indice = buscar(ra);
            if(indice >= 0){
                this.arm.deletar(indice);//VetDin
             }
        }
        //VetDin
        public  int buscar(String ra) {
          int indice = -1;
          int i = 0;
          //Object obj[] = list.getLista().toArray();//para ArrayList
          Object obj[] = ((VetDin)this.arm).getCad();//VetDin
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
       
       /*public void mostrar(Object[] obj){
        int j =0;
        int contador = obj.length;
        if(obj.length != 0){
            for(int i = 0; i < contador; i++){
                Aluno a = (Aluno) obj[i];
                System.out.println("Nome: "+ a.getNome() + "\n");
                System.out.println("Idade: "+ a.getIdade() + "\n");
                System.out.println("RG: "+ a.getId() + "\n");
                System.out.println("RA: "+ a.getRa() + "\n");
                System.out.println("Semestre: "+ a.getSemestre() + "\n");
                
            }
        }
    }*/
}