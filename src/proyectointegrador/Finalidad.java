/*
Clase diseñada para abrir ventana de la asignatura humanidades, donde hay una pequeña introduccion y tambien un boton
el cual abrira los capitulos.
*/
package proyectointegrador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.LineBorder;

public class Finalidad extends JFrame {

    JButton jbVolver, jbAbrir_Cap;
    ProyectoIntegrador Pi;
    JLabel jlTi, jlIn, jlSel;


    public Finalidad(ProyectoIntegrador obj) {
        super("FINALIDAD DEL JUEGO");
        Pi = obj;

        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        GUI();

        setVisible(true);

    }

    public void GUI() {

        jbVolver = new JButton("VOLVER AL MENÚ");
        jbVolver.setBounds(620, 420, 150, 30);
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

        JLabel jlTi = new JLabel(" FINALIDAD DEL JUEGO ");
        jlTi.setBounds(50, 20, 700, 50);
        jlTi.setOpaque(true);
        jlTi.setBackground(Color.black);
        jlTi.setForeground(Color.white);
        jlTi.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 30));
        jlTi.setHorizontalAlignment(JLabel.CENTER);
        jlTi.setBorder(new LineBorder(Color.white));
        add(jlTi);

        JLabel jlIn = new JLabel("<html>Es fundamental concientizar a las nuevas "
                + "generaciones sobre la importancia de cuidar el <br>"
                + "medio ambiente y proteger a los animales en peligro de extinción. Una forma efectiva de hacerlo es a través de los videojuegos, que <br>"
                + "combinan diversión y aprendizaje de manera única. En este trabajo, presentamos una idea para un videojuego educativo que busca "
                + "enseñar a los niños sobre la importancia de cuidar el medio ambiente y proteger a los animales en peligro de extinción.</html>");


        jlIn.setBounds(35, 80, 730, 190);
        
        jlIn.setOpaque(true);
        jlIn.setForeground(Color.BLACK);
        jlIn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        jlIn.setBorder(new LineBorder(Color.BLACK));
        add(jlIn);

      
        JButton jbAbrir_Cap = new JButton("Informacion Extra");
        jbAbrir_Cap.setBounds(35, 300, 150, 30);
        jbAbrir_Cap.setBackground(Color.BLACK);
        jbAbrir_Cap.setForeground(Color.WHITE);
        jbAbrir_Cap.setBorder(new LineBorder(Color.WHITE));
        jbAbrir_Cap.setFont(new Font("Tahoma", Font.BOLD | Font.PLAIN, 12));
        jbAbrir_Cap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                evento_jbAbrir_Cap();
            }
        });

        add(jbAbrir_Cap);

    }



    //EVENTO PARA ANADIR MAS INFORMACION DEL OBJETIVO DEL JUEGO
    
    public void evento_jbAbrir_Cap() {
    //  Fisica2 obj = new Fisica2(this);
        setVisible(false);

    } 
    

    
    public void evento_jbVolver() {
        setVisible(false);
        dispose();
        Pi.setVisible(true);
    }

    public static void main(String[] args) {
        ProyectoIntegrador obj = new ProyectoIntegrador();
        Finalidad obj2 = new Finalidad(obj);
    }
}
