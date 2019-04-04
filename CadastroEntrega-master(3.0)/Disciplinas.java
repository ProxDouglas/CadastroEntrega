public class Disciplinas
{
    private NomeDisciplina disc;
    private String prof;
    private double nota;
    
    public Disciplinas(String disc){
        this.disc = new NomeDisciplina(disc);
        //setDisc(null);
        setProf(null);
        setNota(0);
    }
    
    protected void setDisciplina(String disc)
    {
        this.disc.setDisciplina(disc);
    }
    
    private void setProf(String prof)
    {
        this.prof = prof;
    }
    
    private void setNota(double nota)
    {
        this.nota = nota;
    }
    
    public String getDisciplina()
    {
        return disc.getDisciplina();
    }
    
    public double getNota()
    {
        return this.nota;
    }
    
    public String getProf()
    {
        return this.prof;
    }
}