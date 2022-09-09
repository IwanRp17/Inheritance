/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bangundatar.Bangundatar;
import bangunruang.BangunRuang;
/**
 *
 * @author ngend
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("-Menghitung Bangun Datar-\n");
        
        bangundatar.lingkaran lingkaran1=new bangundatar.lingkaran(7);
            System.out.println("Menghitung Lingkaran\n");
            
        lingkaran1.HitungLuas();
        lingkaran1.HitungKeliling();
        lingkaran1.PrintfInfo();
       
        bangundatar.Persegi persegi1= new bangundatar.Persegi(9);
            System.out.println("Mengitung Persegi\n");
        
        persegi1.HitungLuas();
        persegi1.HitungKeliling();
        persegi1.PrintfInfo();
        
        bangundatar.PersegiPanjang PP1 = new bangundatar.PersegiPanjang(6,9);
              System.out.println("Mengitung Persegi Panjang\n");
              
        PP1.HitungLuas();
        PP1.HitungKeliling();
        PP1.PrintfInfo();
        
        System.out.println("------------------------------------------");
            System.out.println("Menghirung Bangun Ruang");
        
         bangunruang.Balok balok =new bangunruang.Balok(5, 3, 2);
            System.out.println("balok\n");
         
         balok.HitungKeliling();
         balok.HitungLuas();
         balok.HitungVolume();
         balok.PrintInfo();
         
         bangunruang.Bola bola=new bangunruang.Bola(8);
            System.out.println("Menghitung Bola\n");
            
         balok.HitungKeliling();
         balok.HitungLuas();
         balok.HitungVolume();
         balok.PrintInfo();
         
         bangunruang.Kubus kubus=new bangunruang.Kubus(12);
            System.out.println("Menghitung Kubus\n");
            
         kubus.HitungKeliling();
         kubus.HitungLuas();
         kubus.HitungVolume();
         kubus.PrintInfo();
                 
 
        
    }
    
}
