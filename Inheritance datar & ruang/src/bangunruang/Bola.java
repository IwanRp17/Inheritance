/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ngend
 */
public class Bola extends BangunRuang {
    
    private float r;
    private double phi = 3.14;
    
    public Bola(float Jari){
    
        this.r=Jari;
    }
    
    @Override
    public void HitungLuas(){
   
        Luas= 4 * phi * r *r;
        
    }
    
    @Override
    public void HitungVolume(){
    
        Volume= 4/3 * phi * r * r * r;
    }
    
}
