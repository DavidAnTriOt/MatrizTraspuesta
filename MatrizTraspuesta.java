/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriztraspuesta;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class MatrizTraspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de filas de la primera matriz: ");
        int f1 = sc.nextInt();
        System.out.println("Digite el numero de columnas de la primera matriz: ");
        int c1 = sc.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("-------------La matriz es de: " + f1 + " x " + c1 + "---------------");
        System.out.println("--------------------------------------------------");

        int[][] matriz1 = new int[c1][f1];
        int[][] matrizRes = new int[f1][c1];
        //MATRIZ
        System.out.println("DIGITA LOS DATOS DE LA MATRIZ\n");
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Digite los valores de las coordenadas " + i + "," + j + ":");
                matriz1[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }
        //MATRIZ TRASPUESTA  
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                matrizRes[j][i] = matriz1[i][j];
            }
        }
        System.out.println("-------------LA MATRIZ TRASPUESTA ES:-------------");
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < f1; j++) {
                System.out.print(matrizRes[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
