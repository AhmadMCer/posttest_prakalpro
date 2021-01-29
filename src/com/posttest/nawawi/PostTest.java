package com.posttest.nawawi;
import java.util.Scanner;

public class PostTest {
    public static void main(String[] args) {
        // Inisiasi scanner
        Scanner read = new Scanner(System.in);

        // Inisiasi variabel
        String namaPetugas, namaPelanggan, kodeTujuan, kodePaket, tanggalKeberangkatan;
        float harga = 1, biayaPajak = 1, totalBiaya = 1;

        // Bagian Input
        System.out.println("===> Struk Pembayaran Terminal Jaya <===\n");
        System.out.print("Masukkan Nama Petugas\t: ");
        namaPetugas = read.nextLine();
        System.out.print("Masukkan Nama Pelangan\t: ");
        namaPelanggan = read.nextLine();
        System.out.print("Masukkan Kode Tujuan (JGJ, SMR, JKT)\t: ");
        kodeTujuan = read.nextLine();
        System.out.print("Masukkan Kode Paket (S / K / R)\t: ");
        kodePaket = read.nextLine();
        System.out.print("Masukkan Tanggal Keberangkatan\t: ");
        tanggalKeberangkatan = read.nextLine();

        // Bagian Process
        switch (kodeTujuan) {
            case "JGJ":
                switch (kodePaket) {
                    case "S":
                        harga = 150000;
                        biayaPajak = harga * 2.5f / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                    case "K":
                        harga = 500000;
                        biayaPajak = harga * 5 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                    case "R":
                        harga = 1000000;
                        biayaPajak = harga * 10 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                }
                break;
            case "SMR":
                switch (kodePaket) {
                    case "S":
                        harga = 200000;
                        biayaPajak = harga * 3 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                    case "K":
                        harga = 700000;
                        biayaPajak = harga * 6 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                    case "R":
                        harga = 1300000;
                        biayaPajak = harga * 12 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                }
                break;
            case "JKT":
                switch (kodePaket) {
                    case "S":
                        harga = 350000;
                        biayaPajak = harga * 4 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                    case "K":
                        harga = 1200000;
                        biayaPajak = harga * 8 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                    case "R":
                        harga = 2300000;
                        biayaPajak = harga * 12 / 100;
                        totalBiaya = harga + biayaPajak;
                        break;
                }
                break;
        }

        // Bagian Output
        System.out.println("\n===> Struk Pembayaran Terminal Jaya <===\n");
        System.out.println("Nama Petugas\t\t\t: " + namaPetugas);
        System.out.println("Nama Pelanggan\t\t\t: " + namaPelanggan);
        System.out.println("Tanggal Keberangkatan\t: " + tanggalKeberangkatan);
        System.out.println("Tujuan\t\t\t\t\t: " + kodeTujuan);
        System.out.println("Paket\t\t\t\t\t: " + kodePaket);
        System.out.println("Harga\t\t\t\t\t: " + harga);
        System.out.println("Biaya Pajak\t\t\t\t: " + biayaPajak);
        System.out.println("Total Biaya\t\t\t\t: " + totalBiaya);
    }
}
