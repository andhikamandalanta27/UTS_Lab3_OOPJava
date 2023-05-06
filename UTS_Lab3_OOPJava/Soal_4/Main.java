package Soal_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih rumus yang ingin digunakan:");
        System.out.println("1. Hukum Newton");
        System.out.println("2. Persamaan Kuadrat");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Masukkan massa: ");
                double massa = scanner.nextDouble();
                System.out.println("Masukkan percepatan: ");
                double percepatan = scanner.nextDouble();

                Fisika hukumNewton = new Fisika(massa, percepatan);
                double hasilNewton = hukumNewton.hitungResult();
                System.out.println("Hasil rumus Hukum Newton: " + hasilNewton);
                break;

            case 2:
                System.out.println("Masukkan nilai a: ");
                double a = scanner.nextDouble();
                System.out.println("Masukkan nilai b: ");
                double b = scanner.nextDouble();
                System.out.println("Masukkan nilai c: ");
                double c = scanner.nextDouble();

                Matematika persamaanKuadrat = new Matematika(a, b, c);
                double[] hasilKuadrat = persamaanKuadrat.hitungResult();
                if (hasilKuadrat == null) {
                    System.out.println("Persamaan tidak memiliki akar real.");
                } else if (hasilKuadrat.length == 1) {
                    System.out.println("Persamaan memiliki satu akar real: " + hasilKuadrat[0]);
                } else {
                    System.out.println("Persamaan memiliki dua akar real: " + hasilKuadrat[0] + ", " + hasilKuadrat[1]);
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}