/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
 
/**
 *
 * @author Usuario
 */
public class Sol {
    Image Solecito,Solecito1;
    Ellipse2D Sol,Sol1;
    Color color = null;
    public  Sol(int _radio,int _radio1, Color color){
        Sol = new Ellipse2D.Double(400, 400, 30, 40);
         Sol1 = new Ellipse2D.Double(300, 300, 30, 40);
                 precargaImagenes()    ;
        
    }
     public void dibujate (Graphics2D g2){
            g2.setColor(Color.GRAY);
        aparecer();
              g2.drawImage(Solecito, (int)Sol.getX(), (int)Sol.getY(), null);
               g2.drawImage(Solecito1, (int)Sol1.getX(), (int)Sol1.getY(), null);
             
     }
       private void precargaImagenes(){
         
        Solecito = (new ImageIcon(new ImageIcon(
                getClass().getResource("/imagenes/OVNI - copia.png"))
                .getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)))
                .getImage();
        
        Solecito1 = (new ImageIcon(new ImageIcon(
                getClass().getResource("/imagenes/OVNI - copia.png"))
                .getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT)))
                .getImage();
}
             public void aparecer(){
//             Sol.setFrame(Sol.getX()-2, Sol.getY()-7,Sol.getWidth(), Sol.getHeight());
          if (Sol.getY() + Sol.getHeight()<0){
               Sol.setFrame(1000, 700, 35, 35);
            
           }
          
               else{
                       Sol.setFrame(Sol.getX()-4, Sol.getY()-3,Sol.getWidth(), Sol.getHeight());
                       
                       }
          if (Sol1.getY() + Sol1.getHeight()>0750){
               Sol1.setFrame(1000, 100, 35, 35);
            
           }
          
               else{
                       Sol1.setFrame(Sol1.getX()-4, Sol1.getY()+1,Sol1.getWidth(), Sol1.getHeight());
                       
                       }
          
          
       }


}
