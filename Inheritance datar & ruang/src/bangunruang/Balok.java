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
public class Balok extends BangunRuang{
    
    private float P;
    private float L;
    private float T;
    
    public Balok(float Panjang,float Lebar,float Tinggi){
        
    this.P=Panjang;
     this.L=Lebar;
        this.T=Tinggi;
    
    }
    @Override
    public void HitungLuas(){
        
        Luas=2*((P*L)+(P*T)+(L*T));
   
    }
    @Override
    public void HitungKeliling(){
    
        Keliling=4*(P+L+T);
                
    }
    
    @Override
    public void HitungVolume(){
    
        Volume=P*L*T;
                
    }
}
