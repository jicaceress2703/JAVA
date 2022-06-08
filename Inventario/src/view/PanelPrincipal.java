package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelPrincipal extends JPanel {
    private JButton botInsertar;
    private JButton botEliminar;
    private JButton botConsultar;
    private JButton botModificar;
    private JPanel panelBotones=new JPanel(new GridLayout(1,4));
    private JPanel panelCajas;
    private JTextField idText,nombreText,categoriaText,cantidadText,vcText,vvText;
    public PanelPrincipal() {
        setLayout(new BorderLayout());

        inicializarComponentes();

        setVisible(true);
    }
    public void inicializarComponentes() {
        botInsertar = new JButton("Insertar");
        botInsertar.setActionCommand("INSERTAR");
        panelBotones.add(botInsertar);
        botEliminar = new JButton("Eliminar");
        botEliminar.setActionCommand("ELIMINAR");
        panelBotones.add(botEliminar);
        botConsultar = new JButton("Consultar");
        botConsultar.setActionCommand("CONSULTAR");
        panelBotones.add(botConsultar);
        botModificar = new JButton("Modificar");
        botModificar.setActionCommand("MODIFICAR");
        panelBotones.add(botModificar);
        panelCajas.setLayout(null);
        idText=new JTextField();
        idText.setBounds(200,200,50,30);
        panelCajas.add(idText);
        this.add(panelBotones,BorderLayout.NORTH);
        this.add(panelCajas,BorderLayout.CENTER);
    }

    public JButton getBotInsertar() {
        return botInsertar;
    }

    public void setBotInsertar(JButton botInsertar) {
        this.botInsertar = botInsertar;
    }

    public JButton getBotEliminar() {
        return botEliminar;
    }

    public void setBotEliminar(JButton botEliminar) {
        this.botEliminar = botEliminar;
    }

    public JButton getBotConsultar() {
        return botConsultar;
    }

    public void setBotConsultar(JButton botConsultar) {
        this.botConsultar = botConsultar;
    }

    public JButton getBotModificar() {
        return botModificar;
    }

    public void setBotModificar(JButton botModificar) {
        this.botModificar = botModificar;
    }
    
}
