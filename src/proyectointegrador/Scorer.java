/*Clase diseñada para dar acceso con dos botones a funciones como conceptoA y calculadoraVectores*/


package proyectointegrador;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scorer extends JFrame {
    JButton jbConcepto, jbCalculadora;
    JButton jbVolver;
    ProyectoIntegrador Pi;
    JTable jTable;

    public Scorer(ProyectoIntegrador obj) {
        super("TOP SCORER");
        Pi = obj;
        setSize(700, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        GUI();

        setVisible(true);
    }

    public void GUI() {
        JLabel jlTitulo = new JLabel("TOP SCORER");
        jlTitulo.setBounds(45, 20, 600, 50);
        jlTitulo.setOpaque(true);
        jlTitulo.setBackground(Color.black);
        jlTitulo.setForeground(Color.white);
        jlTitulo.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.PLAIN, 30));
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);
        jlTitulo.setBorder(new LineBorder(Color.white));
        add(jlTitulo);

        // Crear una matriz de datos para la tabla (esto es solo un ejemplo, debes usar tus datos reales)
        String[][] data = {
                {"1","Chayane3", "1200"},
                {"2","Pirlo420", "1000"},
                {"3","SantaClaus1980", "700"},
                {"4","Ximena90", "600"},
                {"5","Anonimousx", "500"},
                {"6","GoldenJazz2005", "400"},
                {"7","KevinR009", "350"},
                {"8","MrBeastOMG", "200"},
                {"9","BidenURRS", "100"},
        };

        // Definir los nombres de las columnas
        String[] columnNames = {"#","Jugadores", "Puntos"};

        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        jTable = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(jTable);
        scrollPane.setBounds(50, 100, 600, 150);
        add(scrollPane);

        jbVolver = new JButton("VOLVER AL MENÚ");
        jbVolver.setBounds(520, 300, 150, 30);
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
