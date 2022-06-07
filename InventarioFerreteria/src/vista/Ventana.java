package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class Ventana extends JFrame{
    public JPanel fondo=new JPanel();
    public JPanel barra=new JPanel();
    public JButton agregar=new JButton("Agregar");
    public JButton consultar=new JButton("Consultar");
    public JButton modificar=new JButton("Modificar");
    
    public Ventana(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(fondo);
        iniciarFondo();
        iniciarBarra();
    }
    private void iniciarFondo(){
        fondo.setLayout(new BorderLayout());
        
    }
    private void iniciarBarra(){
        barra.setLayout(new GridLayout(1,3));
        barra.add(agregar);
        barra.add(consultar);
        barra.add(modificar);
        fondo.add(barra,BorderLayout.NORTH);
    }
}
