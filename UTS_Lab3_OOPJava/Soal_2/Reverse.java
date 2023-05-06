package Soal_2;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int opsi;

        do {
            System.out.print("Masukkan sebuah kata atau kalimat: ");
            input = scanner.nextLine();

            System.out.println("Pilih opsi:");
            System.out.println("1. Reverse per huruf");
            System.out.println("2. Reverse per kata");

            opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    String hasilPerHuruf = reversePerHuruf(input);
                    System.out.println("Hasil balik per huruf: " + hasilPerHuruf);
                    break;
                case 2:
                    String hasilPerKata = reversePerKata(input);
                    System.out.println("Hasil balik per kata: " + hasilPerKata);
                    break;
                default:
                    System.out.println("Opsi tidak valid");
            }

            System.out.print("Apakah ingin membalikkan input lagi? (y/n) ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        scanner.close();
    }

    public static String reversePerHuruf(String input) {
        StringBuilder sb = new StringBuilder(input.length());

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public static String reversePerKata(String input) {
        String[] kata = input.split(" ");
        StringBuilder sb = new StringBuilder(input.length());

        for (int i = kata.length - 1; i >= 0; i--) {
            sb.append(kata[i]).append(" ");
        }

        return sb.toString().trim();
    }
}