/* Clase main principal con menu que dirige a todas las opciones posibes 

programadores 
Santiago Martinez Serna
Santiago Alejandro Santacruz 
laura Sofia Toro

version del codigo
2.0


*/



package proyectointegrador;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/*Autores:
* Laura Sofia Toro Garcia 230222021
* Santiago Martinez Serna 230222014
* Santiago Santacruz Cuellar 230222033
 */
public class ProyectoIntegrador extends JFrame {
    
    JButton Jugar, ModoHistoria, Scorer, Mision, Configuraciones, Huma1 , Inf;
    JLabel jlFisica;

    public ProyectoIntegrador() {

        super("MY ECOPLANET");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setLayout(null); //permite realizar un diseño libre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        GUI();
        setVisible(true);

    }

    ProyectoIntegrador(VentanaLogin aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void GUI() {

        JLabel jlTitulo = new JLabel("MY ECOPLANET");
        jlTitulo.setBounds(45, 20, 600, 50);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(Color.black);
        jlTitulo.setForeground(Color.white);
        jlTitulo.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 30));
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);
        jlTitulo.setBorder(new LineBorder(Color.white));
        add(jlTitulo);

        //CREACION DE BOTONES

          ImageIcon img1 = new ImageIcon(getClass().getResource("../imagenes/Jugar.png"));

        Jugar = new JButton("<html>JUGAR</html>", img1);
        Jugar.setBounds((700 - 300) / 2, 80, 300, 60);
        Jugar.setBackground(Color.BLACK);
        Jugar.setForeground(Color.WHITE);
        Jugar.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        Jugar.setToolTipText("Ver ventana");
        Jugar.setFocusable(false);
        Jugar.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        Jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Jugar();
            }
        });

        add(Jugar);


        ImageIcon img2 = new ImageIcon(getClass().getResource("../imagenes/Historia.png"));

        ModoHistoria = new JButton("<html>CARGAR HISTORIA</html>", img2);
        ModoHistoria.setBounds((700 - 300) / 2, 80 + 80, 300, 60);
        ModoHistoria.setBackground(Color.BLACK);
        ModoHistoria.setForeground(Color.WHITE);
        ModoHistoria.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        ModoHistoria.setToolTipText("Ver ventana");
        ModoHistoria.setFocusable(false);
        ModoHistoria.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        ModoHistoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                evento_ModoHistoria();
            }
        });

        add(ModoHistoria);


        ImageIcon img3 = new ImageIcon(getClass().getResource("../imagenes/Mision.png"));

        Mision = new JButton("<html>MISIONES</html>", img3);
        Mision.setBounds((700 - 300) / 2, 160 + 80, 300, 60);
        Mision.setBackground(Color.BLACK);
        Mision.setForeground(Color.WHITE);
        Mision.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        Mision.setToolTipText("Ver ventana");
        Mision.setFocusable(false);
        Mision.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        Mision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                evento_Misiones();
            }
        });

        add(Mision);





        ImageIcon img4 = new ImageIcon(getClass().getResource("../imagenes/Marcador.png"));
        Scorer = new JButton("<html>TOP SCORER</html>", img4);
        Scorer.setBounds((700 - 300) / 2, 240 + 80, 300, 60);
        Scorer.setBackground(Color.BLACK);
        Scorer.setForeground(Color.WHITE);
        Scorer.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        Scorer.setToolTipText("Ver ventana");
        Scorer.setFocusable(false);
        Scorer.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });

        Scorer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                evento_Scorer();
            }
        });

        add(Scorer);

        ImageIcon img6 = new ImageIcon(getClass().getResource("../imagenes/Configuraciones.png"));

        Configuraciones = new JButton("<html>CONFIGURACION</html>", img6);
        Configuraciones.setBounds((700 - 300) / 2, 400 + 80, 300, 60);
        Configuraciones.setBackground(Color.BLACK);
        Configuraciones.setForeground(Color.WHITE);
        Configuraciones.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        Configuraciones.setToolTipText("Ver ventana");
        Configuraciones.setFocusable(false);
        Configuraciones.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        Configuraciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                evento_Configuraciones();
            }
        });
        add(Configuraciones);

        ImageIcon img5 = new ImageIcon(getClass().getResource("../imagenes/Mundo.png"));

        Huma1 = new JButton("<html>FINALIDAD DEL JUEGO</html>", img5);
        Huma1.setBounds((700 - 300) / 2, 320 + 80, 300, 60);
        Huma1.setBackground(Color.BLACK);
        Huma1.setForeground(Color.WHITE);
        Huma1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        Huma1.setToolTipText("Ver ventana");
        Huma1.setFocusable(false);
        Huma1.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        Huma1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                evento_Finalidad();

            }
        });
        add(Huma1);


        ImageIcon img7 = new ImageIcon(getClass().getResource("../imagenes/inf.png"));
        Inf = new JButton("<html>PROGRAMADORES</html>", img7);
        Inf.setBounds((700 - 300) / 2, 480 + 80, 300, 60);
    
        Inf.setBackground(Color.BLACK);
        Inf.setForeground(Color.WHITE);
        Inf.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        Inf.setToolTipText("Ver ventana");
        Inf.setFocusable(false);
        Inf.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        Inf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                evento_Inf();
            }
        });

        add(Inf);
    }

    public void evento_ModoHistoria() {
    ModoHistoria M1 = new ModoHistoria();
    M1.Pi = this; // Pasa la referencia de la ventana principal a M1
    setVisible(false); // Oculta la ventana principal
}

    public void Jugar() {

        Jugar J1 = new Jugar(); // Pasa la referencia de la ventana principal
        setVisible(false); // Oculta la ventana princip
     
    }
    


    
    public void evento_Misiones() {
        Misiones mis = new Misiones(this); // Pasa la referencia de la ventana principal

        setVisible(false);

    }
    


    public void evento_Scorer() {
        Scorer Ag = new Scorer(this);
        setVisible(false);
    }

    public void evento_Configuraciones() {
        Configuraciones M2 = new Configuraciones(this);
        setVisible(false);
    }

    public void evento_Finalidad() {
        Finalidad H2 = new Finalidad(this);
        setVisible(false);
    }


    public void evento_Inf() {
        Inf I1 = new Inf(this);
        setVisible(false);
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
     
    }

}
