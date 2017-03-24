/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Suelo {
    Rectangle2D Suelo;
     Color color = null;
     public Suelo(){
          Suelo = new  Rectangle2D.Double (0,500,1000,50);
     }
       public void dibujate (Graphics2D g2){
           Random s = new Random();
         this.color = new Color(s.nextInt(255), s.nextInt(255), s.nextInt(255));
            g2.setColor(this.color);
        
             g2.fill(Suelo);
          
       }
}
