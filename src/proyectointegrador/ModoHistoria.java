/* Clase diseñada para dar acceso a la clase Tablerojuego*/

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


public class ModoHistoria extends JFrame {

    JButton jbVolver, M1, M2, M3;
    ProyectoIntegrador Pi;

    public ModoHistoria() {

        super("MY ECOPLANET");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null); //permite realizar un diseño libre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        GUIModoHistoria();
        setVisible(true);
        setPi(null); // Asegúrate de que Pi esté inicializado
        

  }
  
    public void GUIModoHistoria() {


        JLabel jlTitulo = new JLabel("CARGAR PARTIDAS");
        jlTitulo.setBounds(45, 20, 600, 50);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(Color.black);
        jlTitulo.setForeground(Color.white);
        jlTitulo.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 30));
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);
        jlTitulo.setBorder(new LineBorder(Color.white));
        add(jlTitulo);

        // Crear botones de partidas

        M1 = new JButton("<html>Guardado Automatico</html>");
        M1.setBounds(250, 100, 200, 50);
        M1.setBackground(Color.WHITE);
        M1.setForeground(Color.black);
        M1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        M1.setToolTipText("Ver ventana");
        M1.setFocusable(false);
        M1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cargando...");
            }
        });
        add(M1);

        M2 = new JButton("<html>Cargar Partida 1</html>");
        M2.setBounds(250, 200, 200, 50);
        M2.setBackground(Color.WHITE);
        M2.setForeground(Color.black);
        M2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        M2.setToolTipText("Ver ventana");
        M2.setFocusable(false);
        M2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cargando...");
            }
        });
        add(M2);

        M3 = new JButton("<html>Partida Vacia</html>");
        M3.setBounds(250, 300, 200, 50);
        M3.setBackground(Color.WHITE);
        M3.setForeground(Color.black);
        M3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        M3.setToolTipText("Ver ventana");
        M3.setFocusable(false);
        M3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cargando...");
            }
        });
        add(M3);

        

        jbVolver = new JButton("VOLVER AL MENÚ");
        jbVolver.setBounds(520, 350, 150, 30);
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

    public void setPi(ProyectoIntegrador pi) {
        Pi = pi;
    }
    

    public void evento_jbVolver() {
        setVisible(false);
        dispose();
        Pi.setVisible(true);
    }

}

   
    




      
    




       


   



    



        
        


     
    







    















