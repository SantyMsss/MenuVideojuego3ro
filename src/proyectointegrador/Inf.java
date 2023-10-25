/* Clase diseñada unicamente para mostrar infrmacion sobre los programadores */
package proyectointegrador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.LineBorder;

public class Inf extends JFrame {

    JButton jbVolver;
    ProyectoIntegrador Pi;

    public Inf(ProyectoIntegrador obj) {
        super("Información Programadores");
        Pi = obj;

        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        GUI();

        setVisible(true);

    }

    public void GUI() {
        TablaInf ti = new TablaInf();
        add(ti);

        jbVolver = new JButton("VOLVER AL MENÚ");
        jbVolver.setBounds(580, 520, 150, 30);
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
        dispose();
        Pi.setVisible(true);
    }
}
