/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Machine Game
 */
public class balok extends persegiPanjang implements menghitungRuang{
    private double tinggi, hasilVol, hasilLuasP;
    
    public balok(double pb, double lb, double tb){
        super(pb , lb);
        tinggi = tb;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasP() {
        return 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}
