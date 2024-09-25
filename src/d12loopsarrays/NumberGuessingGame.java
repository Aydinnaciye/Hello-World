package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Örnek:0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasinda rasgele bir sayi üretelim.
        int rastgeleSayi = random.nextInt(101);//0 ile 100 arasinda bi sayi ürettik.


        //Odev:20 dahil ile 100 dahil  arasinda random sayi istenseydi?

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim.
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim.
        int tahminEdilen; //Baslangic degerini kullanici girecek.

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol icin bir boolean degisken olusturalim.
        boolean tahminDogrumu = false;

        //___________________________

        System.out.println("0-100 arasinda bir sayi tahmin etmeye calisin");

        do {
            //Kullanicidan tahmin alalim
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen =scanner.nextInt();
            //sayaci 1 artiralim

            denemeSayisi++;

            //Tahmini kontrol edelim
            if (tahminEdilen < rastgeleSayi){
                System.out.println("Sayi daha büyük");

            }else if (tahminEdilen >rastgeleSayi){
                System.out.println("Sayi daha kücük");
            }else{
                tahminDogrumu =true;
                System.out.println("Tebrikler dogru tahmin");
                System.out.println("Deneme sayisi :"+ denemeSayisi);

            }


        }while(!tahminDogrumu);//Döngü dogru tahmin yapincaya kadar devam edecek.
        scanner.close();
    }
}
