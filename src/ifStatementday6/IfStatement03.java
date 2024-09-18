package ifStatementday6;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //if - else if - else Statement

      /*  if (){

        }else if (){

        }else if (){

        }else{

        } */

        //Ornek:Kullanicidan alinan bir sayinin pozitif, negatif ya da nötr oldugunu kontrol eden kodu yaziniz.
        //Kullanicidan deyince scanner kullaniriz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        int num = scanner.nextInt();

        if (num > 0){
            System.out.println(num + " sifirdan büyüktür");

        }else if (num < 0){
            System.out.println(num +" sifirdan kücüktür");

        }else{
            System.out.println(num +" notürdür");

        }

    }

    public static class IfStatement01 {

        public static void main(String[] args) {

            //if statements
            if (3 < 5) {  //parantez kosul kontrolu demek
                System.out.println("condition dogru ,if calisti");

           /* if (7<5){
                System.out.println("condition dogru,if calisti");//if calismaz.False,asagida hicbirsey görünmez.
           }
           */
            }
            //--------------------
            if (7 == 4 + 3) {
                System.out.println("condition dogru, if calismistir");
            }

            //Example 1:Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana  "Rakam" yazdirin.

            int num = 7;

            if (num> -1 && num <10) { //>= de yazilabilir(birinciye)
                System.out.println("Rakam");
            }
            //___________________________
            //Örnek 2: Sayi 3 basamakli ise  ekrana "Sayi uc basamaklidir" yazdirin.

            int n =123;
            if (n > 99 && n < 1000){
                System.out.println("Sayi uc basamaklidir");

            }
            //------------------------

        }
    }
}
