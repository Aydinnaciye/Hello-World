package d11loops;

import java.util.Scanner;

public class ForLoops04 {

    public static void main(String[] args) {

        /*Ornek 1:Asagida gördügünüz sekli consola yazdiran kodu yaziniz
                   sütun ic= column
                        x x x x x
       satir dis =row   x x x x x
                        x x x x x
         */

        //int row =3;
        // int column =5;
     /*   Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz" );
                int row=input.nextInt();

        System.out.println("Sütunsayisini veriniz");
        int column= input.nextInt();


         for (int i = 1; i<= row; i++){
             for (int k = 1; k<= column; k++){
                 System.out.print("x ");
             }
             System.out.println();//print yanyana yazar,pointeri bir alta aldik//x x x x x
             //                                                                  x x x x x
             //                                                                  x x x x x
             //ilk satiri yazdirinca diger satiri alta yazdirsin diye bos bir sout yazdik.
         }
         /*Odev:Asagidaki sekli for loop kullanarak yapiniz
        *
        * *
        * * *
        * * * *

*/

       //Scanner input = new Scanner(System.in);
       //System.out.println("Satir sayisini giriniz");
        //int row = input.nextInt();

       // System.out.println("Sütun sayisini giriniz");
        //int column =input.nextInt();
        int a=4;
        for (int i =1; i<= a; i++){
            for (int k =1; k<= i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


        }
    }

