package proyectointegrador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;


public class VentanaLogin extends JFrame{
    
    JTextField jtLogin;
    JPasswordField jpPass;
    JButton jbCancelar, jbIngreso;
    JToggleButton jbVerPass;
    ImageIcon img_ver, img_no_ver;
    int contador = 0;
        
    public VentanaLogin(){
        super("Ingreso al sistema");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        crearGUI();
        setVisible(true);
    }
    
    public void crearGUI(){
        ImageIcon img = new ImageIcon(getClass().getResource("../imagenes/Icono.png"));        
        JLabel jlTitulo = new JLabel("MY ECOPLANET",img, JLabel.CENTER);
        jlTitulo.setBounds(0, 0, 400, 75);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(Color.WHITE);
        jlTitulo.setForeground(Color.GREEN);
        jlTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(jlTitulo);
        
        JLabel jlLogin = new JLabel("Login:");
        jlLogin.setBounds(10, 100, 100, 30);
        jlLogin.setHorizontalAlignment(JLabel.RIGHT);
        add(jlLogin);
        
        jtLogin = new JTextField();
        jtLogin.setBounds(120, 100, 150, 30);
        jtLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpPass.requestFocus();
            }
        });
        add(jtLogin);
                        
        JLabel jlPass = new JLabel("Password:");
        jlPass.setBounds(10, 150, 100, 30);
        jlPass.setHorizontalAlignment(JLabel.RIGHT);
        add(jlPass);
        
        jpPass = new JPasswordField();
        jpPass.setBounds(120, 150, 150, 30);
        jpPass.setEchoChar(' ');        
        jpPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_jbIngreso();
            }
        });
        add(jpPass);
        
        img_ver = new ImageIcon(getClass().getResource("../imagenes/ver.png"));
        img_no_ver = new ImageIcon(getClass().getResource("../imagenes/no_ver.png"));
        
        jbVerPass = new JToggleButton(img_no_ver); // para ver/ocultar el password
        jbVerPass.setBounds(275, 150, 50, 30);        
        jbVerPass.setBorderPainted(false); // quitar el borde del boton
        jbVerPass.setContentAreaFilled(false); // quitar el color de fondo del boton     
        jbVerPass.setFocusPainted(false); // quitar el recuadro del foco del boton
        jbVerPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_jbVerPass();
            }
        });
        add(jbVerPass);
        
        jbCancelar = new JButton("Cancelar");
        jbCancelar.setBounds(45, 240, 150, 35);
        jbCancelar.setMnemonic('C');
        jbCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(jbCancelar);
        
        jbIngreso = new JButton("Ingresar");
        jbIngreso.setBounds(205, 240, 150, 35);
        jbIngreso.setMnemonic('I');
        jbIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_jbIngreso();
            }
        });
        add(jbIngreso);
    }
    
    private void evento_jbVerPass() {        
        if(jbVerPass.isSelected()){ // si el JToggleButton esta hundido
            jbVerPass.setIcon(img_ver); // asignar la imagen de ver al boton
            jpPass.setEchoChar((char)0); // permitir ver los caracteres escritos en el JPasswordField
        }else{
            jbVerPass.setIcon(img_no_ver); // asignar la imagen de no_ver al boton
            jpPass.setEchoChar(' '); // ocultar ver los caracteres escritos en el JPasswordField
        }
        jpPass.requestFocus(); // poner el cursor en el JPasswordField
    }
    
    public void evento_jbIngreso(){ 
        String login = jtLogin.getText();
        char pw[] = jpPass.getPassword(); // obtener los caracteres escritos en el JPasswordField como un arreglo de tipo char[]
        String pass = String.valueOf(pw); // convertir el arreglo char[] a String
                
        System.out.println(pass); // mostrar el password
        
        if(login.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(
                        this, 
                        "Login y/o password vacios", 
                        "Advertencia", 
                        JOptionPane.WARNING_MESSAGE);
        }else{
            if ((login.equals("LeoMessi007") && 
                    pass.equals("12345")) || 
                 (login.equals("enfermera") && 
                    pass.equals("54321"))) {
                //System.out.println("Correcto");
                
                ProyectoIntegrador mp = new ProyectoIntegrador();
            // Cierra la ventana de inicio de sesión
            setVisible(false);
            // Limpia los campos y muestra la ventana del menú
            limpiar();
            mp.setVisible(true);
                
            } else {
                contador++;
                if (contador == 3) {
                    JOptionPane.showMessageDialog(
                            this, 
                            "Se agotaron los intentos.\nLacuenta se bloqueo", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }else{
                    JOptionPane.showMessageDialog(
                            this, 
                            "Login y/o password incorrecto", 
                            "Advertencia", 
                            JOptionPane.WARNING_MESSAGE);
                    limpiar();
                }
            }
        }
    }//fin del metodo
    
    public void limpiar(){
        jtLogin.setText("");
        jpPass.setText("");
        jtLogin.requestFocus();
    }
    
    public static void main(String[] args) {
        
        String look = "";

        try {
         // look = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
         // look = "com.jtattoo.plaf.fast.FastLookAndFeel";
          look = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";
          //look = "com.jtattoo.plaf.texture.TextureLookAndFeel";
            UIManager.setLookAndFeel(look);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de cargar el paquete '" + look + "'.\n\n"
                    + "Se tomara el LookAndFeel por defecto.", "Error de paquete", JOptionPane.WARNING_MESSAGE);

            JFrame.setDefaultLookAndFeelDecorated(false);
            look = "";
        }
        
        
        
        
       VentanaLogin vl = new VentanaLogin();
    }    
}
