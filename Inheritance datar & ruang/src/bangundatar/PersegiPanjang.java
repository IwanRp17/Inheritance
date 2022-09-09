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
public class PersegiPanjang extends Bangundatar{
    
    private float P;
    private float L;
    
   public PersegiPanjang(float Panjang,float Lebar){
       
      this.P=Panjang;
      this.L=Lebar;
   }
    @Override
   public void HitungLuas(){
       
       Luas=P*L;
       
   }
    @Override
   public void HitungKeliling(){
       
       Keliling=2*(P+L);
       
   }
}
