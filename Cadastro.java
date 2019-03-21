
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
            System.out.println("Nome: "+ cad[i].getNome() + "\n");
                System.out.println("Idade: "+ cad[i].getIdade() + "\n");
                System.out.println("RG: "+ cad[i].getId() + "\n");
                System.out.println("RA: "+ cad[i].getRa() + "\n");
                System.out.println("Semestre: "+ cad[i].getSemestre() + "\n");
        }
        
    }
    
    public void deletar(Aluno a, int item){
        int k = 0;
        while((item != k) && (k < tamanho)){
            k++;
            if(k == item){
                for(int j = tamanho; j > k; j--){
                    cad[j-1] = cad[j];
                }
                contador--;
             }
        }
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
   