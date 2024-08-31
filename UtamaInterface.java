/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanKedua;

/**
 *
 * @author Salwa Faizah
 */
public class UtamaInterface implements berkebun, berternak, bertani {

    @Override
    public void menanam() {
        System.out.println("Aku menanam Ubi");
    }

    @Override
    public void ngarit() {
        System.out.println("aku ngarit rumput");
    }

    @Override
    public void memanen() {
        System.out.println("aku memanen padi");
    }

}
