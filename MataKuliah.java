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

    void tampilMatakuliah() {
        System.out.println("Kode Mata Kuliah : " + this.kodeMK);
        System.out.println("Nama Mata Kuliah : " + this.namaMK);
        System.out.println("SKS              : " + this.sks);
    }
}
