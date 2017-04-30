/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadevida;

import javax.swing.JFrame;

/**
 *
 * @author edgar
 */
public class VentanaPrincipal extends JFrame {
    PanelInformacion info;
    PanelImagen imagen;
    public VentanaPrincipal() {
        setSize(1000,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        info= new PanelInformacion();
        imagen = new PanelImagen();
        setLayout(null);
        info.setBounds(0, 20, 500, 300);
        imagen.setBounds(520,20,470,300);
        add(info);
        add(imagen);
        setVisible(true);
        
    }
    
    
}
