/**
 * Armazena o nome de uma professor. Inverte nome e limpa espaços extras 
 * (operaçoes herdados da classe pai).
 * Retorna o nome do professor em formato de bibliografia
 * 
 * @author Douglas Cavalcanti, Gabriel Ferreira, Raul Costa 
 * @version 1.0 2019/04/09
 */

public class NomeProfessor extends Texto{
	// Atributos
	private String prof;

	// Construtores
	public NomeProfessor(String prof){
		super(prof);
		setProfessor(super.getTxt());
	}

	/**
	 * @return the nome
	 */
	public String getProfessor() {
		return prof;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setProfessor(String prof) {
		this.prof = prof;
	}
	
	
	/**
	 * Retorna nome invertido
	 * @return sInv nome invertido
	 */
	public String getNomeInvertido(){
		return inverteTexto();
	}
	
	/**
	 * Retorna nome bibliografico
	 * @return sBib nome bibliografico
	 */
	public String getDiscBiblio(){
		
		// Separa as palavras
		String vts[] = getProfessor().split(" ");
		int qtd = vts.length;
		
		String sBib = vts[qtd-1] + ", "; // ultimo nome + a virgula
		// Monta o texto
		for (int i=0; i < (qtd-1); i++){
			String pal = vts[i].toLowerCase(); // pega palavra
			if(!ePreposicao(pal)){ // Se nao for preposicao concatena
				sBib = sBib + vts[i].toUpperCase().charAt(0) + ". ";
			}
		}
		return sBib;
	}
	
	/**
	 * Verifica se string eh uma "preposicao"
	 * @param s string a ser verificada
	 * @return true eh preposicao false nao eh preposicao
	 */
	private boolean ePreposicao(String s){
		// Vetor de "preposicoes"
		final String prep[]={"da", "de", "do", "di", "das", "dos", "e",};
		
		for (int i = 0; i < prep.length; i++){
			if(prep[i].equals(s)){
				return true;
			}
		}
		return false;
	}

}

