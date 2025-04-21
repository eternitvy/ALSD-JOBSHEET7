public class MataKuliah {
    String kodeMK, namaMK;
    int sks;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    MataKuliah[] listMK = new MataKuliah[3];
    int idx;

    void tambah(MataKuliah mk) {
        if (idx < listMK.length) {
            listMK[idx] = mk;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilMatakuliah() {
        System.out.println("Kode Mata Kuliah : " + this.kodeMK);
        System.out.println("Nama Mata Kuliah : " + this.namaMK);
        System.out.println("SKS              : " + this.sks);
    }

    void tampilDataMK() {
        for (MataKuliah mk : listMK) {
            mk.tampilMatakuliah();
            System.out.println();
        }
    }
}