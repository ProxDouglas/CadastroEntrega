public class Cadastro
    {
        //private Aluno cad[];
        //private int tamanho;
        //private int contador;
        private int n;
        public IArmazenador arm;
        public Cadastro(){
           // n = tam;
            arm = new VetDin();
        }
        public void inserir(Aluno a){
         
            arm.inserir(a);
          
        }
        
        public void deletar(String ra){
         
            arm.deletar(ra);
          
        }
        
        public void mostrar(){
         
            arm.mostrar();
          
        }
        
        //VetDin vet = new VetDin(n);
        /*
        public Cadastro(int tam){
            n = tam;
            arm = new VetDin(n);
        }
        public void cadastrarNome(String nome){
                arm.a.setNome(nome);
        }
        public void cadastrarIdade(int idade){
                arm.a.setIdade(idade);
        }
        public void cadastrarRg(String rg){
                arm.a.setId(rg);
        }
        public void cadastrarRa(String ra){
                arm.a.setRa(ra);
        }
        public void cadastrarSemestre(int semestre){
                arm.a.setSemestre(semestre);
        }
        /*public Cadastro(int tam){
            cad = new Aluno[tam];
            tamanho = tam;
            contador = 0;
            for(int i = 0; i < tam; i++){
                if(cad[i] != null){
                    cad[i] = null;
                }
            }
            
         }
        */
        /*public void inserir(Aluno a){
            int aux = contador;
            cad[aux] = a;
            contador++;
        }
    
        public void inserir(Aluno a){
            int aux = contador + 1;
            if(contador < tamanho){
             for(int i = 0; i < aux; i++){ 
               if(cad[i] == null ){
                    cad[i] = a;
                    contador++;
               }
            //System.err.println("AQUI"+cad[i].getId()+ "|" + a.getId());
                if(cad[0] != null){
                    if(cad[i].getRa().equals(a.getRa()) && i<=contador){
                        i = aux+1;
                    }else
                    if(cad[i].getId().equals(a.getId()) && i<=contador){
                        i = aux+1;
                    }
                }
            
        }
        }else{
              System.out.println("Lista cheia\n");
        }
        
    }
    
    public void deletar(String  ra){
        int k = 0, j;
        System.out.println("RA: "+ ra);
        //System.out.println("RA: "+ cad[k].getRa());
        do{
            if(ra.equals(cad[k].getRa())){
                for(j = k; j < tamanho-1; j++){
                    cad[j] = cad[j+1];
                }
                if(j == tamanho-1){
                    cad[j] = null;
                }
                contador--;
                k = contador+1;
            }
             k++;
        }while(k < contador);
    }*/
    
    
    /*
    public void mostrar(){
        
        if(contador > 0){
            for(int i = 0; i < contador; i++){
                System.out.println("Nome: "+ cad[i].getNome() + "\n");
                System.out.println("Idade: "+ cad[i].getIdade() + "\n");
                System.out.println("RG: "+ cad[i].getId() + "\n");
                System.out.println("RA: "+ cad[i].getRa() + "\n");
                System.out.println("Semestre: "+ cad[i].getSemestre() + "\n");
            }
        }
        else{
            System.out.println("Nenhum contato cadastrado!\n");
        }
    }
    */

    
    
}