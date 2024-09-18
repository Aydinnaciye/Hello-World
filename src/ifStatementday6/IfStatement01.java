package ifStatementday6;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya göre yazdiran kodu yaziniz
        0-4 dahil==> Bebek
        5-12 dahil==>Cocuk
        13-20 dahil==Genc
        21-30 dahil==>Yetiskin
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Gecerli bir yas giriniz");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis yas");
        }
    }
}