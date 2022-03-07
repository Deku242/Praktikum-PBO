
import static menghitungBangun.PHI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Machine Game
 */
public class tabung extends lingkaran implements menghitungRuang {
    
    private double tinggi, hasilVol, hasilLuasP;

    public tabung(double rt, double tt) {
        super(rt);
        tinggi = tt;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return PHI * (super.getJari() * super.getJari()) * tinggi;
    }

    @Override
    public double hitungLuasP() {
        return 2 * (PHI * super.getJari()) * (super.getJari() + tinggi);
    }
    
}
