import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MenuSwingAluno extends JFrame implements ActionListener
{
    private JTextField nome;
    private JTextField idade;
    private JTextField rg;
    private JTextField ra;
    private JTextField semestre;
    private JButton cadastro;
    private JButton sair;
    private JTextField tc;
    
    public String alunoNome;
    public int alunoIdade;
    public String alunoRg;
    public String alunoRa;
    public int alunoSemestre;
    public boolean closed = false;
    public boolean closedSair = false;
    
    MenuSwingAluno(String titulo)
    {
        super(titulo);
        setSize(350, 300);
        setLocation(1000, 300);
        setNome(alunoNome);
        setIdade(alunoIdade);
        setRg(alunoRg);
        setRa(alunoRa);
        setSemestre(alunoSemestre);
        setClosed(closed);
        
        
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(6,2));
        
        cp.add(new JLabel("Nome", JLabel.LEFT));
        nome = new JTextField();
        nome.addActionListener(this);
        nome.setToolTipText("Nome do Aluno");
        nome.setBackground(Color.WHITE);
        cp.add(nome);
        
        cp.add(new JLabel("Idade", JLabel.LEFT));
        idade = new JTextField();
        idade.addActionListener(this);
        idade.setToolTipText("Idade do Aluno");
        idade.setBackground(Color.WHITE);
        cp.add(idade);
        
        cp.add(new JLabel("Rg", JLabel.LEFT));
        rg = new JTextField();
        rg.addActionListener(this);
        rg.setToolTipText("Rg do Aluno");
        rg.setBackground(Color.WHITE);
        cp.add(rg);
        
        cp.add(new JLabel("Ra", JLabel.LEFT));
        ra = new JTextField();
        ra.addActionListener(this);
        ra.setToolTipText("Ra do Aluno");
        ra.setBackground(Color.WHITE);
        cp.add(ra);
        
        cp.add(new JLabel("Semestre", JLabel.LEFT));
        semestre = new JTextField();
        semestre.addActionListener(this);
        semestre.setToolTipText("Semestre do Aluno");
        semestre.setBackground(Color.WHITE);
        cp.add(semestre);
        
        cp.add(cadastro = new JButton("Cadastrar"));
        cadastro.addActionListener(this);
        cadastro.setToolTipText("Cadastra o Aluno");
        
        cp.add(sair = new JButton("sair"));
        sair.addActionListener(this);
        sair.setToolTipText("Sair");
        //pack();

    }
    
   
    public void actionPerformed(ActionEvent ae)
    {
        boolean excep = false;
        if(ae.getActionCommand().equals("sair")){
            setSair(true);
            CloseFrame();
            
        }else{
                
                        
                   setNome(nome.getText());
                   
                    try{
                    setIdade(Integer.parseInt(idade.getText()));
                   }catch(NumberFormatException e){
                       System.out.println("Caractere invalido\n");
                       System.out.println("Cadastro não efetuado \n");
                    }
                   setRg(rg.getText());
                   setRa(ra.getText());
                   try{
                    setSemestre(Integer.parseInt(semestre.getText()));
                   }catch(NumberFormatException e){
                        System.out.println("Caractere invalido\n");
                       System.out.println("Cadastro não efetuado \n");
                   }
                   setClosed(true);
                   CloseFrame();
         }
    }
    
   
   
    public String getRa()
    {
        return this.alunoRa;
    }
    
    public String getNome()
    {
        return this.alunoNome;
    }
    
    public int getIdade()
    {
        return this.alunoIdade;
    }
    
    public String getRg()
    {
        return this.alunoRg;
    }
    
    public int getSemestre()
    {
        return this.alunoSemestre;
    }
    
    protected void setNome(String alunoNome)
    {
        this.alunoNome = alunoNome;
    }
    
    protected void setIdade(int alunoIdade)
    {
        this.alunoIdade = alunoIdade;
    }
    
    protected void setSemestre(int alunoSemestre)
    {
        this.alunoSemestre = alunoSemestre;
    }
    
    protected void setRg(String alunoRg)
    {
        this.alunoRg = alunoRg;
    }
    
    protected void setRa(String alunoRa)
    {
        this.alunoRa = alunoRa;
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
    
    protected void setSair(boolean closedSair){
        this.closedSair = closedSair;
    }
    
    public boolean getSair(){
        return this.closedSair;
    }
}