/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class JavaApplication23 {

     
    public static double luasSegipanjang(double panjang,double lebar){
        return panjang*lebar;
    }
    public static double luasSegitiga(double alas,double tinggi){
        return  0.5 * alas * tinggi;
    }
    public static double luasLingkaran(double jariJari){
        return Math.PI * Math.pow( jariJari, 2);
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      double panjangsegipanjang = Double.parseDouble(JOptionPane.showInputDialog("masukan panjang persegi panjang"));
      double lebarsegipanjang = Double.parseDouble(JOptionPane.showInputDialog("masukan lebar persegi panjang"));
      double luasSegipanjang = Double.parseDouble(JOptionPane.showInputDialog("masukan luas persegi panjang"));
      JOptionPane.showInputDialog( panjangsegipanjang , luasSegipanjang);
        System.out.println("Luas persegi panjang " + luasSegipanjang);
        
        double alasSegitga = Double.parseDouble(JOptionPane.showInputDialog("masukan alas segitiga"));
        double tingiSegitga = Double.parseDouble(JOptionPane.showInputDialog("masukan tingi segitiga"));
        double luasSegitiga =luasSegitiga(alasSegitga, tingiSegitga);
        JOptionPane.showInputDialog(panjangsegipanjang, lebarsegipanjang);
        System.out.println("Luas segitiga " + luasSegitiga );
       
         double jarijariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("masukan jari jari lingkarn"));
         double luasLingkaran = luasLingkaran(jarijariLingkaran);
         JOptionPane.showInputDialog( null, "luas Lingkaran :"  +  luasLingkaran);
        System.out.println("Luas Lingkaran :" + luasLingkaran);
        
    }

   

   
    
    
}
