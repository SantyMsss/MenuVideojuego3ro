package proyectointegrador;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fisica2 extends JFrame {

    JButton btnDescargarPDF;

    public Fisica2() {
        super("Contaminación Electromagnética");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        GUI();

        setVisible(true);
    }

    public void GUI() {
        btnDescargarPDF = new JButton("Descargar PDF");
        btnDescargarPDF.setBounds(200, 150, 200, 50);

        btnDescargarPDF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                descargarPDF();
            }
        });

        add(btnDescargarPDF);
    }

    public void descargarPDF() {
        try {
            // URL del archivo PDF
            URL pdfURL = new URL("https://ejemplo.com/archivo.pdf");

            // Directorio de descarga (puedes cambiarlo según tu necesidad)
            Path directorioDescarga = Path.of(System.getProperty("user.home"), "Descargas");

            // Nombre del archivo PDF
            String nombreArchivo = "archivo.pdf";

            // Path completo del archivo PDF
            Path pathCompleto = directorioDescarga.resolve(nombreArchivo);

            // Descargar el archivo PDF
            try (InputStream in = pdfURL.openStream()) {
                Files.copy(in, pathCompleto, StandardCopyOption.REPLACE_EXISTING);
            }

            JOptionPane.showMessageDialog(this, "Archivo PDF descargado en: " + pathCompleto);

            // Abrir el archivo PDF con el visor predeterminado
            Desktop.getDesktop().open(pathCompleto.toFile());

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al descargar el archivo PDF.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Fisica2 fisica2 = new Fisica2();
    }
}
