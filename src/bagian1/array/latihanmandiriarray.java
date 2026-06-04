package bagian1.array;

public class latihanmandiriarray {
    public static void main(String[] args){
        double[] suhu = {31.5, 32.0, 34.7, 30.0, 35.0, 38.0};
        double max = suhu[0];
        double min = suhu[0];
        
        for(double s:suhu){
            if(s > max){
                max = s;
            }
            if(s < min){
                min = s;
            }
        }
        
        System.out.println("Suhu tertinggi : " + max);
        System.out.println("Suhu terendah : " + min);
                      
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        for(String h:hari){
            if(h.length() > 5){
                System.out.println(h);
            }
        }
        
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        
        for(int a:angka){
            if(a % 2 == 0){
                genap++;
            }
        }
        System.out.println("Jumlah Angka Genap : " + genap);
    }
}
