import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        Mahasiswa m1 = new Mahasiswa("22001", "Ali Rahman", "TI");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi Santoso", "TI");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra Dewi", "TI");

        mahasiswa.tambah(m1);
        mahasiswa.tambah(m2);
        mahasiswa.tambah(m3);

        MataKuliah mataKuliah = new MataKuliah();
        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Design Web", 2);

        mataKuliah.tambah(mk1);
        mataKuliah.tambah(mk2);
        mataKuliah.tambah(mk3);

        Penilaian penilaian = new Penilaian();
        Penilaian p1 = new Penilaian(m1, mk1, 80, 85, 90);
        Penilaian p2 = new Penilaian(m1, mk2, 60, 75, 70);
        Penilaian p3 = new Penilaian(m2, mk1, 75, 70, 80);
        Penilaian p4 = new Penilaian(m3, mk2, 85, 90, 95);
        Penilaian p5 = new Penilaian(m3, mk3, 80,90, 65);

        penilaian.tambah(p1);
        penilaian.tambah(p2);
        penilaian.tambah(p3);
        penilaian.tambah(p4);
        penilaian.tambah(p5);

        int pilihan;

        do {
            System.out.println("------------------------------------------------------");
            System.out.println("| 1. Tampilkan Data Mahasiswa                        |");
            System.out.println("| 2. Tampilkan Data Mata Kuliah                      |");
            System.out.println("| 3. Tampilkan Data Penilaian                        |");
            System.out.println("| 4. Urutan Mahasiswa Berdasarkan Nilai Akhir        |");
            System.out.println("| 5. Cari Data Penilaian Mahasiswa Berdasarkan NIM   |");
            System.out.println("| 6. Keluar                                          |");
            System.out.println("------------------------------------------------------");
            System.out.println();
            System.out.print("Pilih Opsi: ");
            pilihan = sc.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("=== DATA MAHASISWA ===");
                    System.out.println();
                    mahasiswa.tampilDataMhs();
                    break;

                case 2:
                    System.out.println("=== DATA MATA KULIAH ===");
                    System.out.println();
                    mataKuliah.tampilDataMK();
                    break;

                case 3:
                    System.out.println("=== DATA PENILAIAN MAHASISWA ===");
                    System.out.println();
                    penilaian.tampilDataNilai();
                    break;

                case 4:
                    System.out.println("=== DATA MAHASISWA BERDASARKAN NILAI AKHIR (DESC) ===");
                    System.out.println();
                    penilaian.urutanNilaiAkhir();
                    penilaian.tampilDataNilai();
                    break;

                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nim = sc.next();
                    System.out.println();
                    penilaian.cariDataPenilaianBerdasarkanNim(nim);
                    break;

                case 6:
                    System.out.println("Program Selesai.");
                    break;
            
                default:
                    System.out.println("Pilihan Invalid!");
            }

            System.out.println();

        }
        while (pilihan != 6);
        sc.close();
    }
}