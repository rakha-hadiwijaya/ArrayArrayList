package bagian2.arraylist;

import java.util.ArrayList;

public class latihanmandiriarraylist {
    public static void main(String[] args){
        ArrayList<String> daftarbelanja = new ArrayList<>();
        daftarbelanja.add("Roti");
        daftarbelanja.add("Selai");
        daftarbelanja.add("Biskuit");
        daftarbelanja.add("Susu");
        
        System.out.println("List daftar belanja awal : " + daftarbelanja);
        
        daftarbelanja.remove("Selai");
        System.out.println("List setelah item kedua dihapus : " + daftarbelanja);
        
        System.out.println("Jumlah daftar belanja : " + daftarbelanja.size());
                
        ArrayList<Integer> angka = new ArrayList<>();        
        angka.add(5);
        angka.add(10);
        angka.add(15);
        angka.add(20);
        angka.add(25);
        
        int terbesar = angka.get(0);
        
        for(int a:angka){
            if(a>terbesar){
                terbesar = a;
            }
        }
        
        System.out.println("Nilai terbesar : " + terbesar);
        
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Citra");
        nama.add("Ayu");
        nama.add("Adit");
        nama.add("Tya");
        
        System.out.println("Nama yang diawali dengan huruf A : ");
        
        for(String n:nama){
            if(n.startsWith("A")){
                System.out.println(n);
            }
        }                
    }
}