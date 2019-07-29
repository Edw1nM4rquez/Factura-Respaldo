

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionProductos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author edwin
 */
public class Inicio extends JFrame implements ActionListener{
private JTextField txtNombre;
//private JTextField txtContrasenia;
private String phat ="E:\\Cuentas libreria\\images.jpg";
private int bandera=0 ;
ImageIcon Img;
private String txtContraseña;
  JPasswordField password1 ;
  private boolean banderaOp;
  private GestionProductos gesp;
public Inicio(){
    initcomponents();
}
public void initcomponents(){
this.setSize(800,700);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Libreria Marquez");

 Container cp= getContentPane();
    BorderLayout layout=new BorderLayout();
   cp.setLayout(layout);
  
   JPanel registro=new JPanel();
   registro.setLayout(new GridBagLayout());
   registro.setBorder(BorderFactory.createTitledBorder("Inicio de Sesion"));
    
  GridBagConstraints gb =new GridBagConstraints();
  gb.gridx=0;
  gb.gridy=0;
  registro.add(new JLabel(" Usuario:"), gb);
    System.out.println("estamos hacinedo una prueba ");
  gb =new GridBagConstraints();
  gb.gridx=1;
  gb.gridy=0;
  gb.fill = 2;
  txtNombre =new JTextField(10);
  registro.add(txtNombre, gb);
  
  gb =new GridBagConstraints();
  gb.gridx=0;
  gb.gridy=2;
  registro.add(new JLabel("   "), gb);
  
  gb = new GridBagConstraints();
  gb.gridx =0;
  gb.gridy =3;
  registro.add(new JLabel(" Contrasenia:         "), gb);
  
  gb=new GridBagConstraints();
  gb.gridx = 1;
  gb.gridy = 3;
  password1=new JPasswordField(10);
  registro.add(password1, gb);

  gb =new GridBagConstraints();
  gb.gridx=0;
  gb.gridy=4;
  registro.add(new JLabel("   "), gb);
  
  JButton entrar =new JButton("ENTRAR");
  entrar.addActionListener(this);
  entrar.setActionCommand("btnint");
  //entrar.setBackground(Color.GRAY);
  
  gb = new GridBagConstraints();
  gb.gridx=0;
  gb.gridy=5;
  gb.fill=2;
  gb.gridwidth=2;
  registro.add(entrar,gb);
 
     JPanel registro1=new JPanel();
   registro1.setLayout(new GridBagLayout());
   registro1.setBackground(Color.white);


 // JPanel foto =new JPanel();
 GridBagConstraints gb1 = new GridBagConstraints();
    gb1.gridx = 0;
    gb1.gridy = 0;
    registro1.add(new JLabel(new ImageIcon(phat)));
   
 
  
 
 cp.add(registro,BorderLayout.CENTER);
 cp.add(registro1,BorderLayout.WEST);
 //cp.add(foto,BorderLayout.WEST);
 
}
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand();
		switch (comando){
                    case "btnint":
                        regresarContra();
                          if(txtNombre.getText().equals("admin") && txtContraseña.equals("admin"))
                          {
                              gesp=new GestionProductos();
                           Facturacion f=new Facturacion(gesp);
                        f.setVisible(true);
                        this.setVisible(false);     
                          }else{
                         JOptionPane.showMessageDialog(null,"Usuario incorrecto") ;
                         password1.setText(" ");
                          }              
                        break;
                }
                
    }
    private void regresarContra(){
        	char [] input = password1.getPassword();
		 txtContraseña = String.valueOf(input);
                 System.out.println("Contra"+txtContraseña);
        }

}
