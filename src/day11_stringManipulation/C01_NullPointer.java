package day11_stringManipulation;

public class C01_NullPointer {

    public static void main(String[] args) {

        String str1= "";
        //str1' e deger atanmıstır.

        System.out.println(str1);//hiçlik
        System.out.println(str1.concat("Java")); //Java

        String str2;
        //str2 olusturuldu ama deger atanmadı
       // System.out.println(str2);// str2 ye deger atanmadıgı icin yazdırılamaz

        //System.out.println(str2.concat("Java")); deger atanmadıgı ıcın metodla kullanılamaz.

        str2="Java candır";
        System.out.println(str2);//Java candır
        System.out.println(str2.concat("."));//Java candır.

        String str3=null;//str3' edeger atanmamıstır.
        //null pointer ile javaya deger atamadıgımızın farkında oldugumuzu soyluyoruz.

        System.out.println(str3);//null ışaretlendıgını yazdırır.


        // System.out.println(str3.concat("Java"));//NullPointerException

        System.out.println(str3 +"Java");//nullJava

        System.out.println(str3.toUpperCase());//NullPointerException




    }
}
