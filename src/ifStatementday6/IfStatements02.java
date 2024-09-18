package ifStatementday6;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        //mod,macilis operatoru
       /* Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Cift sayi");

        }

        if (num % 2 != 0){ //num % 2 == 1 de yazilabilir.
            System.out.println("Tek sayi");

        }

        //----------------2.yol
        //if - else Statements

        if (num % 2 ==0){ //kosul kontrolu(condition) deyince paranteze bakariz.
            System.out.println("Sayi cifttir");


        }else { //Burda kosul kontrolu yok(parantez yok)
            System.out.println("Sayi tektir");
        }

       //_________________
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day name");
        String dayName = input.next();

        if (dayName.equals("Saturday")  || dayName.equals("Sunday")){
            System.out.println("Weekend");
        }else if(dayName.equals("Monday") ||
               dayName.equals("Tuesday") ||
               dayName.equals("Wednesday")  ||
               dayName.equals("Thursday")   ||
               dayName.equals("Friday")) {
            System.out.println("Weekday");
        }else{
            System.out.println("Enter a valid day name");
        }


    }
}
