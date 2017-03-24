/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author jorgecisneros
 */
public class Copter extends Ellipse2D.Double{
    Color colorPajaro;
    int yVelocidad = -5;
    
    public Copter(int _radio, int _radio1, Color _color){
        super(100, 100, _radio, _radio);
        colorPajaro = _color;
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
        yVelocidad -= 1;
        if (yVelocidad < -3){
            yVelocidad = -2;
        }
    }
    
//    public boolean chequeaColision(Palos c){
//       
//        Area areaPajaro = new Area(this);
//        Area areaCirculo = new Area(c.circuloInferior);
//        Area areaCirculo2 = new Area(c.circuloSuperior);
//        
//        boolean choca = true, choca2 = true;
//        
//        //chequeo el choque con el segundo pajaro
//        areaPajaro.intersect(areaCirculo);
//       
//        if (areaPajaro.isEmpty()){
//            choca = false;
//        }
//        
//        //chequeo el choque con el segundo pajaro
//        areaPajaro = new Area(this);
//        areaPajaro.intersect(areaCirculo2);
//        if (areaPajaro.isEmpty()){
//            choca2 = false;
//        }
//        
//        return (this.intersects(c.capitel) || 
//                this.intersects(c.base) ||
//                choca || choca2
//                );
//    }

}
