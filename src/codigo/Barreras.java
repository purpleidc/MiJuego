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
public class Barreras {
       Rectangle2D  Pared,Pared2;
       Color color = null;
       
       public Barreras(){
           Pared = new  Rectangle2D.Double (200,600,20,100);
           Pared2 = new  Rectangle2D.Double (250,100,100,100);
       }
       public void dibujate (Graphics2D g2){
            g2.setColor(this.color);
        
             g2.fill(Pared);
           g2.fill(Pared2);
         
//             g2.draw(Pared);
//                          g2.draw(Pared2);
             Pared.setFrame(Pared.getX()-3, Pared.getY()+1, Pared.getWidth(), Pared.getHeight());
             Pared2.setFrame(Pared2.getX()-3, Pared2.getY()-1, Pared2.getWidth(), Pared2.getHeight());
             
             reaparece();
       }
       public void reaparece(){
            Random aleatorio = new Random();
        int movimiento = aleatorio.nextInt(1)+200;
        
        Random r = new Random();
        
        this.color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        
         Random aleatorio1 = new Random();
        int movimiento1 = aleatorio1.nextInt(200);
        
           if (Pared.getX() + Pared.getWidth() <0){
               Pared.setFrame(1000, movimiento, 70, 100);
               Pared2.setFrame(1000, movimiento1, 70, 100);
           }
               else{
                       Pared.setFrame(Pared.getX()-1, Pared.getY()-3,Pared.getWidth(), Pared.getHeight());
                       Pared2.setFrame(Pared2.getX()-1, Pared2.getY()+2,Pared2.getWidth(), Pared2.getHeight());
                       }
           }
       }
    

