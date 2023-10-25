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


public class Misiones extends JFrame {

     
    JButton M1, M2, M3, M4, M5, jbVolver;
            ProyectoIntegrador Pi; // Asegú



    public Misiones(ProyectoIntegrador pi) {

        super("MY ECOPLANET");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setLayout(null); //permite realizar un diseño libre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        GUIMisiones();
        setVisible(true);
        Pi = pi; // Asegúrate de que Pi esté inicializado



    
    }
        public void GUIMisiones(){


            JLabel jlTitulo = new JLabel("LISTADO DE MISIONES");
            jlTitulo.setBounds(45, 20, 600, 50);
            jlTitulo.setOpaque(true);
            jlTitulo.setBackground(Color.black);
            jlTitulo.setForeground(Color.white);
            jlTitulo.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 30));
            jlTitulo.setHorizontalAlignment(JLabel.CENTER);
            jlTitulo.setBorder(new LineBorder(Color.white));
            add(jlTitulo);


            //creacion de botones
            M1 = new JButton("<html>MISION 1</html>");
            M1.setBounds(250, 100, 200, 50);
            M1.setBackground(Color.WHITE );
            M1.setForeground(Color.black);
            M1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
            M1.setToolTipText("Ver ventana");
            M1.setFocusable(false);
            M1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    evento_M1();
                }
            });

            add (M1);


          
            


            M2 = new JButton("MISION 2");
            M2.setBounds(250, 200, 200, 50);
            M2.setBackground(Color.WHITE);
            M2.setForeground(Color.BLACK);
            M2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
            M2.setToolTipText("Ver ventana");
            M2.setFocusable(false);
            M2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    evento_M2();
                }
            });
            add (M2);

            M3 = new JButton("MISION 3");
            M3.setBounds(250, 300, 200, 50);
            M3.setBackground(Color.WHITE);
            M3.setForeground(Color.BLACK);
            M3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
            M3.setToolTipText("Ver ventana");
            M3.setFocusable(false);
            M3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    evento_M3();
                }
            });
            add (M3);

            M4 = new JButton("MISION 4");
            M4.setBounds(250, 400, 200, 50);
            M4.setBackground(Color.WHITE);
            M4.setForeground(Color.BLACK);
            M4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
            M4.setToolTipText("Ver ventana");
            M4.setFocusable(false);
            M4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    evento_M4();
                }
            });
            add (M4);

            M5 = new JButton("MISION 5");
            M5.setBounds(250, 500, 200, 50);
            M5.setBackground(Color.WHITE);
            M5.setForeground(Color.BLACK);
            M5.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
            M5.setToolTipText("Ver ventana");
            M5.setFocusable(false);
            M5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    evento_M5();
                }
            });
            add (M5);


            jbVolver = new JButton("VOLVER AL MENÚ");
            jbVolver.setBounds(270, 600, 150, 30);
            jbVolver.setBackground(Color.BLACK);
            jbVolver.setForeground(Color.WHITE);
            jbVolver.setBorder(new LineBorder(Color.WHITE));
            jbVolver.setFont(new Font("Tahoma", Font.BOLD | Font.PLAIN, 12));
            jbVolver.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    evento_jbVolver();
                }
            });
            add(jbVolver);
        }   


        public void evento_jbVolver() {
            setVisible(false);
            Pi.setVisible(true); // Mostrar la ventana principal
        }
        

        public void evento_M1() {
            
            JOptionPane.showMessageDialog(this, "¡Has completado la Misión 1!");
        }
        
        public void evento_M2() {
            
            JOptionPane.showMessageDialog(this, "¡Has completado la Misión 2!");
        }
        
        public void evento_M3() {

            JOptionPane.showMessageDialog(this, "¡Has completado la Misión 3!");
        }
        
        public void evento_M4() {

            JOptionPane.showMessageDialog(this, "¡Has completado la Misión 4!");
        }
        
        public void evento_M5() {

            JOptionPane.showMessageDialog(this, "¡Has completado la Misión 5!");
        }
        
    


   




    
}
