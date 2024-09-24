package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Ornek1: Verilen bir tamsayinin rakamlari toplamini consola yazdiriniz(Interview sorusu)

        //578 ==> 5+7+8=20 ==>Output 20 olmali.Sayiyi elde etme islemi mod ile Majiles % ile olur.

        int sum = 1; //carpmasi istenirse
        // int sum = 0;  //global denir
        for (int i = 578; i > 0; i = i / 10) { //i/=10 da yazilabilir en sona.
            // sum = sum + i % 10;
            sum = sum * (i % 10);   //carpmada

        }
        // System.out.println("sum =" +sum); //sum= 20
        System.out.println("sum =" + sum);   //280

        System.out.println("-----------------------");

        //Ornek2: Bir Stringdeki tekrarsiz karakterleri veren kodu yaziniz
        //Yusuf ==> Ysf

        String t = "Yusuf";
        String unique = "";   //global

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);   //index verdik, bize harfi verecek.
                   //indexOff ch=Y INDEXI 0 ==0==>true baska y olmadigi icin yine 0 olur
            if (t.indexOf(ch) == t.lastIndexOf(ch)) { //esitse tekrarsizdir
                unique = unique + ch;

            }
        }
            System.out.println("Tekrarsizdir :" + unique);    //Tekrarsizdir : Ysf
        }
    }
