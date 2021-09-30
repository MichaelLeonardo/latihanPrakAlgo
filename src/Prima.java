/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PauL
 */
public class Prima {
    public static void main(String[] args) {
        int batas = 100;
        int angka = 0;
        while (angka != batas){
            if ((angka > 1 && angka == 2) || (angka % 2 != 0 && angka % 3 != 0)){
                System.out.print(angka + " " );
                angka++;
            }   else {
                angka++;
            }
        }
    }
}
