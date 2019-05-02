
/**
 * Escreva a descrição da classe Jframe aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
//import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuDiciplinaSwing extends JFrame implements ActionListener
{

    private JTextField campDisc ;
    private JTextField campSemestre ;
    private JTextField campSigla ;
    //private JTextField tc;
    private JButton sair;
    private JButton cadastrar;
    private JButton parar;

    private JLabel disc;
    private JLabel semestre;
    private JLabel sigla;

    
    MenuDiciplinaSwing(String titulo) {
        super(titulo);
        
        Container c = getContentPane();
        setLayout(new GridLayout(0, 2));
        //setTitle("Cadastro de Pessoa");

        JLabel disc = new JLabel("Disciplina: ");
        JTextField campDisc = new JTextField(null, 20);
        JLabel semestre = new JLabel("Semestre: ");
        JLabel sigla = new JLabel("Sigla: ");

        
        JTextField campSemestre = new JTextField(null, 20);
        JTextField campSigla = new JTextField(null, 20);

        JButton btnGravar = new JButton("Gravar");
        JButton btnFechar = new JButton("Fechar");

        
        c.add(disc);
        c.add(semestre);
        c.add(sigla);
        c.add(btnGravar);
        c.add(btnFechar);
        setVisible(true);
        pack();

    }
    

    public void actionPerformed(ActionEvent ae) {
        /*try{
        if(ae.getActionCommand().equals("sair")){
        System.exit(0);
        }else{
        System.out.println(ae.getActionCommand());
        double t = (9./5.)*Double.parseDouble(tc.getText())+32.;
        res.setText(t+" F");
        }
        }catch(Exception e){
        res.setText("Valor invalido!");
        }*/
    }

}

/*super (titulo);
        setSize(350, 100);
        setLocation(1000, 300);

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3,2));

        cp.add(new JLabel("Forneca temp. em Celcius", JLabel.LEFT));
        tc = new JTextField();
        tc.addActionListener(this);
        tc.setToolTipText("Temperatura em Celcius");
        tc.setBackground(Color.WHITE);
        cp.add(tc);

        cp.add(conv = new JButton("Converter"));
        conv.addActionListener(this);
        conv.setToolTipText("Converte Celcius em Fahrenheit");

        cp.add(res = new JLabel("Fahrenheit", JLabel.CENTER));
        res.setToolTipText("Resultado da operacao");
        
        cp.add(sair = new JButton("sair"));
        sair.addActionListener(this);
        sair.setToolTipText("Sair");*/
