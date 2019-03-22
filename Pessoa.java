
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{

	private String nome;
	private int idade;
	private String identify;
		
		
	public Pessoa()
	{
		setNome(this.nome);
		setIdade(this.idade);
		setId(this.identify);	
	}
	
	protected void setNome(String nome)
	{
		this.nome = nome;
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
		return this.nome;
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


