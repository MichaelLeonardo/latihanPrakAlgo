/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author PauL
 */
public class rekrusif {
    //public static int Faktorial(int angka){

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalJam = 7;
        int bayar = 0;
        int a,b;
       
// boolean cari = Boolean.parseBoolean(JOptionPane.showInputDialog("Masukan Status "));
        int tahun = scan.nextInt();
        boolean menikah = scan.nextBoolean();
        if (totalJam <= 1) {
            bayar = 2000;
        } else {
            bayar = 2000 + ((totalJam - 1) * 1500);
            if (bayar > 15000) {
                bayar = 15000;
            }
        }
            
        System.out.println("Hasil : " + bayar);
        
        
        double c = (Math.sqrt(a = 3) + Math.sqrt( b = 4));
    }
}
