package d9string_loops;

public class StringManipulations02 {
    public static void main(String[] args) {

    /*Ornek1: bir stringdeki tekrarsiz karakterleri ekrana yan yana yazdiriniz
    yusuf ==> ysf
    String s= "yusuf";
    indexOf()
    lastIndexOf()
    indexOf("u") ==> 1 farkli tekrarli
    lastIndexOf("u") ==> 3

    indexOf("y") ==>0 ayni tektatsiz
    lastIndexOf("y") ==>0


*/

       String s="yusuf";

       if(s.indexOf("y") == s.lastIndexOf("y")){
           System.out.println("y");
       }
       if (s.indexOf("u") ==s.lastIndexOf("u")) {
           System.out.println("u");
       }
       if(s.indexOf("s")==s.lastIndexOf("s")){
           System.out.println("s");
       }
       if (s.indexOf("f")==s.lastIndexOf("f")){
           System.out.println("f");
       }

        //Ornek: Bir banka kartinin son 4 hanesi haric tüm hanelerini '*' kullanarak görünmez yapin
        // 12345678901234 ==> ***************

        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0,15).replaceAll("[0-9]",  "*");
        System.out.println(first);//**** **** ****

        String last = cardNum.substring(15);
        System.out.println(last);//6789

        String  result1 =first + last;
        System.out.println(result1);//**** **** **** 6789

        String result2 =first.concat(last);
        System.out.println(result2);//**** **** **** 6789
    }
    }

