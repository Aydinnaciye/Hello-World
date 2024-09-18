package ifStatementday6;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {

        //Ornek: Kullanicidan gün sayisini aldiginda gün ismini yazan kodu yaziniz
        // 1==>Sunday , 2==>Monday ...

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kacinci gün oldugunu giriniz");
       // int num = input.nextInt();
        double numDouble = input.nextDouble();
        int num = (int)numDouble; //Typecasting

        if (numDouble != num){
            System.out.println("Lütfen bir tam sayi giriniz");

        }else {
            if (num<=0) { //num<1 de yazilabilir
                System.out.println("Gün sayilari 1' den kücük olamaz");

            } else if (num==1) {
                System.out.println("Pazar");

            } else if (num==2) {
                System.out.println("Pazartesi");

            } else if (num==3) {
                System.out.println("Sali");

            } else if (num==4) {
                System.out.println("Carsamba");

            } else if (num==5) {
                System.out.println("Persembe");

            } else if (num==6) {
                System.out.println("Cuma");

            } else if (num==7) {
                System.out.println("Cumartesi");

            } else {
                System.out.println("Gün sayilari 7' den büyük olamaz");
            }

        }

    }
}