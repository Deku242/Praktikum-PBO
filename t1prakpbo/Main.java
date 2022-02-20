/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1prakpbo;

import java.util.Scanner;

/**
 *
 * @author Machine Game
 */
public class Main {
    static double Awal;
    static int pilih;
    
    public static void main(String[] args) {
        Konversi suhu = new Konversi();
        double celcius ,F, R, K;
        boolean kondisi = false;
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("--Program Konversi Suhu Air--");
        System.out.println("-----------------------------");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Masukkan suhu celcius = ");
        Awal = input.nextDouble();
        
        while(kondisi!=true){                        
            System.out.println("\nOpsi");
            System.out.println("-----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1://check perhitungan
                    if(Awal<=0){
                        F = suhu.konversi_F();
                        R = suhu.konversi_R();
                        K = suhu.konversi_K();

                        System.out.println("Dalam Celcius    = "+Awal+" °C");
                        System.out.println("Dalam Fahrenheit = "+F+" °F");
                        System.out.println("Dalam Reamur     = "+R+" °R");
                        System.out.println("Dalam Kelvin     = "+K+" °K");
                        System.out.println("Kondisi air membeku");
                    }
                    else if(Awal<100){
                        F = suhu.konversi_F();
                        R = suhu.konversi_R();
                        K = suhu.konversi_K();

                        System.out.println("Dalam Celcius    = "+Awal+" °C");
                        System.out.println("Dalam Fahrenheit = "+F+" °F");
                        System.out.println("Dalam Reamur     = "+R+" °R");
                        System.out.println("Dalam Kelvin     = "+K+" °K");
                        System.out.println("Kondisi air Normal");
                    }
                    else if(Awal>=100){
                        F = suhu.konversi_F();
                        R = suhu.konversi_R();
                        K = suhu.konversi_K();

                        System.out.println("Dalam Celcius    = "+Awal+" °C");
                        System.out.println("Dalam Fahrenheit = "+F+" °F");
                        System.out.println("Dalam Reamur     = "+R+" °R");
                        System.out.println("Dalam Kelvin     = "+K+" °K");
                        System.out.println("Kondisi air mendidih");
                    }
                    break;
                case 2://edit
                    System.out.println("\nInput Data Baru");
                    System.out.println("----------");
                    System.out.print("Masukkan suhu celcius = ");
                    Awal = input.nextDouble();
                    break;
                case 3://exit
                    kondisi=true;   
                    break;
                default :
                    System.out.println("Opsi Tersebut Tidak Ada");
            }
        }
    }
}
