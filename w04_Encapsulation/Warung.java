/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_Encapsulation;

/**
 *
 * @author A416
 */
public class Warung {
    
    String makanan, minuman;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }
    
    public static void main(String[] args) {
        Warung warung = new Warung();
        warung.setMakanan("Bakso Lava");
        warung.setMinuman("Es Jeruk");
        System.out.println(warung.getMakanan()+" dan "+warung.getMinuman());
    }
}
