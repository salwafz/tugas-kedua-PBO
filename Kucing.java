/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanKedua;

/**
 *
 * @author Salwa Faizah
 */
public class Kucing extends Hewan {
    private String ras;
    private String warnaBulu;

    public Kucing(){
        System.out.println("ini dari konsssssss Meowwwwwwwww");
        this.setRas("anggora");
        this.setWarnaBulu("putih");
        super.setJumlahKaki(4);
        super.setCaraBernafas("dengan paru-paru");
    }
    /**
     * @return the ras
     */
    public String getRas() {
        return ras;
    }

    /**
     * @param ras the ras to set
     */
    public void setRas(String ras) {
        this.ras = ras;
    }

    /**
     * @return the warnaBulu
     */
    public String getWarnaBulu() {
        return warnaBulu;
    }

    /**
     * @param warnaBulu the warnaBulu to set
     */
    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
}
