import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/

        double km, kmBTl = 2.20, tAcU = 10, mOT = 20, toplamTutar;
        /* Km = gidilen kilometre, kmBTl = Kilometre başına fiyat
           tAcu = Taksimetre Açılış ücreti, mOT= Toplam tutarın 20 Tl'nin altında kalması durumunda minimum ödeme
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Yolculuğunuzun Kaç Lira Tutacağını Öğrenmek İçin, Gideceğiniz Toplam KM'yi Yazınız...");

        System.out.print("Taksi ile kaç KM yol gidecceksiniz? :");
        km = input.nextDouble();

        toplamTutar = tAcU + (km * kmBTl);
        mOT =  toplamTutar <= 20 ? mOT : toplamTutar;

        System.out.print("Toplam Tutar :" + mOT + "TL");


    }
}