
/**
 * Escreva a descrição da classe VetDin aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class VetDin
{
    private int tamanho;
    private int contador;
    private Aluno cad[];
    
    public VetDin(int tam){
        cad = new Aluno[tam];
        tamanho = tam;
        contador = 0;
        for(int i = 0; i < tam; i++){
            if(cad[i] != null){
                cad[i] = null;
            }
        }

    }

    public void inserir(Aluno a){
        int aux = contador + 1;
        if(contador < tamanho){
            for(int i = 0; i < aux; i++){ 
                if(cad[i] == null ){
                    cad[i] = a;
                    contador++;
                }

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
