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
public class Persegi extends Bangundatar{
 
    private float s;
    
   public Persegi(float sisi){
       
       this.s=sisi;
       
   }
    @Override
   public void HitungLuas(){
       
       Luas=s*s;
       
   }
    @Override
   public void HitungKeliling(){
       
       Keliling= 4*s;
       
   }
   
}
