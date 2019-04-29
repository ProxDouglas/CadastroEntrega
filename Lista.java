import java.util.*;

public class Lista{
    int tam;
    ArrayList<Lista> list = new ArrayList<>();
    
    public void inserir(Lista lista){
        list.add(lista);
    }
    
    
    public void remover(String ra) {
        
    }

    

     public int buscar(String obj){
        
     }
 
     public List<Lista> imprimir() {
        return new ArrayList<Lista>(list);
     }
}