package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.ControlePessoa;

public class JanelaPrograma extends JFrame {

    private JPanel contentPane;
    private JTextField textIdade;
    private JTextField textPeso;
    private JTextField textAltura;
    private ControlePessoa contPessoa;
    private JanelaResultado janelaResultado;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JanelaPrograma frame = new JanelaPrograma();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JanelaPrograma() {
        
        ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();   //Cria um grupo de Radio Button, para poder marca apenas um deles!
        
        setTitle("Calculadora Imc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 283, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("CALCULADORA IMC");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(79, 11, 165, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(10, 59, 48, 14);
        contentPane.add(lblSexo);
        
        final JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
        rdbtnMasculino.setBounds(49, 55, 95, 23);
        contentPane.add(rdbtnMasculino);
        
        final JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
        rdbtnFeminino.setBounds(146, 55, 98, 23);
        contentPane.add(rdbtnFeminino);
        //Adiciona os radio's Button ao grupo.
        buttonGroup1.add(rdbtnMasculino);
        buttonGroup1.add(rdbtnFeminino);
        
        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(10, 88, 48, 14);
        contentPane.add(lblIdade);
        
        textIdade = new JTextField();
        textIdade.setBounds(49, 85, 96, 20);
        contentPane.add(textIdade);
        textIdade.setColumns(10);
        
        JLabel lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(10, 124, 48, 14);
        contentPane.add(lblPeso);
        
        textPeso = new JTextField();
        textPeso.setBounds(49, 121, 96, 20);
        contentPane.add(textPeso);
        textPeso.setColumns(10);
        
        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(10, 167, 48, 14);
        contentPane.add(lblAltura);
        
        textAltura = new JTextField();
        textAltura.setBounds(49, 164, 96, 20);
        contentPane.add(textAltura);
        textAltura.setColumns(10);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int idade = Integer.parseInt(textIdade.getText());
                double altura = Double.parseDouble(textAltura.getText());
                double peso = Double.parseDouble(textPeso.getText());
                char sexo = 'M';
                
                if(rdbtnMasculino.isSelected())
                    sexo = 'M';
                if(rdbtnFeminino.isSelected())
                    sexo = 'F';
                
                contPessoa = new ControlePessoa();
                contPessoa.inserirPessoa(altura, peso, idade, sexo);
                double imc = contPessoa.obterPessoa().calcularImc(peso, altura);
                String resultado = contPessoa.obterPessoa().calcularResultado(imc);
                
                textIdade.setText("");
                textAltura.setText("");
                textPeso.setText("");
                
                janelaResultado = new JanelaResultado(imc, resultado);
                janelaResultado.setVisible(true);
                
            }
        });
        btnCalcular.setBounds(99, 213, 89, 23);
        contentPane.add(btnCalcular);
    }
}
