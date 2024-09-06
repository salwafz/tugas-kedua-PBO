/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanKedua;

/**
 *
 * @author Salwa Faizah
 */
public class Hewan {
 private int jumlahKaki;
 private String caraBernafas;
 
 public void Hewan(){
     System.out.println("Ini konstruktor hewannnnnnnn");
 }
 
 public void IniHewan(){
     System.out.println("Ini super hewannnnnnnn");
 }

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the caraBernafas
     */
    public String getCaraBernafas() {
        return caraBernafas;
    }

    /**
     * @param caraBernafas the caraBernafas to set
     */
    public void setCaraBernafas(String caraBernafas) {
        this.caraBernafas = caraBernafas;
    }
}

