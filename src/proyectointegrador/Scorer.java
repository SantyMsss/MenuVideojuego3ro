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
    JButton jbVolver, jbQuicksort;
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

        // Crear una matriz de datos para la tabla (esto es solo un ejemplo, debes usar
        // tus datos reales)
        String[][] data = {


                { "JonnyCarl90", "650"},
                { "BidenURRS", "100" },
                { "GoldenJazz2005", "400" },
                { "MrBeastOMG", "200" },
                { "Chayane3", "1200" },
                { "Pirlo420", "150" },
                { "Ximena90", "600" },
                { "Anonimousx", "800" },
                { "SantaClaus1980", "700" },
                { "KevinR009", "350" },
                
        };

        // Definir los nombres de las columnas
        String[] columnNames = { "Jugadores", "Puntos" };

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

        jbQuicksort = new JButton("Ordenar por Puntos (Quicksort)");
        jbQuicksort.setBounds(50, 300, 200, 30);
        jbQuicksort.setBackground(Color.BLACK);
        jbQuicksort.setForeground(Color.WHITE);
        jbQuicksort.setBorder(new LineBorder(Color.WHITE));
        jbQuicksort.setFont(new Font("Tahoma", Font.BOLD | Font.PLAIN, 12));
        jbQuicksort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento_jbQuicksort();
            }
        });
        add(jbQuicksort);

    }

    public void evento_jbVolver() {
        setVisible(false);
        dispose();
        Pi.setVisible(true);
    }

    public void evento_jbQuicksort() {
        // Obtén los datos de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int rowCount = model.getRowCount();
        String[][] data = new String[rowCount][2];
    
        for (int i = 0; i < rowCount; i++) {
            data[i][0] = (String) model.getValueAt(i, 0);
            data[i][1] = (String) model.getValueAt(i, 1);
        }
    
        // Llama al método Quicksort para ordenar los datos por puntos
        quicksort(data, 0, rowCount - 1);
    
        // Actualiza la tabla con los datos ordenados
        for (int i = 0; i < rowCount; i++) {
            model.setValueAt(data[i][0], i, 0);
            model.setValueAt(data[i][1], i, 1);
        }
    }
    
    // Implementación del algoritmo Quicksort
    private void quicksort(String[][] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
    
            quicksort(data, low, pi - 1);
            quicksort(data, pi + 1, high);
        }
    }
    
    private int partition(String[][] data, int low, int high) {
        String pivot = data[high][1];
        int i = low - 1;
    
        for (int j = low; j < high; j++) {
            if (Integer.parseInt(data[j][1]) > Integer.parseInt(pivot)) {
                i++;
    
                String[] temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
    
        String[] temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
    
        return i + 1;
    }
    

    public static void main(String[] args) {
        new Scorer(null);
    }

}
