/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_Encapsulation;

/**
 *
 * @author Madon
 */

import java.util.Scanner;

public class MainKinetic {
    double massa, kecepatan;
    
    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetic(){
    double energiKinetik = 0.5 * massa * Math.pow(kecepatan, 2);
    return energiKinetik;
}
    
    public static void main(String[] args) {
        MainKinetic main = new MainKinetic();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan massa benda (kg)= ");
        double massa = scanner.nextDouble();
        main.setMassa(massa);
        
        System.out.println("Masukkan kecepatan benda (m/s) = ");
        double kecepatan = scanner.nextDouble();
        main.setKecepatan(kecepatan);
        
        double energiKinetik = main.hitungEnergiKinetic();
        
        System.out.println("Energi kinetik : "+ energiKinetik+" Joule");
        
        scanner.close();
    }
}
