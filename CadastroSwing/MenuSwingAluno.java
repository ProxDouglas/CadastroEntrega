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
    private JButton cadastro;
    private JButton sair;
    private JTextField tc;
    
    public String AlunoNome;
    public int AlunoIdade;
    public String AlunoRg;
    public String AlunoRa;
    
    MenuSwingAluno(String titulo)
    {
        super(titulo);
        setSize(350, 300);
        setLocation(1000, 300);
        
       
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(5,2));
        
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
            System.exit(0);
        }else{
                
                        
                    setNome(nome.getText());
                    setIdade(Integer.parseInt(idade.getText()));
                    setRg(rg.getText());
                    setRa(ra.getText());
                
            
         }
    }
    
   
   
    public String getRa()
    {
        return this.AlunoRa;
    }
    
    public String getNome()
    {
        return this.AlunoNome;
    }
    
    public int getIdade()
    {
        return this.AlunoIdade;
    }
    
    public String getRg()
    {
        return this.AlunoRg;
    }
    
    protected void setNome(String AlunoNome)
    {
        this.AlunoNome = AlunoNome;
    }
    
    protected void setIdade(int AlunoIdade)
    {
        this.AlunoIdade = AlunoIdade;
    }
    
    protected void setRg(String AlunoRg)
    {
        this.AlunoRg = AlunoRg;
    }
    
    protected void setRa(String AlunoRa)
    {
        this.AlunoRa = AlunoRa;
    }
}