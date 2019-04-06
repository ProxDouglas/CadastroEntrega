public class Disciplinas
{
    private NomeDisciplina disc;
    private NomeProfessor prof;
    private double nota;
    
    public Disciplinas(String disc, String prof){
        this.disc = new NomeDisciplina(disc);
        this.prof = new NomeProfessor(prof);
        //setProf(null);
        setNota(0);
    }
    
    public void setDisciplina(String disc)
    {
        this.disc.setDisciplina(disc);
    }
    
    public void setProf(String prof)
    {
        this.prof = new NomeProfessor(prof);
    }
    
    public void setNota(double nota)
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
        return prof.getProfessor();
    }
}