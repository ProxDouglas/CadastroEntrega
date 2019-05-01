import java.util.*;

public class Lista{
    int tam;
    ArrayList<Lista> list = new ArrayList<>();
    public Lista(){
        setTamanho(0);
    }
    
    public boolean inserir(Object obj){
        boolean verif =false;
        verif = list.add((Lista)obj);
        if(verif)setTamanho(list.size()+1);
        return verif;
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