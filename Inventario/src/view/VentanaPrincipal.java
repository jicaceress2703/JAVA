package view;

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    private PanelPrincipal panel; 
    
    public VentanaPrincipal(){
        setTitle("Reto5");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().setLayout(null);
        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void inicializarComponentes(){
        panel = new PanelPrincipal();
        panel.setBounds(25, 25, 735, 510);
        getContentPane().add(panel);
    }
}
