package codigo;
 
 import java.awt.Color;
 import java.awt.Graphics2D;
import java.awt.Image;
 import java.awt.Polygon;
import java.util.Random;
import javax.swing.ImageIcon;
 
 /**
  *
  * @author Jorge Cisneros
  */
 public class Pinchos extends Polygon{
     
     Color color = null;
     boolean relleno = false;
     Image piramide;
     public Pinchos (int _posX, int _posY, int _altura, Color _color){
         //número de puntos que tiene el polígono
//         precargaImagenes();
         this.npoints = 3;
         Random aleatorio = new Random();
        int alturasa = aleatorio.nextInt(200)+200;
        
         this.xpoints[0] = _posX;
         this.ypoints[0] = alturasa;
         this.ypoints[1] = _posY + _altura/2;
         this.ypoints[2] = _posY + _altura/2;
         
 
         int mediaBase = (int) (_altura / Math.tan(Math.toRadians(60))) ;
         
 
         this.xpoints[1] = _posX + mediaBase;
         this.xpoints[2] = _posX - mediaBase;
 
         
         color = _color;
      
     }
     
     public void dibujate(Graphics2D g2, int posY){
 
         int altura = 100;//Math.abs((int) ypoints[0] - posY);
         this.ypoints[1] = posY + altura;
         this.ypoints[2] = posY + altura;
         int mediaBase = (int) (altura / Math.tan(Math.toRadians(60))) ;
         this.xpoints[1] = this.xpoints[0] + mediaBase;
         this.xpoints[2] = this.xpoints[0] - mediaBase;
         g2.setColor(this.color);
            Random p = new Random();
         this.color = new Color(p.nextInt(255), p.nextInt(255), p.nextInt(255));
             g2.fill(this);
//         g2.drawImage(piramide, this.xpoints[0]-mediaBase, this.ypoints[0]+ altura, null);
         
             g2.draw(this);
         
            this.xpoints[0] = this.xpoints[0]-2; 
              this.xpoints[1] = this.xpoints[1]-2; 
                this.xpoints[2] = this.xpoints[2]-2; 
                reaparece(g2, posY);
               
         
     }
//         private void precargaImagenes(){
//         
//        piramide = (new ImageIcon(new ImageIcon(
//                getClass().getResource("/imagenes/piramide - copia.png"))
//                .getImage().getScaledInstance(200,100, Image.SCALE_DEFAULT)))
//                .getImage();
//        
//      
//}
     public void reaparece(Graphics2D g2 , int posY){
            if(this.xpoints[2]+150 < 0){
                this.xpoints[0] = 1000; 
            }
     }
   
     
               
               
               
                }
 