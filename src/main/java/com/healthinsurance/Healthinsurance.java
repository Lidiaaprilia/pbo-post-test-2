/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.healthinsurance;

/**
 *
 * @author Lidia
 */
import data.Member;
import data.HealthFacility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Healthinsurance {
    

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        List<HealthFacility> healthFacilities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==============================================");
            System.out.println("Selamat datang di Aplikasi Asuransi Prudential");
            System.out.println("==============================================");
            System.out.println("Menu:");
            System.out.println("1. Daftar Keanggotaan Baru");
            System.out.println("2. Edit Keanggotaan");
            System.out.println("3. Hapus Keanggotaan");
            System.out.println("4. Tambah Fasilitas Kesehatan");
            System.out.println("5. Tampilkan Data Anggota");
            System.out.println("6. Tampilkan Fasilitas Kesehatan");
            System.out.println("7. Keluar");
            System.out.println("==============================================");
            System.out.print("Silahkan pilih opsi menu (1/2/3/4/5/6/7): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah angka

            switch (choice) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("Silahkan masukkan data anggota yang ingin didaftarkan");
                    System.out.println("");
                    System.out.print("Nama Anggota: ");
                    String name = scanner.nextLine();
                    System.out.print("ID Anggota: ");
                    String memberID = scanner.nextLine();
                    Member member = new Member(name, memberID);
                    members.add(member);
                    System.out.println("");
                    System.out.println("Daftar keanggotaan baru berhasil ditambahkan.");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("==============================================");
                    System.out.println("Silahkan masukkan data anggota yang ingin diedit");
                    System.out.println("");
                    System.out.print("Masukkan ID Anggota yang akan diedit: ");
                    String editID = scanner.nextLine();
                    for (Member m : members) {
                        if (m.getMemberID().equals(editID)) {
                            System.out.print("Nama Baru: ");
                            String newName = scanner.nextLine();
                            m.setName(newName);
                            System.out.println("");
                            System.out.println("Edit keanggotaan berhasil.");
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("==============================================");
                    System.out.println("Silahkan masukkan data anggota yang ingin dihapus");
                    System.out.println("");
                    System.out.print("Masukkan ID Anggota yang akan dihapus: ");
                    String deleteID = scanner.nextLine();
                    members.removeIf(m -> m.getMemberID().equals(deleteID));
                    System.out.println("");
                    System.out.println("Hapus keanggotaan berhasil.");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("==============================================");
                    System.out.println("Silahkan masukkan nama fasilitas yang diinginkan");
                    System.out.println("*PRUPrime*");
                    System.out.println("*PRUSolusi*");
                    System.out.println("");
                    System.out.print("Nama Fasilitas Kesehatan: ");
                    String facilityName = scanner.nextLine();
                    System.out.println("");
                    System.out.println("Silahkan masukkan jenis fasilitas yang diinginkan");
                    System.out.println("**Asuransi Kesehatan**");
                    System.out.println("**Asuransi Jiwa**");
                    System.out.println("");
                    System.out.print("Jenis Fasilitas: ");
                    String facilityType = scanner.nextLine();
                    HealthFacility healthFacility = new HealthFacility(facilityName, facilityType);
                    healthFacilities.add(healthFacility);
                    System.out.println("");
                    System.out.println("Fasilitas Kesehatan berhasil ditambahkan.");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("==============================================");
                    System.out.println("");
                    System.out.println("Daftar Anggota:");
                    for (Member m : members) {
                        System.out.println("Nama: " + m.getName() + ", ID: " + m.getMemberID());
                    }
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("==============================================");
                    System.out.println("");
                    System.out.println("Daftar Fasilitas Kesehatan:");
                    System.out.println("");
                    for (HealthFacility facility : healthFacilities) {
                        System.out.println("Nama Fasilitas: " + facility.getFacilityName() + ", Jenis: " + facility.getFacilityType());
                    }
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}



    

