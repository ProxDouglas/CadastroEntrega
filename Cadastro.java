
public class Cadastro
{
    private Aluno cad[];
    private int tamanho;
    
    Cadastro(int tam){
        cad = new Aluno[tam];
        tamanho = tam;
        for(int i = 0; i < tam; i++){
            if(cad[i] == null){
                cad[i] = null;
            }
        }
    }

    public void inserir(Aluno a){
        for(int i = 0; i < tamanho; i++){
            if(cad[i] == null){
                cad[i] = a;
            }
        
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
             }
        }
    }
}
   