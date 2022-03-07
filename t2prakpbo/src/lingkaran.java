
import static menghitungBangun.PHI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Machine Game
 */
public class lingkaran implements menghitungBangun {
    private double jari, hasilLuas, hasilKel;
    
    public lingkaran(double rt){
        jari = rt;
    }
    
    // Encaptulation
    public void setJari(int rt){
        jari = rt;
    }
    
    public double getJari(){
        return jari;
    }
    
    public double getDiameter(){
        return 2*jari;
    }

    @Override
    public double hitungLuas() {
        hasilLuas = PHI * (jari * jari);
        return hasilLuas;
    }

    @Override
    public double hitungKeliling() {
        return hasilKel = PHI * (2*jari);
    }
}
