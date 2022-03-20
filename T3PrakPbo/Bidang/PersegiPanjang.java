/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidang;

/**
 *
 * @author Machine Game
 */
public class PersegiPanjang implements MenghitungBidang {
    public int Length;
    public int Width;

    public PersegiPanjang(int Length, int Width) {
        this.Length = Length;
        this.Width = Width;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public void setWidth(int Width) {
        this.Width = Width;
    }

    public int getLength() {
        return Length;
    }

    public int getWidth() {
        return Width;
    }


    @Override
    public double SquareArea() {
        return this.Length * this.Width;
    }

    @Override
    public double SquareCircumference () {
        return 2 * (this.Length + this.Width);
    }
}