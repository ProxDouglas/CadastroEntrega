
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{

    private NomePessoa nome;
    private int idade;
    private String identify;
        
        
    public Pessoa(String nome)
    {
        
        this.nome = new NomePessoa(nome);
        //SetNome(this.nome);
        setIdade(this.idade);
        setId(this.identify);   
    }
    
    protected void setNome(String nome)
    {
        this.nome.setNome(nome);
    }
    
    protected void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    protected void setId(String identify)
    {
        this.identify = identify;
    }
    
    public String getNome()
    {
        return nome.getNome();
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public String getId()
    {
        return this.identify;
    }
    
}
