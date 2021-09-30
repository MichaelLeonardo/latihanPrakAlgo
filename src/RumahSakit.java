/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author PauL
 */
public class RumahSakit {
    public static void main(String[] args) {
        int menu = 0 ;
        String nama = " ";
        String alamat = " ";
        String umur = " ";
        String diagnosa= " ";
        String obat= " ";
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1. Daftar Pasien \n2. Diagnosis\n3. Obat\n4.Print Data Pasien \n5. Exit"));
            if(menu == 1){
                nama = JOptionPane.showInputDialog("Masukan Nama Pasien : ");
                alamat = JOptionPane.showInputDialog("Masukan Alamat Pasien : ");
                umur = JOptionPane.showInputDialog("Masukan umur Pasien : ");
            }   else if (menu == 2){
                    diagnosa = JOptionPane.showInputDialog("Masukan Diagnosa Dokter : ");
            }   else if (menu == 3){
                    obat = JOptionPane.showInputDialog("Masukan obat : ");
            }   else if(menu == 4){
                      System.out.println("nama : " + nama);
                      System.out.println("alamat : " + alamat);
                      System.out.println("umur : " + umur);
                      System.out.println("diagnosa : " + diagnosa);
                      System.out.println("obat : " + obat);
            }
        }while(menu != 5);
    }
}
