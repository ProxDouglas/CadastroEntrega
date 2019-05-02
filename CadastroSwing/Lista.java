import java.util.*;


public class Lista {
    int tam;
    ArrayList<Object> list ;
    public Lista(){
        setTamanho(0);
        list = new ArrayList<>();
    }
    
    public void inserir(Object item){
        boolean verif =false;
        verif = list.add(item);
        if(verif)setTamanho(list.size()+1);
        
    }
    
    
    public void deletar(int indice) {
        if(getTamanho() > 0){
            list.remove(indice);
            setTamanho(list.size()-1);
        }
    }
    
    
    public ArrayList getLista(){
     return this.list;   
    }
    
    /*
    public List<Lista> mostrar() {
        return new ArrayList<Object>(list);
    }
    */
    
    public void setTamanho(int i){
    this.tam = i;
    }
    
    public int getTamanho(){
    return this.tam;
    }
    
}