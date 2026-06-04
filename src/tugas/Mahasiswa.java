package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }
    
    public boolean lulus(){
        return nilai >= 60;
    }
    
    public String info(){
        String status = lulus()? "Lulus" : "Tidak Lulus";
        return nama + " | " + npm + " | Nilai : " + nilai + " | " + status;
    }
}
