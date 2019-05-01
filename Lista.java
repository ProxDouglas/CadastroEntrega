import java.util.*;

public class Lista{
    int tam;
    ArrayList<Lista> list = new ArrayList<>();
    public Lista(){
        setTamanho(0);
    }
    
    public void inserir(Object obj){
        boolean verif =false;
        Lista l = (Lista)obj;
        verif = list.add(l);
        if(verif)setTamanho(list.size()+1);
        
    }
    
    
    public void deletar(int indice) {
        list.remove(indice);
        setTamanho(list.size()-1);
    }
    
    
    public ArrayList getLista(){
     return this.list;   
    }
    
    /*
    public List<Lista> mostrar() {
        return new ArrayList<Lista>(list);
    }
    */
    
    public void setTamanho(int i){
    this.tam = i;
    }
    
    public int getTamanho(){
    return this.tam;
    }
    
}