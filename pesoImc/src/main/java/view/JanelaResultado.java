package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GraphicsConfiguration;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaResultado extends JFrame {

    private JPanel contentPane;
    private JTextField textImc;
    private JTextField textResultado;
    private static double imc;
    private static String resultado;
    private JanelaPrograma janelaPrograma;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JanelaResultado frame = new JanelaResultado(imc, resultado);
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
    public JanelaResultado(final double imc,final String resultado) {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 283, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("CALCULADORA IMC");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(70, 11, 140, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblSeuImc = new JLabel("Seu Imc:");
        lblSeuImc.setBounds(10, 54, 62, 14);
        contentPane.add(lblSeuImc);
        
        textImc = new JTextField();
        textImc.setBounds(72, 51, 185, 20);
        contentPane.add(textImc);
        textImc.setColumns(10);
        
        JLabel lblVocEst = new JLabel("Você está:");
        lblVocEst.setBounds(10, 111, 62, 14);
        contentPane.add(lblVocEst);
        
        textResultado = new JTextField();
        textResultado.setBounds(70, 108, 187, 20);
        contentPane.add(textResultado);
        textResultado.setColumns(10);
        
        //Mostra o Resultado
        
        textImc.setText(Double.toString(imc));
        textImc.setEditable(false);
        textResultado.setText(resultado);
        textResultado.setEditable(false);
        
        JButton btnCalcularNovamente = new JButton("Calcular Novamente");
        btnCalcularNovamente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                janelaPrograma = new JanelaPrograma();
                janelaPrograma.setVisible(true);

            }
        });
        btnCalcularNovamente.setBounds(70, 209, 140, 23);
        contentPane.add(btnCalcularNovamente);
    }
}
