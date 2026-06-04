package bagian2.arraylist;

import java.util.ArrayList;

public class latihan3 {
    public static void main(String[] args){
        ArrayList<String> mahasiswa = new ArrayList<>();
        
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");
        
        System.out.println("Isi List : " + mahasiswa);
        System.out.println("Jumlah : " + mahasiswa.size());
        System.out.println("Index : " + mahasiswa.get(1));
    }
}
