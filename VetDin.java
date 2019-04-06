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
        String ra;
        if(cad == null){
            setCad(new Aluno[1]);
            cad[0] = a;
            setTamanho(getTamanho()+1);
        }else{
            
            i=0;
            while(i < cad.length-1 && !a.getRa().equals(cad[i].getRa())){
                //if(!(cad[i].getRa().equals(a.getRa())){
                    i = i+1;
                //}
            }
            if(a.getRa().equals(cad[i].getRa())){
                verif = 1; 
            }
            if(verif == 0){
                Aluno aux[] = new Aluno[cad.length + 1];
        
                for (i = 0; i < cad.length; i++){
                    if (cad[i] != null) {
                        aux[i] = cad[i];
                    }
                }
                aux[aux.length - 1] = a;
                setCad(aux);
                setTamanho(getTamanho() + 1);
            }
        }
    }
    
    
    public void deletar(String  ra){
        int k = 0, j;
        int contador = 0;
        //System.out.println("RA: "+ ra);
        //System.out.println("RA: "+ cad[k].getRa());
        contador = cad.length-1;
        do{
            if(ra.equals(cad[k].getRa())){
                Aluno[] aux = new Aluno[cad.length - 1];
                setTamanho(getTamanho()-1);
                for(j = k; j < cad.length-1; j++){
                    if (cad[j] != null) {
                        cad[j] = cad[j+1];
                    }
                }
                for(j = 0; j < aux.length; j++ ){
                    if (cad[j] != null) {
                        aux[j] = cad[j];
                    }
                }
                setCad(aux);
                contador--;
                k = contador+1;
            }
            k++;
        }while(k < contador);
    }
    
    public void mostrar(){
        int j =0;
        if(cad.length != 0){
            int contador = cad.length;
            for(int i = 0; i < contador; i++){
                System.out.println("Nome: "+ cad[i].getNome() + "\n");
                System.out.println("Idade: "+ cad[i].getIdade() + "\n");
                System.out.println("RG: "+ cad[i].getId() + "\n");
                System.out.println("RA: "+ cad[i].getRa() + "\n");
                System.out.println("Semestre: "+ cad[i].getSemestre() + "\n");
                System.out.println("Quantidade de Disciplinas: "+ cad[i].getDisc().length + "\n");
                
                while(j<cad[i].getDisc().length){
                    System.out.println("Semestre: "+ cad[i].disc[j].getDisciplina() + "\n");
                    System.out.println("Semestre: "+ cad[i].disc[j].getProf() + "\n");
                    //System.out.println("Semestre: "+ cad[i].disc[j].getNota() + "\n");
                    if(cad[i].getDisc().length>0 && j<cad[i].getDisc().length-2){
                        System.out.println("_______________________________\n");
                    }
                    j++;
                }
                System.out.println("\n---------------------------------\n");
            }
        }
        else{
            System.out.println("Nenhum contato cadastrado!\n");
        }
    }
}