public class Mahasiswa {
    String nim, nama, prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + "\n");
        System.out.println("Nama: " + nama + "\n");
        System.out.println("Prodi: " + prodi + "\n");
    }
}