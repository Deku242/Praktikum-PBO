
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Machine Game
 */
public class main {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
       
        int ulang;
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");

            System.out.print("Pilih: ");
            int pilih = inpt.nextInt();

            switch(pilih){
                case 1:
                    double pb, lb, tb;
                    System.out.print("Input Panjang: ");
                    pb = inpt.nextInt();
                    System.out.print("Input Lebar: ");
                    lb = inpt.nextInt();
                    System.out.print("Input Tinggi: ");
                    tb = inpt.nextInt();
                    balok b = new balok(pb, lb, tb);

                    System.out.println("Luas Persegi Panjang= " + b.hitungLuas());
                    System.out.println("Keliling Persegi Panjang= " + b.hitungKeliling());
                    System.out.println("Volume Balok= " + b.hitungVolume());
                    System.out.println("Luas Permukaan Balok= " + b.hitungLuasP());
                    break;
                case 2:
                    double rt, tt;
                    System.out.print("Input Tinggi: ");
                    tt = inpt.nextInt();
                    System.out.print("Input Jari - jari: ");
                    rt = inpt.nextInt();
                    tabung tbg = new tabung(rt, tt);

                    System.out.println("Luas Lingkaran= " + tbg.hitungLuas());
                    System.out.println("Keliling Lingkaran= " + tbg.hitungKeliling());
                    System.out.println("Volume Tabung= " + tbg.hitungVolume());
                    System.out.println("Luas Permukaan Tabung= " + tbg.hitungLuasP());
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0) :");
            ulang = inpt.nextInt();
        }while(ulang == 1);
    }
}
