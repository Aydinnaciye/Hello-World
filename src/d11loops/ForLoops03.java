package d11loops;

public class ForLoops03 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
        Week: 1
        Day: 1;
        Day:2;
        Day:3
        ...
        Week:2;
        Day:1;
        Day:2;
        ....
         */

        for (int i=1; i <5; i++){//1 ayda 4 hafta var
            System.out.println("Week:" +i);

            for (int j= 0; j < 8; j++){ //1 haftada 7 gün var
                System.out.println("    Day: " + j);
            }//forun kapanis süslü parantezi bizi artirma veya azaltmaya götürür.

        }
    }
}
