
/**
 * Escreva a descrição da interface ICadastro aqui.
 * 
 * @author (seu nome) 
 * @version (número da versão ou data)
 */

public interface IArmazenador
{
    Aluno a = new Aluno(null);
    public void inserir(Aluno a);
    public void deletar(String ra);
    public void mostrar();
}
