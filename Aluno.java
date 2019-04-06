/**
 * Escreva a descriÃ§Ã£o da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (nÃºmero de versÃ£o ou data)
 */
public class Aluno extends Pessoa
{
    // variÃ¡veis de instÃ¢ncia - substitua o exemplo abaixo pelo seu prÃ³prio
    private String ra;
    private int falta;
    private double nota;
    private int semestre;
    protected Disciplinas[] disc;

    public Aluno(String nome) {
        super(nome);
        setRa(ra);
        setSemestre(semestre);
    }

    protected void setRa(String ra)
    {
        this.ra = ra;
    }

    protected void setFalta(int falta)
    {
        this.falta = falta;
    }

    protected void setNota(double nota)
    {
        this.nota = nota;
    }

    protected void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public String getRa()
    {
        return this.ra;
    }

    public int getFalta()
    {
        return this.falta;
    }

    public double getNota()
    {
        return this.nota;
    }

    public int getSemestre()
    {
        return this.semestre;
    }
    
    public void setDisc(Disciplinas[] disc, int i)
    {
        this.disc[i] = disc[i];
    }
    
    public Disciplinas[] getDisc()
    {
        return this.disc;
    }
    
    
    public void setDiscVet(int tam)
    {
        this.disc = new Disciplinas[tam];
    }
    /*public Disciplinas[] setDiscVet(int tam)
    {
        Disciplinas[] aux = new Disciplinas[tam];
        this.disc = aux;
        return this.disc;
    }*/
    

}
