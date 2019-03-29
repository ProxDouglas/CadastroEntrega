
public class Disciplinas
{
    private String disc;
    private String prof;
    private double nota;
    
    public Disciplinas(){
        setDisc(null);
        setProf(null);
        setNota(0);
    }
    
    private void setDisc(String ra)
    {
        this.disc = disc;
    }
    
    private void setProf(String prof)
    {
        this.prof = prof;
    }
    
    private void setNota(double nota)
    {
        this.nota = nota;
    }
    
    public String getDisc()
    {
        return this.disc;
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
