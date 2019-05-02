import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MenuSwingDisc extends JFrame implements ActionListener
{
    private JTextField disc;
    private JTextField prof;
    private JTextField sigla;
    private JButton cadastro;
    private JButton sair;
    private JTextField tc;
    
    public String discNome;
    public String discSigla;
    public String discProf;
    public int alunoSemestre;
    public boolean closed = false;
    
    MenuSwingDisc(String titulo)
    {
        super(titulo);
        setSize(350, 300);
        setLocation(1000, 300);
        setDisc(discNome);
        setProf(discProf);
        setSigla(discSigla);
        setClosed(closed);
        
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,2));
        
        cp.add(new JLabel("Disciplina", JLabel.LEFT));
        disc = new JTextField();
        disc.addActionListener(this);
        disc.setToolTipText("Nome da Disciplina");
        disc.setBackground(Color.WHITE);
        cp.add(disc);
        
        cp.add(new JLabel("Professor", JLabel.LEFT));
        prof = new JTextField();
        prof.addActionListener(this);
        prof.setToolTipText("Professor da Disciplina");
        prof.setBackground(Color.WHITE);
        cp.add(prof);
        
        cp.add(new JLabel("Sigla", JLabel.LEFT));
        sigla = new JTextField();
        sigla.addActionListener(this);
        sigla.setToolTipText("Sigla da Disciplina");
        sigla.setBackground(Color.WHITE);
        cp.add(sigla);
        
        cp.add(cadastro = new JButton("Cadastrar"));
        cadastro.addActionListener(this);
        cadastro.setToolTipText("Cadastra o Aluno");
        
        cp.add(sair = new JButton("sair"));
        cadastro.addActionListener(this);
        cadastro.setToolTipText("Sair");
        //pack();

    }
    
   
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("sair")){
            CloseFrame();
            break;
        }else{
                
                        
                    setDisc(disc.getText());
                    setProf(prof.getText());
                    setSigla(sigla.getText());
                    setClosed(true);
                    CloseFrame();
         }
    }
    
   
   
    public String getSigla()
    {
        return this.discSigla;
    }
    
    public String getDisc()
    {
        return this.discNome;
    }

    
    public String getProf()
    {
        return this.discProf;
    }

    protected void setDisc(String discNome)
    {
        this.discNome = discNome;
    }
    
    protected void setProf(String discProf)
    {
        this.discProf = discProf;
    }
    
    protected void setSigla(String discSigla)
    {
        this.discSigla = discSigla;
    }
    
    protected void setClosed(boolean closed){
        this.closed = closed;
    }
    
    public boolean getClosed(){
        return this.closed;
    }
    
    public void CloseFrame(){
        super.dispose();
    }
}