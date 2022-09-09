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
public class Kubus extends BangunRuang {
    
    private float s;
    
    public Kubus(float sisi){
    
        this.s=sisi;
                
    }
    
public void HitungLuas(){

    Luas=6*s*s;
    
    }
    @Override
    public void HitungKeliling(){

    Keliling= 12 * s;
    }

    @Override
    public void HitungVolume(){

    Volume=s* s* s;
    }

}
