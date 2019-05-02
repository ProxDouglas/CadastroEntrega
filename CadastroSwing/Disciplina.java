public class Disciplina
{
    private NomeDisciplina disc;
    private NomeProfessor prof;
    String sigla;
    private double nota;
    
    public Disciplina(String disc, String prof, String sigla){
        this.disc = new NomeDisciplina(disc);
        this.prof = new NomeProfessor(prof);
        this.sigla = sigla;
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
    public String getSigla() {
        return sigla;
    }
   
    protected void setSigla(String sigla) {
        this.sigla = sigla;
    }
}