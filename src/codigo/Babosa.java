/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Babosa {
     Rectangle2D  babosita, babosita1;
     Image babosa;
       Color color = null;
       public Babosa(){
                 babosita = new  Rectangle2D.Double (1000,300,100,20);
                             babosita1 = new  Rectangle2D.Double (1000,500,100,20);
                 precargaImagenes();
       }
        public void dibujate (Graphics2D g2){
            
        
              g2.drawImage(babosa, (int)babosita.getX(), (int)babosita.getY(), null);
            g2.drawImage(babosa, (int)babosita1.getX(), (int)babosita1.getY(), null);
         
//             g2.draw(Pared);
//                          g2.draw(Pared2);
             babosita.setFrame(babosita.getX()-7, babosita.getY(), babosita.getWidth(), babosita.getHeight());
      
             
             reaparece();
       }
             private void precargaImagenes(){
         
        babosa = (new ImageIcon(new ImageIcon(
                getClass().getResource("/imagenes/babosa - copia.png"))
                .getImage().getScaledInstance(100,30, Image.SCALE_DEFAULT)))
                .getImage();
        
        
}
       public void reaparece(){
            Random aleatorio = new Random();
        int movimiento = aleatorio.nextInt(600)+200;
        
        Random r = new Random();
        
//        this.color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        
         Random aleatorio1 = new Random();
        int movimiento1 = aleatorio1.nextInt(200);
        
           if (babosita.getX() + babosita.getWidth() <0){
               babosita.setFrame(1000, movimiento, 70, 100);
                 babosita1.setFrame(1000, movimiento+100, 70, 100);
           }
               else{
                       babosita.setFrame(babosita.getX()-7, babosita.getY(),babosita.getWidth(), babosita.getHeight());
                babosita1.setFrame(babosita1.getX()-7, babosita1.getY(),babosita1.getWidth(), babosita1.getHeight());
                       }
           }
}
