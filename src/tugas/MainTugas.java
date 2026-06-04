//Nama : Gusti Muhammad Rakha Hadiwijaya
//NPM : 2410010221

package tugas;

public class MainTugas {
    public static void main(String[] args){
        String[] mataKuliah ={
            "Pemrograman Berbasis Objek",
            "Sistem Informasi Geografis",
            "Basis Data"
        };
        
        System.out.println("== Mata Kuliah ==");
        
        for(String mk:mataKuliah){
            System.out.println("- " + mk);
        }
        
        System.out.println();
        
        KelasKuliah kelas = new KelasKuliah();
        
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "221001", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "221002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Tya", "221004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "221003", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "221005", 50));
        
        kelas.tampilkanSemua();
        
        System.out.println();
        System.out.println("Rata-rata nilai : " + kelas.hitungRata());
        System.out.println("Jumlah lulus : " + kelas.jumlahLulus());
        
        System.out.println();
        
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "221006", 75));
        
        System.out.println("Jumlah mahasiswa terbaru : " + kelas.jumlahMahasiswa());
    } 
}
