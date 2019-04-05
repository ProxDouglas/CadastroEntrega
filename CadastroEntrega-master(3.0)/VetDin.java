 /**
 * Escreva a descrição da classe VetDin aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */



public class VetDin implements IArmazenador
{
    int tam;
    Aluno cad[];

    public VetDin(){
        setCad(null);
        setTamanho(0);
    }
    
    public Aluno[] getCad() {
        return cad;
    }
    
    public int getTamanho() {
        return tam;
    }
    
    public void setCad(Aluno[] cad) {
        this.cad = cad;
    }
    
    public void setTamanho(int tam) {
        this.tam = tam;
    }
    
    public void inserir(Aluno a){
        int i, verif = 0;
        if(cad == null){
            setCad(new Aluno[1]);
            cad[0] = a;
            setTamanho(getTamanho()+1);
        }else{
            i=0;
            while(i < getTamanho() && !cad[i].getRa().equals(a.getRa())){
                i++;
            }
            if(cad[i].getRa().equals(a.getRa())){
                verif = 1; 
            }
            if(verif == 0){
                Aluno aux[] = new Aluno[cad.length + 1];
                setTamanho(cad.length + 1);
        
                for(i = 0; i < cad.length; i++ ){
                    aux[i] = cad[i];
                }
                aux[aux.length - 1] = a;
                setCad(aux);
                setTamanho(getTamanho()+1);
            }
        }
    }
    
    
    public void deletar(String  ra){
    /*    int k = 0, j;
        System.out.println("RA: "+ ra);
        //System.out.println("RA: "+ cad[k].getRa());
        do{
            if(ra.equals(cad[k].getRa())){
                for(j = k; j < tam-1; j++){
                    cad[j] = cad[j+1];
                }
                if(j == tam-1){
                    cad[j] = null;
                }
                contador--;
                k = contador+1;
            }
            k++;
        }while(k < contador);*/
    }
    
    public void mostrar(){
        
        if(cad.length != 0){
            int contador = cad.length;
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