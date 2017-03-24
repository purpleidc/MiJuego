/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Usuario
 */


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

/**
 *
 * @author jorgecisneros
 */
public class HelicopteroGuay extends Ellipse2D.Double{
    Color colorPajaro;
    int yVelocidad = -5;
    Image luna;
    public HelicopteroGuay(int _radio, int _radio1, Color _color){
        super(100, 100, _radio, _radio1);
        colorPajaro = _color;
        precargaImagenes();
    }

   
    
    public void mueve(Graphics2D g2){
        this.y = this.y - yVelocidad;
        //pongo un tope para que no se salga por el techo
        if (this.y < 0) {
            this.y = 0;
            yVelocidad = -2;
        }
        g2.setColor(colorPajaro);
        g2.fill(this);
     ;
              g2.drawImage(luna, (int)this.getX(), (int)this.getY(), null);
        yVelocidad -= 1;
        if (yVelocidad < -3){
            yVelocidad = -2;
        }
    }
          private void precargaImagenes(){
         
        luna = (new ImageIcon(new ImageIcon(
                getClass().getResource("/imagenes/luna - copia.png"))
                .getImage().getScaledInstance(50,40, Image.SCALE_DEFAULT)))
                .getImage();
        
       
}
    
    public boolean chequeaColision(Pinchos c,Barreras b,Sol s,Babosa x){
       
        Area areaPajaro = new Area(this);
        Area areaCirculo = new Area(s.Sol);
         Area areaCirculo4 = new Area(s.Sol1);
        Area areaCirculo2 = new Area(b.Pared);
           Area areaCirculo3 = new Area(b.Pared2);
            Area areaCirculo5 = new Area(x.babosita);
        boolean choca = true, choca2 = true,choca3 = true,choca4 = true,choca5 =true;
        
        //chequeo el choque con el segundo pajaro
        areaPajaro.intersect(areaCirculo);
       
        if (areaPajaro.isEmpty()){
            choca = false;
        }
        
        //chequeo el choque con el segundo pajaro
        areaPajaro = new Area(this);
        areaPajaro.intersect(areaCirculo2);
        if (areaPajaro.isEmpty()){
            choca2 = false;
        }
        
                areaPajaro = new Area(this);
        areaPajaro.intersect(areaCirculo3);
        if (areaPajaro.isEmpty()){
            choca3 = false;
        }
                areaPajaro = new Area(this);
        areaPajaro.intersect(areaCirculo4);
        if (areaPajaro.isEmpty()){
            choca4 = false;
        }
                areaPajaro = new Area(this);
        areaPajaro.intersect(areaCirculo5);
        if (areaPajaro.isEmpty()){
            choca5 = false;
        }
        return (this.intersects(b.Pared) || 
                this.intersects(b.Pared2) ||
                choca || choca2 || choca3 || choca5 || choca4
                );
    }

}
