/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanKedua;

/**
 *
 * @author Salwa Faizah
 */
public class Utama {

    public static void main(String[] args) {

        Kucing comel = new Kucing();
        System.out.println("aku kucing " + comel.getRas() + ", bulu ku berwarna " + comel.getWarnaBulu()
                +", kaki ku ada " +comel.getJumlahKaki());
        System.out.println("");
        
        Hewan miaw = (Hewan) comel;
        System.out.println("Aku kochengg berkaki " + miaw.getJumlahKaki() 
                +", aku bernafas loohhh " +miaw.getCaraBernafas());
        
        System.out.println("");
        
        
        
        //ini interface
        
        HewanPeliharaan dino = new HewanPeliharaan();
        dino.menanam();
        dino.ngarit();
        dino.memanen();
    }
}
