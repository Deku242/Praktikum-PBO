/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;
import Bidang.PersegiPanjang;
/**
 *
 * @author Machine Game
 */

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private int Height;
    private int Length;

    public int getHeight() {
        return Height;
    }

    public Balok(int Height, int Length, int Width) {
        super(Length, Width);
        this.Height = Height;
    }

    @Override
    public double volume() {
        return this.SquareArea() * this.Height;
    }

    @Override
    public double SurfaceArea() {
        int p;
        p = this.Length;
        int l;
        l = this.Width;
        int t;
        t = this.Height;
        return 2 * ((p * l) + (p * t) + (l * t)) ;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }
    
}