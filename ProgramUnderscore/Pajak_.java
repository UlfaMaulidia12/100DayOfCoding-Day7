package ProgramUnderscore;

import java.util.Scanner;

public class Pajak_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Program Angka ===");

            int angka = getInput("Masukkan angka: ");
            
            System.out.println("Angka yang Anda masukkan: " + angka);

            // Operasi matematika sederhana (contoh: kuadrat)
            int kuadrat = calculateSquare(angka);
            System.out.println("Kuadrat angka: " + kuadrat);

            ulangi = getYesNoInput("Ingin memasukkan angka lagi? (Y/N): ");
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }

    private static int getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    private static int calculateSquare(int angka) {
        return angka * angka;
    }

    private static char getYesNoInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.next().charAt(0);
    }
}
