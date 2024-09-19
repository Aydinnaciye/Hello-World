package day11_stringManipulation;

public class C02_Replace {

    public static void main(String[] args) {

        String str="Java candır";

        System.out.println(str.replace('a','A'));//JAVA cAndır

        System.out.println(str.replace(' ','_'));//Java_candır

        System.out.println(str.replace("candır","cok guzeldır"));//Java cok guzeldır

        System.out.println(str.replace(" ",""));//Javacandır

        //Stringdeki tum a ları new sılın()
        System.out.println(str.replace("a",""));//Jv cndır

        //Java yerine Hava,candır yerıne cok guzel yazdıralım

        System.out.println(str.replace("Java","Hava").
                replace("candır","cok guzel"));//Hava cok guzel

        System.out.println(str.replaceFirst("","_"));//_Java candır
        System.out.println(str.replace("","_"));//_J_a_v_a_ _c_a_n_d_ı_r_

        //sadece 1. a'yı A yapın.

        System.out.println(str.replaceFirst("a","A"));//JAva candır

    }
}
