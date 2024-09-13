import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlroti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, nominalBayar, totalHarga;
        float diskon = 10 / 100f;
        byte totalByte; 
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembeli kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlroti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlroti * hargaRoti);
        totalByte = (byte) totalHarga;
        nominalBayar = totalHarga - (diskon * totalHarga);
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlTeh + " teh, " + jmlroti + " roti, ");
        System.out.println("Nominal bayar Rp " + totalByte);
    }
}
