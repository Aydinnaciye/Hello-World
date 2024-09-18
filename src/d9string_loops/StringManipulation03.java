package d9string_loops;

public class StringManipulation03 {
    public static void main(String[] args) {

        /*Ornek1: Bir parolanin asagidaki kosullara sahip olup olmadigini kontrol edin
        1-Parola hicbirsey girilmeden gecilmemeli,en az bir karakter icermelidir
        2-Karakterler sadece (space) bosluk karakterlerden ibaret olmamali,space harici karakterler de bulunmali
        3-Basinda ve sonunda bosluk olmamalidir.

        NOT:isEmpty() metodu sadece hicligi kontrol eder(true verir)
         */
        // 1-Parola hicbirsey girilmeden gecilmemeli,en az bir karakter icermelidir
        String  pwd ="";//true (hicligi yakalar)
        boolean first =pwd.isEmpty();
        System.out.println(first);//true

        //2-Karakterler sadece (space) bosluk karakterlerden ibaret olmamali,space harici karakterler de bulunmali
        //space harici karakterlerde bulunmalidir
        boolean second = pwd.isBlank();
        System.out.println(second);//true

        //3-Basinda ve sonunda bosluk olmamalidir.
        boolean third = pwd.trim().equals(pwd);
        System.out.println(third);//true
        if (first){
            System.out.println("Parola hic birsey yazmadan gecilemez");
        }
        if (second){
            System.out.println("Parola bos birakilmamali ve bosluk harici karakterler de bulunmalidir.");
        }
        if (!third){
            System.out.println("Parolanin basinda ya da sonunda bosluk birakilmamalidir");
        }
    }
}
