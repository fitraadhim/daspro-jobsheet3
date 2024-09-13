import java.util.Scanner;
public class PROJECTicvvn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas; 
        byte absen; 
        double nilaiKuis, nilaiTugas, UTS, nilaiAkhir, UAS; 

        System.out.print("Masukkan nama: "); 
        nama = sc.nextLine(); 
        System.out.print("Masukkan NIM: "); 
        nim = sc.nextLine(); 
        System.out.print("Masukkan kelas: "); 
        kelas = sc.nextLine().charAt(0); 
        System.out.print("Masukkan nomor absen: "); 
        absen = sc.nextByte(); 
        System.out.print("Masukkan nilai kuis: "); 
        nilaiKuis = sc.nextDouble(); 
        System.out.print("Masukkan nilai tugas: "); 
        nilaiTugas = sc.nextDouble(); 
        System.out.print("Masukkan nilai UTS: "); 
        UTS = sc.nextDouble(); 
        System.out.print("Masukkan nilai UAS: ");
        UAS = sc.nextDouble();
        nilaiAkhir = ((nilaiKuis * 20/ 100)  + (nilaiTugas * 15 / 100)  + (UTS * 30 / 100) + (UAS * 35 / 100)); 
        System.out.println("Nama: " + nama + " NIM: " + nim); 
        System.out.println("Kelas: " + kelas + " Absen: " + absen); 
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
