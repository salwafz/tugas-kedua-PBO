/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanKedua;

/**
 *
 * @author Salwa Faizah
 */
public class HewanPeliharaan extends Hewan {
    private String jenisMakanan;
    private String caraBerproduksi;
    
    public HewanPeliharaan(){
        System.out.println("ini kons Peliharaann");
        this.setJenisMakanan("aku karnivora");
        this.setCaraBerproduksi("aku hewan vivipar");
        super.setJumlahKaki(4);
        super.setCaraBernafas("menggunakan paru-paru");
    }

    /**
     * @return the jenisMakanan
     */
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    /**
     * @param jenisMakanan the jenisMakanan to set
     */
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    /**
     * @return the caraBerproduksi
     */
    public String getCaraBerproduksi() {
        return caraBerproduksi;
    }

    /**
     * @param caraBerproduksi the caraBerproduksi to set
     */
    public void setCaraBerproduksi(String caraBerproduksi) {
        this.caraBerproduksi = caraBerproduksi;
    }
}
