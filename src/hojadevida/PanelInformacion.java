/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadevida;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Edgar Andres Krejci Bautista
 * @author Michael Leandro Cardenas
 */
public class PanelInformacion extends JPanel implements Interfaz{
    private JTextField name;
    private JComboBox profesion;
    private JTextField ID;
    private JLabel labelName;
    private JLabel labelID;
    private JLabel labelProfesion;
    
    public PanelInformacion() {
        setLayout(null);
        name= new JTextField();
        ID= new JTextField();
        labelName= new JLabel("INGRESE SU NOMBRE*");
        labelID= new JLabel("INGRESE SU IDENTIFICACION*");
        labelProfesion= new JLabel("INGRESE SU PROFESION*");
        profesion= new JComboBox();
        labelName.setBounds(0, 0, 200, 20);
        name.setBounds(160, 0, 150, 20);
        labelID.setBounds(0, 20, 200, 20);
        ID.setBounds(200, 20, 150, 20);
        labelProfesion.setBounds(0, 40,200, 20);
        profesion.setBounds(200, 40, 150, 20);
        profesion.setModel(new DefaultComboBoxModel(profesiones.values()));
        add(labelName);
        add(name);
        add(labelID);
        add(ID);
        add(labelProfesion);
        add(profesion);
    }

    @Override
    public void repintar() {
        
    }

    @Override
    public void mensajeError() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
