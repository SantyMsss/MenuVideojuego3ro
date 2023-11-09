/* Clase diseñada para abrir un submenu con dos botones que dirigen a las clases ConceptoD y CalculadoraDerv

NOTA IMPORTANTE : Calculadora derivadas por el momento solo calcula funciones basicas no trigonometricas 
Ejemplos 
12x^2+3+3x^6
etc..
*/

package proyectointegrador;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;

public class Configuraciones extends JFrame {

    JLabel jlTitulo;
    JButton jbVolver, jbConfig1, jbConfig2, jbConfig3, JButton; // Agrega más botones según tus necesidades
    ProyectoIntegrador Pi;

    public Configuraciones(ProyectoIntegrador obj) {
        super("Configuraciones");
        Pi = obj;
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        GUI();
        setVisible(true);
    }

    public void GUI() {
        JLabel jlTitulo = new JLabel("Configuraciones");
        jlTitulo.setBounds(45, 20, 600, 50);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(Color.black);
        jlTitulo.setForeground(Color.white);
        jlTitulo.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 30));
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);
        jlTitulo.setBorder(new LineBorder(Color.white));
        add(jlTitulo);

        // Agrega botones de configuraciones aquí
        jbConfig1 = new JButton("Graficos");
        jbConfig1.setBounds(250, 100, 200, 50);
        jbConfig1.setBackground(Color.WHITE);
        jbConfig1.setForeground(Color.BLACK);
        jbConfig1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        jbConfig1.setToolTipText("Ver ventana");
        jbConfig1.setFocusable(false);
        jbConfig1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_Config1();
            }
        });
        add(jbConfig1);

        jbConfig2 = new JButton("Sonido");
        jbConfig2.setBounds(250, 200, 200, 50);
        jbConfig2.setBackground(Color.WHITE);
        jbConfig2.setForeground(Color.BLACK);
        jbConfig2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        jbConfig2.setToolTipText("Ver ventana");
        jbConfig2.setFocusable(false);
        jbConfig2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_Config2();
            }
        });
        add(jbConfig2);

        jbConfig3 = new JButton("Controles");
        jbConfig3.setBounds(250, 300, 200, 50);
        jbConfig3.setBackground(Color.WHITE);
        jbConfig3.setForeground(Color.BLACK);
        jbConfig3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 20));
        jbConfig3.setToolTipText("Ver ventana");
        jbConfig3.setFocusable(false);
        jbConfig3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_Config3();
            }
        });
        add(jbConfig3);

        jbVolver = new JButton("VOLVER AL MENÚ");
        jbVolver.setBounds(250,370, 200, 30);
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
        Pi.setVisible(true); // Mostrar la ventana principal
    }

    // Agrega eventos para tus botones de configuración
    public void evento_Config1() {
        JOptionPane.showMessageDialog(this, "Configuración 1 seleccionada");
    }

    public void evento_Config2() {
        JOptionPane.showMessageDialog(this, "Configuración 2 seleccionada");
    }

    public void evento_Config3() {
        JOptionPane.showMessageDialog(this, "Configuración 3 seleccionada");
    }



    
}
