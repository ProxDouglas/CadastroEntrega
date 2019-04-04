
public class NomeDisciplina extends Texto{
	// Atributos
	private String disc;

	// Construtores
	public NomeDisciplina(String disc){
		super(disc);
		setDisciplina(super.getTxt());
	}

	/**
	 * @return the nome
	 */
	public String getDisciplina() {
		return disc;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setDisciplina(String disc) {
		this.disc = disc;
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
		String vts[] = getDisciplina().split(" ");
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

