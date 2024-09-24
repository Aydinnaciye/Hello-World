package d11loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicininverdigi sayi icin carpim tablosunu olusturup konsola yazdiriniz
        //3 ==> 3x1=3
        //3x2=6
        //.....

        Scanner input =new Scanner(System.in);
        System.out.println("Carpim tablosunu görmek icin bir sayi giriniz");
        int num =input.nextInt();
        int i=1;

        while (i<11){
            System.out.println(num +"x" +i + " = " + (num * i));
            i++;
        }
    }
}
