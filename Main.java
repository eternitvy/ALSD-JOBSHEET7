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
                    mahasiswa.tampilDataMhs();
                    break;

                case 7:
                    System.out.println("Program Selesai.");
                    break;
            
                default:
                    System.out.println("Pilihan Invalid!");
            }

            System.out.println();

        }
        while (pilihan != 7);
        sc.close();
    }
}

