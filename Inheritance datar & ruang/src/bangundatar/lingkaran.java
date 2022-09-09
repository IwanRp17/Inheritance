/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ngend
 */
public class lingkaran extends Bangundatar {
    
    private double phi =3.14;
    private double r;
    
    public lingkaran(float Jari){
        
        this.r=Jari;
    }
    
    @Override
    public void HitungLuas(){
        
        Luas=phi * r *r;
        
    }
    @Override
    public void HitungKeliling(){
        
        Keliling= 2 * phi * r ;
        
    }
}

