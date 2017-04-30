/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadevida;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author edgar
 */
public class PanelImagen extends JPanel implements Interfaz,ActionListener{
    
    private JLabel imagen;
    private JButton boton;

    public PanelImagen() {
        setBackground(Color.red);
        setLayout(null);
        ImageIcon icon= new ImageIcon("imagenes/persona.png");
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)));
        imagen.setBounds(140, 0, 200, 200);
        add(imagen);
    }
    
    @Override
    public void repintar() {
        
    }

    @Override
    public void mensajeError() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
