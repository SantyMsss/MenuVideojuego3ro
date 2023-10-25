package proyectointegrador;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Jugar extends JFrame {
    JButton jbVolver;

    public Jugar() {
        super("Ventana de Jugar");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GUICrearVentana();
        setVisible(true);
    }

    public void GUICrearVentana() {
        JTextArea texto = new JTextArea("¡Vamos a Jugar!\n\n"
                + "Nuestra dinamica de juego se basara, en que pintes un triangulo grande en tu cuaderno "
                + "y dentro de ese mismo triangulo pintes a partir de rayas otros triangulos mas pequeños, "
                + "usa tu lapiz. \n "
                 + "Entenderas a cada triangulo pequeño como un animal de la tierra \n"
                + "ahora borra solo una de las lineas de cualquiera de los triangulos pequeños, "
                + "dinos, ¿Que aprecias dentro del triangulo grande?");
        texto.setWrapStyleWord(true);
        texto.setLineWrap(true);
        texto.setCaretPosition(0);
        texto.setEditable(false);

        JScrollPane scroll = new JScrollPane(texto);
        scroll.setBounds(20, 20, 360, 150);
        add(scroll);

        // Crear botón de Volver al Menú
        jbVolver = new JButton("VOLVER AL MENÚ");
        jbVolver.setBounds(150, 200, 150, 30);
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
        ProyectoIntegrador ventanaPrincipal = new ProyectoIntegrador();
        ventanaPrincipal.setVisible(true);
    }

    public static void main(String[] args) {
        Jugar ventanaJugar = new Jugar();
    }
}
