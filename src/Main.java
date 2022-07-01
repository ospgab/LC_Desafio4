/*
Una dois arrays de inteiros em um unico array

Regras:

    Nao é permitido uso de Collections ou java.util.Arrays
    Nao é permitido uso de arrays temporários, com exceçao do arrayConsolidado

Ex.: ENTRADA

    [1, 3, 5, 7]
    [2, 4, 6, 8, 12, 15]

SAIDA

    [1, 2, 3, 4, 5, 6, 7, 8, 12, 15]

public static void juntarArrays(int[] array1, int[] array2, int[] arrayConsolidado)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 3, 5, 7};
        int[] array2 = new int[] {2, 4, 6, 8, 12, 15};

        int tamanho = array1.length + array2.length;

        int[] arrayConsolidado = new int[tamanho];

        int contador;
        for(contador = 0; contador<array1.length; contador++){
            arrayConsolidado[contador] = array1[contador];
        }
        for(int i = 0; i<array2.length; i++){
            arrayConsolidado[contador] = array2[i];
            contador++;
        }

        System.out.printf("[%d", arrayConsolidado[0]);
        for(int i = 1; i < arrayConsolidado.length; i++){
            System.out.print(", " + arrayConsolidado[i]);
        }
        System.out.print("]");
    }
}