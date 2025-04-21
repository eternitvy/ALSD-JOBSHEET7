public class Penilaian {
    
    int indeks = 0;

    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian() {
    }

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        this.nilaiAkhir = 0;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    Penilaian[] listNilai = new Penilaian[5];
    int idx;

    void tambah(Penilaian n) {
        if (idx < listNilai.length) {
            listNilai[idx] = n;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilPenilaian() {
        System.out.println("NIM          : " + mahasiswa.nim);
        System.out.println("Nama         : " + mahasiswa.nama);
        System.out.println("Prodi        : " + mahasiswa.prodi);
        System.out.println("Mata Kuliah  : " + mataKuliah.namaMK);
        System.out.println("Tugas        : " + nilaiTugas);
        System.out.println("UTS          : " + nilaiUTS);
        System.out.println("UAS          : " + nilaiUAS);
        System.out.println("Nilai Akhir  : " + nilaiAkhir);
        System.out.println();
    }

    void tampilDataNilai() {
        for (Penilaian n : listNilai) {
            n.tampilPenilaian();
            System.out.println();
        }
    }

    void urutanNilaiAkhir() {
        for (int i = 0; i < listNilai.length; i++) {
            for (int j = 1 ; j < listNilai.length - i; j++) {
                if (listNilai[j].nilaiAkhir > listNilai[j - 1].nilaiAkhir) {
                    Penilaian temp = listNilai[j];
                    listNilai[j] = listNilai[j - 1];
                    listNilai[j - 1] = temp;
                }
            }
        }
    }

    void cariDataPenilaianBerdasarkanNim(String nim) {
        boolean found = false;
    
        for (int i = 0; i < idx; i++) {
            if (listNilai[i].mahasiswa.nim.equalsIgnoreCase(nim)) {
                if (!found) {
                    System.out.println("-- DATA MAHASISWA DITEMUKAN --");
                    found = true;
                }
                listNilai[i].tampilPenilaian();
            }
        }
        
        if (!found) {
            System.out.println("Data Mahasiswa dengan NIM '" + nim + "' tidak ditemukan");
        }
    }
}