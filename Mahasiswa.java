public class Mahasiswa {
    String nim, nama, prodi;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Prodi  : " + prodi);
    }

    Mahasiswa[] listMhs = new Mahasiswa[3];
    int idx;
    
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDataMhs() {
        for (Mahasiswa m:listMhs) {
            m.tampilMahasiswa();
            System.out.println();
        }
    }
}

