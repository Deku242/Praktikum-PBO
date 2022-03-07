/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Machine Game
 */
public class persegiPanjang implements menghitungBangun{
    private double panjang, lebar;
    public persegiPanjang(double pb, double lb){
        panjang = pb;
        lebar = lb;
    }
    
    // Encaptulation
    public void setPanjang(int pb){
        panjang = pb;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public void setLebar(int lb){
        lebar = lb;
    }
    
    public double getLebar(){
        return lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 *(panjang + lebar);
    }
}

