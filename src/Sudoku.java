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
public class Sudoku {

    public static void printData(int[][] kotak) {
        System.out.println("-------------------------------------");
        for (int i = 0; i < 9; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(kotak[i][j] + " | ");
            }

            if ((i + 1) % 3 == 0) {
                System.out.println("");
                System.out.print("-------------------------------------");
            }
            System.out.println(" ");
        }
    }

    public static void hitung(int[][] kotak) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (kotak[i][j] == 0) {
                    int temp = 1;
                    //cek Kesamping
                    for (int q = 0; q < 9; q++) {

                        if (kotak[i][q] == temp) {
                            temp++;
                            q = -1;
                        }

                    }
                    //cek kebawah
                    for (int k = 0; k < 9; k++) {
                        if (kotak[k][j] == temp) {
                            temp++;
                            k = -1;
                            //cek ulg samping
                            for (int q = 0; q < 9; q++) {

                                if (kotak[i][q] == temp) {
                                    temp++;
                                    q = -1;
                                }

                            }
                        }
                    }
                    if (j == 0 || j == 3 || j == 6) {
                        if (i == 0 || i == 3 || i == 6) {
                            for (int g = (i + 1); g < (i + 1); g++) {
                                for (int h = j + 1; j < j + 2; h++) {
                                    if (kotak[g][h] == temp) {
                                        temp++;
                                        h = j;
                                    }

                                }
                            }

                            kotak[i][j] = temp;

                        } else if (i == 1 || i == 4 || i == 7) {
                            for (int g = i - 1; g < i + 1; g += 2) {
                                for (int h = j + 1; h <= j + 2; h++) {
                                    if (kotak[g][h] == temp) {
                                        temp++;
                                        h = j;
                                        for (int k = 0; k < 9; k++) {
                        if (kotak[k][j] == temp) {
                            temp++;
                            k = -1;
                            //cek ulg samping
                            for (int q = 0; q < 9; q++) {

                                if (kotak[i][q] == temp) {
                                    temp++;
                                    q = -1;
                                }

                            }
                        }
                    }
                                    }
                                }
                            }
                            kotak[i][j] = temp;
                        } else if (i == 2 || i == 5 || i == 8) {
                            for (int g = i - 2 ; g < i ;g++) {
                                for (int h = j + 1; h <= j + 2; h++) {
                                    if (kotak[g][h] == temp){
                                        temp++;
                                        h = j;
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] kotak = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 1, 9, 5, 0, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        hitung(kotak);
        printData(kotak);
    }
}
