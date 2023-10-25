/*
 Tablero de juego correspondiente a la asignatura de fisica
 */
package proyectointegrador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class TableroJuego extends JPanel{
    
    public TableroJuego(){
        
         setBackground(Color.WHITE);
         setBorder(new LineBorder(Color.BLACK));
         setBounds(50, 5, 500, 400);
 
    }
    
    public void paint(Graphics g){
        super.paint(g);
         Image img = new ImageIcon(getClass().getResource("../imagenes/Juego.png")).getImage();
         g.drawImage(img, 0, 0, 700, 400, this);
        
        
        
    }
 
     



}