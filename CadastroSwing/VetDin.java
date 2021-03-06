/**
 * Escreva a descrição da classe VetDin aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */


public class VetDin implements IArmazenador
{
    int tam;
    Object cad[];

    public VetDin(){
        setCad(null);
        setTamanho(0);
    }

    public Object[] getCad() {
        return cad;
    }

    public int getTamanho() {
        return tam;
    }

    public void setCad(Object[] cad) {
        this.cad = cad;
    }

    public void setTamanho(int tam) {
        this.tam = tam;
    }

    public void inserir(Object obj){
        int i, verif = 0;
        if(cad == null){
            setCad(new Object[1]);
            cad[0] = obj;
            setTamanho(getTamanho()+1);
        }else{
            Object aux[] = new Object[cad.length + 1];

            for (i = 0; i < cad.length; i++){
                if (cad[i] != null) {
                    aux[i] = cad[i];
                }
            }
            aux[aux.length - 1] = obj;
            setCad(aux);
            setTamanho(getTamanho() + 1);
        }
    }

    
    public void deletar(int indice){
        int k = 0, j;
        int contador = 0;
        contador = cad.length-1;
        do{
            if(getTamanho() > 1){
                Object[] aux = new Object[cad.length - 1];
                setTamanho(getTamanho()-1);
                for(j = indice; j < cad.length-1; j++){
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
    
    
    
    
    
    //public Object retornar(){
    //}
}
