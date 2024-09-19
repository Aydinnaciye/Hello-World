package day08_nestedTernary;

import java.util.Scanner;

public class C07_SwitchCase {

    public static void main(String[] args) {

        //J:Java
        // D:Development
        // K:Kit
        //Kullanıcıdan bir harf alın.
        //Alınan harf JDK dan biri ise yukarıdakı kelimeleri yazdırın
        //Bu harflerden biri degilse  "Gecersiz harf " yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char harf= scan.next().charAt(0);

        switch (harf){

            case 'J' :
            case 'j':
                    System.out.println("Java");
                    break;
            case 'D':
            case 'd':
                        System.out.println("Development");
                        break;
            case 'K':
            case 'k':
                            System.out.println("Kit");
            default:
                System.out.println("Gecersiz harf");



        }
    }
}
