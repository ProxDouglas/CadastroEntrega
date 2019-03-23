
public class Cadastro
{
    private Aluno cad[];
    private int tamanho;
    private int contador;
    
    public Cadastro(int tam){
        cad = new Aluno[tam];
        tamanho = tam;
        contador = 0;
        for(int i = 0; i < tam; i++){
            if(cad[i] != null){
                cad[i] = null;
            }
        }
        
     }
    
    /*public void inserir(Aluno a){
        int aux = contador;
        cad[aux] = a;
        contador++;
    }*/

    public void inserir(Aluno a){
     int aux = contador + 1;
         for(int i = 0; i < aux; i++){
            if(cad[i] == null){
                cad[i] = a;
                contador++;
            }
        }
        
    }
    
    public void deletar(String  ra){
        int k = 1;
        System.out.println("RA: "+ ra);
        System.out.println("RA: "+ cad[k-1].getRa());
        do{
            if(ra.equals(cad[k-1].getRa())){
                if(k-1 == 0){
                    cad[0] = null;
                }
                if(k-1 != 0){
                    for(int j = tamanho-1; j > k-1; j--){
                        cad[j-1] = cad[j];
                    }
                    contador--;
                }
            }
             k++;
        }while(!ra.equals(cad[k-2].getRa()) && (k < tamanho + 2));
    }
    
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
    
    
}
   