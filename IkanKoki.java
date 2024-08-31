/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanKedua;

/**
 *
 * @author Salwa Faizah
 */
public class IkanKoki extends Hewan {
    private String jenis;
    private String warnaKulit;

    public IkanKoki(){
        System.out.println("Ini dari kons Ikan Koiiiii");
        this.setJenis("Ikan Hias");
        this.setWarnaKulit("Orange");
        super.setCaraBernafas("dengan insang");
    }
    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the warnaKulit
     */
    public String getWarnaKulit() {
        return warnaKulit;
    }

    /**
     * @param warnaKulit the warnaKulit to set
     */
    public void setWarnaKulit(String warnaKulit) {
        this.warnaKulit = warnaKulit;
    }
}
