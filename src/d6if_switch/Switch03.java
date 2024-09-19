package d6if_switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*Örnek:
        Kullanicidan bir ay numarasi girmesini isteyin  (1 ile 12 arasinda).
        Girilen ay numarasina göre mevsimi belirleyen ve sonucu konsola yazdiran bir program yaziniz.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ay numarasini giriniz(1 -12)");
        int month = scanner.nextInt();

        String season =switch (month){
            case 12,1,2 -> "Kis";
            case 3,4,5  ->  "Ilkbahar";
            case 6,7,8  ->  "Yaz";
            case 9,10,11 -> "Sonbahar";
            default -> "Bilinmeyen ay";

        };
        System.out.println("Mevsim :" + season);
        scanner.close();//scanner objesi kapatildi
    }
}
