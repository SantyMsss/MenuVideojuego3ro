/* Clase diseñada unicamente para mostrar infrmacion sobre los programadores */
package proyectointegrador;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class TablaInf extends JPanel{
    
    
     public TablaInf(){
         setBackground(Color.WHITE);
         setBorder(new LineBorder(Color.BLACK));
         setBounds(20, 50, 740, 420);
         
     }
     public void paint(Graphics g){
         super.paint(g);
        
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial Narrow", Font.BOLD | Font.PLAIN, 25) {
        });
        g.drawString("INFORMACIÓN DE LOS PROGRAMADORES:", 150, 45);
        g.setColor(Color.BLACK);
         
         g.drawString("*Santiago Martinez Serna 230222014", 140, 100);
         g.drawString("*Santiago Santacruz Cuellar 230222033", 140, 140);
         g.drawString("*Laura Sofia Toro Garcia 230222021", 140, 180);
          g.drawString("*Juan Felipe Castro Marulanda 230222039", 140, 220);
      
     }
}
